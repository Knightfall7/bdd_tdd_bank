package org.example;

import org.example.bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTests {
    private Account account;
    @BeforeEach
    void setup(){

        account = new Account(150);
    }

    @Test
    public void testGetBalance(){
        var expected = 150;
        var actual = account.getBalance();

        assertEquals(expected, actual, "Account balance is 150 dollars");


    }
      @Test
      public void testDeposit(){
        account.deposit(1000);
        var expected = 1150;
        var actual = account.getBalance();
        assertEquals(expected, actual, account.getBalance(), "You made a 1000 dollars deposit");
    }

}
