import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        int playerScore = 0;

        do {
            System.out.println("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("INVALID CHOICE!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            }

//          cannot do if playerChoice == computerChoice because it would be comparing
//          memory addresses since array is a reference type

            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You Win!");
                playerScore++;
            }

            else {
                System.out.println("You Lose!");
            }

            System.out.println("Play again (yes/no):");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println();
        System.out.println("Your total score is: " + playerScore);

        System.out.println("******************");
        System.out.println("Thanks for playing");
        System.out.println("******************");

        scanner.close();
    }
}
