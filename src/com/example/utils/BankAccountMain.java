package com.example.utils;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.deposit(1000);
		account.deposit(-500);
		
		System.out.println("残高は" + account.getBalance());
	}

}
