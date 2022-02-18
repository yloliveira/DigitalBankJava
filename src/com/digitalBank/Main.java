package com.digitalBank;

public class Main {
	public static void main(String[] args) {
		AccountHolder holder = new AccountHolder("Yan Oliveira");
		BankAccount account1 = new BankAccount(holder);	
		BankAccount account2 = new BankAccount(holder);	
		account1.printStatement();
		account2.printStatement();
	}
}
