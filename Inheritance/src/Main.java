public class Main {
    public static void main(String[] args) {

//        Inheritance means one class inherits the attributes & methods from another class.
//        Child(Derived) class inherits from Parent(Base) class

//        Organism
//        /       \
//        Plant   Animal
//                /     \
//              Dog     Cat


        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        plant.photosynthesize();
    }
}
