package org.example.bank;

public class Account implements IAccount{
    private int balance;
    public Account(int startBalance){
        balance = startBalance;

    }
    @Override
    public int getBalance(){
        return  balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }
}
