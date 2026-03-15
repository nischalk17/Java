//// Custom exception class
//class MyCheckedException extends Exception {
//    public MyCheckedException(String message) {
//        super(message); // pass message to parent constructor
//    }
//}
//
//public class CustomCheckedDemo {
//    public static void main(String[] args) {
//        try {
//            checkNumber(-5);
//        } catch (MyCheckedException e) {
//            System.out.println("Caught custom exception: " + e.getMessage());
//        }
//    }
//
//    static void checkNumber(int num) throws MyCheckedException {
//        if (num < 0) {
//            throw new MyCheckedException("Number cannot be negative!");
//        }
//        System.out.println("Number is valid: " + num);
//    }
//}
