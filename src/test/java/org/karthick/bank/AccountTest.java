package org.karthick.bank;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AccountTest {

    Account account;

    User user;

    Address address;

    @BeforeAll
    void beforeAll() {
        address = new Address("2/12, Muthuraman street, KK nagar, Chennai","600078",false);
        user = new User("Karthick","V", "DSHYT12345", "karthick.v@gmail.com", "9912114432", address);
        account = new SalaryAccount("2023123",10000.00, 0.00, 2.25F, user);
        System.out.println("The account object is created " + account.toString());

    }
    @Test
    @DisplayName("Withdraw one thousand, The balance should be nine thousand")
    void withdrawOneThousandBalanceShouldRemainNineThousand(){
        account.withdraw(1000.00);
        assertEquals(10000, account.getBalance());
    }

    @Test
    @DisplayName("Throw exception when withdraw amount is greater than balance")
    void throwExceptionWhenWithdrawAmountGreaterThanBalance(){
        assertThrows(RuntimeException.class, ()->{
            account.withdraw(11000.00);
        });
    }

    @Test
    @DisplayName("Throw exception when withdraw amount is less than zero")
    void throwExceptionWhenWithdrawAmountLessThanZero(){
        assertThrows(RuntimeException.class, ()->{
            account.withdraw(-11000.00);
        });
    }

    @Test
    @DisplayName("Throw exception when deposit amount is less than zero")
    void throwExceptionWhenDepositAmountLessThanZero(){
        assertThrows(RuntimeException.class, ()->{
            account.deposit(-11000.00);
        });
    }

    @Test
    @DisplayName("Deposit one thousand, The balance should be eleven thousand")
    void depositOneThousandBalanceShouldRemainNineThousand(){
        account.deposit(1000.00);
        assertEquals(11000, account.getBalance());
    }
}