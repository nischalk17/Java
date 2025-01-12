import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        // this exception typically occurs when a thread running the method is
        // interrupted while it is sleeping, waiting, or otherwise paused
        // in its execution.

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){
            System.out.println(i);

            // using thread class sleep method and passing the number of millisecond we
            // would like our program to sleep

            // for this, we need to throw exception if our thread is interrupted
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}
