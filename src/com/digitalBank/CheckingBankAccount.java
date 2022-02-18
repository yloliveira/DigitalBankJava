package com.digitalBank;

public class CheckingBankAccount extends BankAccount {
	public CheckingBankAccount(AccountHolder holder) {
		super(holder);
	}

	public void printStatement() {
		System.out.println("*** Checking Bank Account Statement ***");
		System.out.println(String.format("Holder: %s", this.holder.getName()));
		System.out.println(String.format("Branch: %d", this.branch));
		System.out.println(String.format("Account: %d", this.account));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
}
