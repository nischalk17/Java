class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    double getFuelEfficiency() {
        return 0;
    }
    double getDistanceTraveled(double fuel) {
        return fuel * getFuelEfficiency();
    }
    double getMaxSpeed() {
        return 0;
    }
    void printInfo() {
        System.out.println("----- Vehicle Info -----");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Fuel Efficiency: " + getFuelEfficiency() + " km/l");
        System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
        System.out.println();
    }
}
class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    double getFuelEfficiency() {
        return 5;
    }
    double getMaxSpeed() {
        return 120;
    }
}
class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    double getFuelEfficiency() {
        return 15;
    }

    double getMaxSpeed() {
        return 200;
    }
}
class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    double getFuelEfficiency() {
        return 30;
    }
    double getMaxSpeed() {
        return 180;
    }
}
public class Lab2b {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Tata", "Heavy Duty", 2020, "Diesel");
        Vehicle car = new Car("Tesla", "Model S", 2023, "Electric");
        Vehicle bike = new Motorcycle("Honda", "CBR", 2022, "Petrol");
        truck.printInfo();
        car.printInfo();
        bike.printInfo();
    }
}
