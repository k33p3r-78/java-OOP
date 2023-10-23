package lesson1;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Account maria = new Account();

        maria.put(1000);
        maria.take(234);
        System.out.println(maria.getBalance());

        CreditAccount petrCreditAccount = new CreditAccount();

        petrCreditAccount.put(500);
        petrCreditAccount.take(200);
        System.out.println(petrCreditAccount.getBalance());

        DepositAccount ivanDepositAccount = new DepositAccount();
        ivanDepositAccount.put(200);
        ivanDepositAccount.take(10);
        // ivanDepositAccount.take(5);
        System.out.println(ivanDepositAccount.getBalance());

    }
}