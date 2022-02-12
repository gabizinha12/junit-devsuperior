package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {

	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.00);
		acc.deposit(amount);
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}

	public void depositShouldDoNothingWhenNegativeAmount() {
		double expectedValue = 100;
		Account acc = new Account(1L, 0.00);
		double amount = -200.0;
		acc.deposit(amount);
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
}