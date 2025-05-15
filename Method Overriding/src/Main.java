import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

//        When a subclass provides an own implementation of a method that is
//        already defined, then it is known as Method Overriding
//        Allows for code reusability and give specific implementations.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
