public class Main {

    public static void main(String[] args) {

//    toString(): It is a Method inherited from the object class
//    Used to return String representation of an object if you were to O/P directly using sout
//    The default behavior of the toString Method is that it returns a hash code as a unique
//    identifier for the object but it can be overridden to provide meaningful details
//    Object inherits from the Object class; the Object class has a toString() but it can be overridden
//    so that when you print an object directly, you can display meaningful details of that object
//    instead of displaying a hash code tom print the object

        Car car1 = new Car("Ford", "Mustang", 2025, "Black");
        Car car2 = new Car("Ford", "Corvette", 2024, "Red");

        System.out.println(car1);
        System.out.println(car2);

//        Instead of doing the following:
//        System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);
//        Override it

    }
}
