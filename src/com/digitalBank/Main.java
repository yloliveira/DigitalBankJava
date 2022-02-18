package com.digitalBank;

public class Main {
	public static void main(String[] args) {
		AccountHolder holder = new AccountHolder("Yan Oliveira");
		BankAccount checkingAccount = new CheckingBankAccount(holder);	
		BankAccount savingsAccount = new SavingsBankAccount(holder);	
		checkingAccount.printStatement();
		savingsAccount.printStatement();
		
		checkingAccount.deposit(1000);
		checkingAccount.withdraw(100);
		checkingAccount.transfer(200, savingsAccount);
		
		savingsAccount.deposit(100);
		savingsAccount.withdraw(10);
		
		checkingAccount.printStatement();
		savingsAccount.printStatement();		
	}
}
