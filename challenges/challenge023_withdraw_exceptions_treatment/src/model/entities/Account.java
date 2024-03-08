package model.entities;

import model.exceptions.DomainException;

public class Account {

	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) throws DomainException {
		balance+= amount;
	}
	
	public void withdraw(double amount)throws DomainException {
		if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance-= amount;
	}
}
