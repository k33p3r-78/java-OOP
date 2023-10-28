package lesson2;

public abstract class AbstractAccount implements Account {
    
    private Double balance;

    public AbstractAccount(Double balance) {
        this.balance = balance;
    }

    public AbstractAccount(Integer balance) {
        this.balance = Double.valueOf(balance);
    }

    public AbstractAccount() {
        this(0);
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void put(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Error: amount can not be negative.");
        } else {
            this.balance += amount;
        }
    }

    @Override
    public void take(double amount) {
        if (amount < 0 || this.balance < amount) {
            throw new IllegalArgumentException("Error: amount can not be negative or greater then balance.");
        } else {
            this.balance -= amount;
        }
    }

}
