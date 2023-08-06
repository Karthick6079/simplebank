package org.karthick.bank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingsAccount extends Account{

    private Double minimumBalance;

    private int interestRate;

    public SavingsAccount(String accountNo, Double balance, Double minimumBalance, int interestRate, User user) {
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
