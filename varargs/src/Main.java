public class Main {

    public static void main(String[] args) {

        // varargs allow a method to accept a varying no. of arguments
        // it makes method more flexible and there will be no need for overloaded methods
        // java compiler will pack the arguments into an array and send them to the method
        // then within the context of the method, it works with the array one way or another
        // when setting up the parameters of a method, we declare the datatype
        // and add a suffix of an ellipsis which is 3 dots as ...

        // System.out.println(add(1, 2, 3, 4));
        // System.out.println(average(1, 2, 3, 4));
        System.out.println(average());
    }

//        Example1:
//        static int add(int... numbers){
//
//        int sum = 0;
//        for(int number : numbers){
//            sum += number;          // sum = sum + number
//        }
//        return sum;
//    }


//  Example 2:
    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}