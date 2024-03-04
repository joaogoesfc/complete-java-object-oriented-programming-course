package application;


import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount bacc = new BusinessAccount(1002, "Mary",500.0, 500.00);
		
		SavingsAccount acc = new SavingsAccount(1004, "Anna", 500.0, 0.01);
		
		bacc.withdraw(100.00);
		System.out.println(bacc.getBalance());
		acc.withdraw(100.0);
		acc.updateBalance();
		System.out.println(acc.getBalance());
	}

}
