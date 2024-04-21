package POPII_2019;

public class BankAccount {
    int balance;
    int minBalance;
    int maxBalance;
    BankAccount(int initialBalance ) {
        balance = initialBalance;
        minBalance = initialBalance;
        maxBalance = initialBalance;
    }
    public int getBalance() {
        return balance;
    }
    public void updateBalance( int newBalance ) {
        balance = newBalance;
        if (balance > maxBalance) {
            maxBalance = balance;
        } else if (balance < minBalance) {
            minBalance = balance;
        }
    }
    public int getMin() {
        return minBalance;
    }
    public int getMax() {
        return maxBalance;
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
        BankAccount b = new BankAccount( 10 );
        b.updateBalance( 20 );
        b.updateBalance( 5 );
        System.out.println( "" + b.getMin() + " " + b.getMax() );

        BankAccount c = new BankAccount( 10 );
        c.updateBalance( 2 );
        c.updateBalance( 5 );
        System.out.println( "" + c.getMin() + " " + c.getMax() );
    }
}
