public class Student extends Person{

    double gpa;

    Student(String first, String last, double gpa){

//        Any arg that the parent requires, we have to send the parent these args
//        from the child Constructor using super keyword

        super(first, last);     // Imagine we are replacing Person with super keyword
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + " " + this.last + "'s GPA is: " + this.gpa);
    }
}
