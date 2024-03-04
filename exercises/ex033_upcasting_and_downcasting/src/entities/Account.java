package entities;

public class Account {
	private Integer number;
	private String holder;
	protected double balance;
	
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		deposit(balance);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		balance -= amount;
	}
}