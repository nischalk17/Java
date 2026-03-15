package CreateThreadClass;

public class ThroughClassTwo extends Thread{
    @Override
    public void run(){
        for(int i  = 1; i<= 10000; i++){
            System.out.println("%d", i);
        }

}
