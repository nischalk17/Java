class BankAccount {
    private double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    public synchronized void deposit(double amount, String threadName) {
        System.out.println(threadName + " is depositing " + amount);
        balance += amount;
        System.out.println(threadName + " successfully deposited. Balance: " + balance);
        System.out.println("----------------------------------------------------");
    }
    public synchronized void withdraw(double amount, String threadName) {
        if (amount <= balance) {
            System.out.println(threadName + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(threadName + " successfully withdrew. Balance: " + balance);
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println(threadName + " tried to withdraw " + amount + " but insufficient balance: " + balance);
            System.out.println("----------------------------------------------------");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class DepositThread extends Thread {
    private BankAccount account;
    private double amount;
    DepositThread(BankAccount account, double amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void run() {
        account.deposit(amount, getName());
    }
}
class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;
    WithdrawThread(BankAccount account, double amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void run() {
        account.withdraw(amount, getName());
    }
}
public class Lab6b {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Thread t1 = new DepositThread(account, 500, "Depositor-1");
        Thread t2 = new WithdrawThread(account, 300, "Withdrawer-1");
        Thread t3 = new DepositThread(account, 200, "Depositor-2");
        Thread t4 = new WithdrawThread(account, 800, "Withdrawer-2");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final account balance: " + account.getBalance());
    }
}
