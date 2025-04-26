public class Car {
    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
