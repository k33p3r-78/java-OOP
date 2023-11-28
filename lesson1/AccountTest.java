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

    @Test
    void testGetBalance2() {
        Account testAccount = new Account();
        testAccount.put(99);
        testAccount.take(9);
        Assertions.assertEquals(90, testAccount.getBalance());
    }
}
