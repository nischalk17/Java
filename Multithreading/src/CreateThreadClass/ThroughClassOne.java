package CreateThreadClass;

public class ThroughClassOne extends Thread{

//    First task
    @Override
    public void run(){
        for(int i  = 1; i<= 10000; i++){
            System.out.println("%d", i);
        }

    }
}
