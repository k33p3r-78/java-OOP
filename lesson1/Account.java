package lesson1;

public class Account {
    protected int balance;

    public Account(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("Balance can not be less then zero.");
        }
    }

    public Account() {
        this(0);
    }

    public int getBalance() {
        return balance;
    }

    public void put(int amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        } else {
            throw new IllegalArgumentException("Amount should be positive.");
        }
    }

    public void take(int amount) {
        if (amount > 0) {
            this.balance = this.balance - amount;
        } else {
            throw new IllegalArgumentException("Amount should be positive.");
        }
    }

        
    
}
