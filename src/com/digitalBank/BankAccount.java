package com.digitalBank;

class BankAccount implements IBankAccount {
	protected AccountHolder holder;	
	private int branch;
	private int account;
	private double balance;
	
	public BankAccount(AccountHolder holder) {
		this.holder = holder;
	}
	
	public void deposit(double amount) {
		this.balance += amount;	
	}

	public void withdraw(double amount) {
		this.balance -= amount;		
	}

	public void transfer(double amount, BankAccount destinationAccount) {
		this.withdraw(amount);
		destinationAccount.deposit(amount);		
	}

	public double getBalance() {		
		return this.balance;
	}

	public void printStatement() {
		System.out.println("*** Bank Account Statement ***");
		System.out.println(String.format("Holder: %s", this.holder.getName()));
		System.out.println(String.format("Branch: %d", this.branch));
		System.out.println(String.format("Account: %d", this.account));
		System.out.println(String.format("Balance: %.2f", this.balance));		
	}
}
