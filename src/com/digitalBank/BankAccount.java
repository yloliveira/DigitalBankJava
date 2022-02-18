package com.digitalBank;

abstract class BankAccount implements IBankAccount {
	private static int DEFAULS_BRANCH = 1;
	private static int ACCOUNT_SEQUENTIAL = 1;	
	protected AccountHolder holder;	
	protected int branch;
	protected int account;
	protected double balance;
	
	public BankAccount(AccountHolder holder) {
		this.holder = holder;
		this.branch = DEFAULS_BRANCH;
		this.account = ACCOUNT_SEQUENTIAL++;
	}
	
	public String getHolderName() {		
		return this.holder.getName();
	}
	
	public double getBranch() {		
		return this.branch;
	}
	
	public double getAccount() {		
		return this.account;
	}

	public double getBalance() {		
		return this.balance;
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
}
