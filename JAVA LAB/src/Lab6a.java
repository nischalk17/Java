class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
class OddThread extends Thread {
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
public class Lab6a {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        odd.start();
        try {
            odd.join(); // wait until odd thread finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        even.start();
    }
}
