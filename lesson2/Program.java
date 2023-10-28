package lesson2;

public class Program {

    public static void main(String[] args) {
        FixedBalanceAccount fBalanceAccount1 = new FixedBalanceAccount(1000.50);
        FixedBalanceAccount fBalanceAccountZero = new FixedBalanceAccount(0);
        
        System.out.println(fBalanceAccount1.getBalance());
        System.out.println(fBalanceAccountZero.getBalance());
        fBalanceAccount1.put(100.10);
        fBalanceAccountZero.take(100);
        System.out.println(fBalanceAccount1.getBalance());
        System.out.println(fBalanceAccountZero.getBalance());
    }
    
}
