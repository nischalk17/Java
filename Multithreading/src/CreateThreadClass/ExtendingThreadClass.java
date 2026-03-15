package CreateThreadClass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ThroughClassOne t1 = new ThroughClassOne();
        ThroughClassTwo t2 = new ThroughClassTwo();
        ThroughClassThree t3 = new ThroughClassThree();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\n Initial time taken by %s: %d milliseconds\n" );
            Thread.currentThread().getName(),(endTime - startTime));
    }
}
