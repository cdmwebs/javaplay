package com.twentysixwebs.screencast;

import static org.junit.Assert.*;
import org.junit.*;

public class _SavingsAccountTest {

	private static SavingsAccount account;

	@BeforeClass
	public static void setUp() {
		account = new SavingsAccount();
	}
	
	@Test
	public void makeDeposit() {
		account.deposit(100);
		assertEquals(100, account.balance());
	}
	
	@Test
	public void makeWithdrawal() {
		account.withdrawal(50);
		assertEquals(50, account.balance());
	}
	
	@Test
	public void negativeBalanceIsJustFine() {
		account.withdrawal(500);
		assertEquals(-450, account.balance());
	}
}
