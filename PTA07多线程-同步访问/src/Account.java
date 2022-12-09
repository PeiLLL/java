import java.util.IllformedLocaleException;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }

    synchronized void deposit(int money){
        balance+=money;
        notify();
    }
    synchronized void withdraw(int money) {
        while (balance - money < 0)
            try {
                wait();
            } catch (InterruptedException e) {
            }

        balance -= money;
        notify();
    }
}
