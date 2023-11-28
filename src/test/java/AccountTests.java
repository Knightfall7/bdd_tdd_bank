import org.example.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTests {
    private Account account;
    @BeforeEach
    void setup(){
        account = new Account(100);
    }
    @Test
    public void testDeposit(){
        account.deposit(50);
        assertEquals(150, account.getBalance(), "balance should be 150 after depositing");
    }
}
