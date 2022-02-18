package com.digitalBank;

public interface IBankAccount {
	String getHolderName();
	double getBranch();
	double getAccount();
	double getBalance();
	void deposit(double amount);
	void withdraw(double amount);
	void transfer(double amount, BankAccount destinationAccount);	
	void printStatement();
}
