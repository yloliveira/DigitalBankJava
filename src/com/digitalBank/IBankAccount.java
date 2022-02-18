package com.digitalBank;

public interface IBankAccount {
	void deposit(double amount);
	void withdraw(double amount);
	void transfer(double amount, BankAccount destinationAccount);
	double getBalance();
	void printStatement();
}
