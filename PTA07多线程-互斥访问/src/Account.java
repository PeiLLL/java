public class Account {
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int money){
        this.balance = balance+money;
    }

    public synchronized void withdraw(int money){
        this.balance = balance-money;
    }
}

