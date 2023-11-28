package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    void testGetBalance() {
        Account testAccount = new Account();
        testAccount.put(100);
        Assertions.assertEquals(100, testAccount.getBalance());
    }
}
