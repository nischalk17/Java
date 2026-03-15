//An array with an odd number of elements is said to be centered if all elements (except the middle one)
//are strictly greater than the value of the middle element.
//Note that only arrays with an odd number of elements have a middle element.
//Write a function that accepts an integer array and returns 1 if it is a centered array,
//otherwise it returns 0.


public class CenteredArrayCheck {
    public static int isCenteredArray(int[] arr) {
        // Step 1: Check if array length is odd
        if (arr.length % 2 == 0) {
            return 0; // No middle element if even length
        }

        // Step 2: Find middle index
        int midIndex = arr.length / 2;
        int midValue = arr[midIndex];

        // Step 3: Check all elements except middle
        for (int i = 0; i < arr.length; i++) {
            if (i != midIndex && arr[i] <= midValue) {
                return 0; // Found element not greater than middle
            }
        }

        return 1; // All other elements are greater
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 10, 3, 15, 20}; // middle = 3 → centered
        int[] arr2 = {5, 3, 3, 15, 20}; // middle = 3 → not centered
        int[] arr3 = {5, 10, 3, 15}; // even length → not centered

        System.out.println(isCenteredArray(arr1)); // 1
        System.out.println(isCenteredArray(arr2)); // 0
        System.out.println(isCenteredArray(arr3)); // 0
    }
}
