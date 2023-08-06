package org.karthick.bank;

import lombok.Data;
import lombok.ToString;

@ToString
public abstract class Account {

    private String accountNo;

    private Double balance;

    private User user;

    public Account(String accountNo, Double balance, User user) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.user = user;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void withdraw(Double amount){
        if (amount <= 0)
            throw new IllegalArgumentException("Illegal Argument");
        if( amount > this.balance)
            throw new RuntimeException("Insufficient Balance");

        this.balance = this.balance - amount;
    }

    public void deposit(Double amount){
        if (amount <= 0)
            throw new IllegalArgumentException("Illegal Argument");

        this.balance = this.balance + amount;
    }




}
