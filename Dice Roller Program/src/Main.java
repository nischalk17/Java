import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // DICE ROLLER PROGRAM

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.println("Enter the number of dice you want to roll:");
        numOfDice =  scanner.nextInt();

        if(numOfDice > 0){
            for(int i =0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                System.out.println("You rolled: " + roll);
                total += roll;                     //total + roll;
                System.out.println("The ");
            }
        }
        else {
            System.out.println("Number of dice to be rolled must be greater than 0!");
        }

        scanner.close();

    }
}
