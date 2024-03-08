package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Inicial balance: ");
			double inicialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, inicialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid value!" + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
