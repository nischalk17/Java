// Abstract class
abstract class Vehicle {
    // abstract method (no body)
    abstract void start();

    // regular method (has body)
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Concrete class extends abstract class
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started with button.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();   // Car started with key
        myCar.stop();    // Vehicle stopped

        Vehicle myBike = new Bike();
        myBike.start();  // Bike started with button
        myBike.stop();   // Vehicle stopped
    }
}