package lesson2;

public class FixedBalanceAccount extends AbstractAccount {

    public FixedBalanceAccount(Double balance) {
        super(balance);
    }

    public FixedBalanceAccount() {
        throw new IllegalArgumentException("Trying to create zero FixedAccount. If sure use explicit constuctor. eg. FixedBalanceAccount(0.0)");
    }

    @Override
    public void put(double amount) {
        return;
    }

    @Override
    public void take(double amount) {
        return;
    }
    
    
}
