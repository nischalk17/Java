public class Main {
    public static void main(String[] args) {

//        Car car1 = new Car("Lamborghini", "Black");
//        Car car2 = new Car("Ferrari", "Red");
//        Car car3 = new Car("Mustang", "Green");
//
//        Car[] cars = new Car[3];
//        Car[] cars = {car1, car2, car3};
//
//        for(int i =0; i < cars.length; i++){
//            cars[i].drive();
//        }

//        Rather than doing the above method i.e. instead of first instantiating the objects
//        then assigning to the array, for each element we are going to call the car Constructor
//        with the new keyword then pass in the details for each car with necessary arguments without
//        giving the unique identifier like car1, car2 ... These are called anonymous Objects

        new Car("Lamborghini", "Black");
        new Car("Ferrari", "Red");
        new Car("Mustang", "Green");

        Car[] cars = new Car[]{new Car("Lamborghini", "Black"),
                                new Car("Ferrari", "Red"),
                                new Car("Mustang", "Green")
                            };

        for(Car car : cars) {           //Change color of each car using for each loop
            car.color = "black";
        }

        for(Car car : cars) {
            car.drive();
        }

    }
}
