package com.example.utils;

public class BankAccount {
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
		} else {
			System.out.println("入金額は0より大きい値にしてください");
		}
	}
}
