public class Main {

    public static void main(String[] args) {

//        super refers to the Parent class when using Inheritance (subclass <- superclass)
//        Used in constructors and Method Overriding
//        Calls the Parent Constructor to initialize attributes

        Person person = new Person("Nischal", "Kunwar");
        Student student = new Student("Nischal", "Kunwar", 3.65);
        Employee employee = new Employee("Nischal", "Kunwar", 400000);

//        student.showName();
        student.showGPA();
        employee.showSalary();

    }
}
