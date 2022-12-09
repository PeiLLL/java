package P2;

public class BankAccount {
    int balance; //’Àªß”‡∂Ó

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public double withdraw(int amount){
        if(amount <= this.balance)
        balance -= amount;
        return this.balance;
    }
    public double deposit(int amount){
        balance += amount;
        return this.balance;
    }
}
