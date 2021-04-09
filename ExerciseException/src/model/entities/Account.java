package model.entities;

import model.exceptions.BankAccountExceptions;

public class Account {
	
	public Integer number;
	public String holder;
	public Double balance;
	public Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if(withdrawLimit < amount) {
			throw new BankAccountExceptions("The withdrawal amount is greater than the daily limit");
		}
		if(balance < amount) {
			throw new BankAccountExceptions("Insufficient balance for the requested amount");
		}

		this.balance -= amount;
	}
}
