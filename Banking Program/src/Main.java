import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    // making it class scope such that all the methods can use it
    // But it needs to be static since some static method are using it


    public static void main(String[] args) {

        // BANKING PROGRAM

        int choice;
        double balance = 0;
        boolean isRunning = true;


        while(isRunning) {
            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();             //balance + deposit();
                case 3 -> balance -= withdraw(balance);     //balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!!!");
            }
        }

        System.out.println("***************************");
        System.out.println("Thank You! Have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }


    static void showBalance(double balance){
        System.out.println("****************");
        System.out.printf("$%,.2f\n", balance);
    }

    static double deposit(){
        double amount;

        System.out.println("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative!!!");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.println("Enter the amount you want to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS!!!");
            return 0;
        }
        else if (amount <  0) {
            System.out.println("Amount cannot be negative!!!");
            return 0;
        }
        else {
            return amount;
        }
    }

}
