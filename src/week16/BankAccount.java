package week16;

public class BankAccount {
    private int balance;

    public int getBalance() {
        return balance;
    } // single atomic operation, do not need to synchronize

    public synchronized void deposit(int money) {
        balance = balance + money;
    }

    public synchronized int retrieve(int money) {
        int result = 0;
        if (balance > money) {
            result = money;
        } else {
            result = balance;
        }
        balance = balance - result;
        return result;
    }
}
