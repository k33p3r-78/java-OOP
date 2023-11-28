package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {
    @Test
    void testTake() {
        CreditAccount testCreditAccount = new CreditAccount(100);
        testCreditAccount.take(8);
        Assertions.assertEquals(100 - (int) (1.01 * 8), testCreditAccount.getBalance());
    }
}
