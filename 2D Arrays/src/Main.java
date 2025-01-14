public class Main {

    public static void main(String[] args) {

//        2D array is an array where each element is an array
//        It is useful for storing a matrix of data

        String[] fruits = {"apple", "banana", "orange"};
        String[] vegetables = {"potato", "spinach", "cauliflower"};
        String[] meat = {"chicken", "mutton", "lamb", "fish"};


//         String[][] groceries = {{"apple", "banana", "orange"},
//         {"potato", "spinach", "cauliflower"},
//         {"chicken", "mutton", "lamb", "fish"}};

        String[][] groceries = {fruits, vegetables, meat};

        groceries[0][0] = "pineapple";
        groceries[1][2] = "mushroom";
        groceries[2][2] = "eggs";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
