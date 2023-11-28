package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DepositAccountTest {
    @Test
    void testTake() {
        DepositAccount tDepositAccount = new DepositAccount(100);
        tDepositAccount.take(9);
        Assertions.assertEquals(91, tDepositAccount.getBalance());
        Assertions.assertThrows(UnsupportedOperationException.class, () -> tDepositAccount.take(10));
    }
}
