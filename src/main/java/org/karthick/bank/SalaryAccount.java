package org.karthick.bank;

import lombok.ToString;

@ToString
public class SalaryAccount extends  Account{

    private Double minimumBalance;

    private float interestRate;

    public SalaryAccount(String accountNo, Double balance, Double minimumBalance, float interestRate, User user) {
        super(accountNo, balance, user);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
    }

    @Override
    public void deposit(Double amount) {
        super.deposit(amount);
    }
}
