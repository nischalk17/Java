import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your e-mail: ");
        email = scanner.nextLine();


        if(email.contains("@")) {
            System.out.println("Your username is: " + email.substring(0, email.indexOf("@")));
            System.out.println("Your domain is: " + email.substring(email.indexOf("@") + 1));
        }

        else{
            System.out.println("Emails must contain '@' character");
        }

        scanner.close();
    }
}
