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
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;                     //total + roll
            }
            System.out.println("\nTotal: " + total);
        }
        else {
            System.out.println("Number of dice to be rolled must be greater than 0!");
        }
        scanner.close();
    }

    static void printDie(int roll){

        // for bullet point, win + r and then type charmap and select bullet point
        String dice1 = """      
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        // triple quote for multi-line string

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid Roll!");
        }

    }
}
