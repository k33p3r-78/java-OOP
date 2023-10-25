package lesson1;

import java.time.LocalDate;

public class DepositAccount extends Account {
    protected LocalDate lastCheckOut;

    public DepositAccount(int balance) {
        super(balance);
        this.lastCheckOut = null;
    }

    public DepositAccount() {
        super(0);
        this.lastCheckOut = null;
    }

    @Override
    public void take(int amount) {
        LocalDate monthAgo = LocalDate.now().minusMonths(1);
        if (this.lastCheckOut == null || monthAgo.isAfter(this.lastCheckOut)) {
            super.take(amount);
            this.lastCheckOut = LocalDate.now();
        } else {
            throw new UnsupportedOperationException("You can get money from deposite once a month.");
        }
    }
    
}
