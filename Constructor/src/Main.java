public class Main {
    public static void main(String[] args) {

        // Constructor is a special method used to initialize objects
        // Can pass args to a constructor & set up initial values

        Student student1 = new Student("Nischal", 22, 3.65);
        Student student2 = new Student("Dhoj", 23, 3.75);
        Student student3 = new Student("Kunwar", 24, 4.0);

        student1.info();
        student2.info();
        student3.info();
    }
}
