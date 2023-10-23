package lesson1;

public class CreditAccount extends Account {

    public CreditAccount(int balance) {
        super(balance);
    }

    public CreditAccount() {
        super(0);
    }
    
    @Override
    public void take(int amount) {
        super.take((int)(amount * 1.01));
    }

}
