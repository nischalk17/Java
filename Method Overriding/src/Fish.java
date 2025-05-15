public class Fish extends Animal{

    @Override       //Annotation-> If the function name is misspelled,
                    // this annotation gives warning to notify no overwriting has been done
    void move(){
        System.out.println("This animal is swimming");
    }
}
