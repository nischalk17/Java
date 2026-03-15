import java.io.*;

public class CheckedUncheckedExample {
    public static void main(String[] args) {
        // Unchecked Exception (Runtime Exception)
        try {
            int result = 10 / 0; // Division by zero → ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e.getMessage());
        }

        // Checked Exception (Must be handled or declared)
        try {
            FileReader fr = new FileReader("nonexistent.txt"); // File not found → Checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
