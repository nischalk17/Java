import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = readNumber();
        int j = readNumber();
        int k = readNumber();

        int sum = i+j+k;
        System.out.println("Sum of the number is: " + sum);
    }

    public static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int first = scanner.nextInt();
        return first;
    }
}


