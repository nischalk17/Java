public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){      // automatically called when its object is initialized
        this.name = name;       //this refers to the OBJECT we are currently working with
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void info(){
        System.out.println(this.name + " is " + this.age + " years old and has scored " + this.gpa);
    }
}
