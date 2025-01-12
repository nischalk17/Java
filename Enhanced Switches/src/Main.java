import java.util.Locale;
import java.util.Scanner;

//Enhanced switch =  A replacement to many else-if statements
//                      (Java 14 feature)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine(); // Read the original input

        switch (day.toLowerCase()) { // Normalize input to lowercase for matching
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println(day + " is a weekday 😖");
            case "saturday", "sunday" ->
                    System.out.println(day + " is the weekend 😊");
            default ->
                    System.out.println(day + " is not a valid day");
        }
    }
}
