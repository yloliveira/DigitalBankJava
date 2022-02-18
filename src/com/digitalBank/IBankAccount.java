package com.digitalBank;

public interface IBankAccount {
	String getHolderName();
	double getBranch();
	double getAccount();
	double getBalance();
	void deposit(double amount);	
	void withdraw(double amount) throws InsufficientBalanceException;
	void transfer(double amount, BankAccount destinationAccount) throws InsufficientBalanceException;	
	void printStatement();
}
