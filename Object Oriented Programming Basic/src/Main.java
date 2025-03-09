import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();

          Car car = new Car();

//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.price);
//        System.out.println(car.isRunning);

        car.start();
        car.drive();
        car.brake();
        car.stop();

    }
}
