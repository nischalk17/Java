import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max+1);   // first number is inclusive & second number is exclusive


        System.out.println("Welcome to Number Guessing Game");
        System.out.printf("Guess a number between %d-%d:\n ", min, max);

        do{
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again!");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again!");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.printf("You attempted %d times", attempts);
            }
        }while( guess != randomNumber);

        scanner.close();
    }
}
