package intities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	private double withdrawTax;
	
	
	public Account(int accountNumber, String name, double deposit) {
		this.number = accountNumber;
		this.holder = name;
		deposit(deposit);
		withdrawTax = 5.00;
	}
	
	public Account(int accountNumber, String name) {
		this.number = accountNumber;
		this.holder = name;
		withdrawTax = 5.00;
	}

	public int getAccountNumber() {
		return number;
	}

	public String getName() {
		return holder;
	}

	public void setName(String name) {
		this.holder = name;
	}

	public double getBalance() {
		return balance;
	}
	
	
	public double getWithdrawTax() {
		return withdrawTax;
	}

	public void setWithdrawTax(double withdrowTax) {
		this.withdrawTax = withdrowTax;
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		balance -= value;
		balance -= withdrawTax;
	}
	
	
	
	public String toString() {
		return "Account " + number 
				+ ", Holder: " + holder 
				+ ", Balance: $ " + String.format("%.2f", balance); 
	}
	
	
	
	
}
