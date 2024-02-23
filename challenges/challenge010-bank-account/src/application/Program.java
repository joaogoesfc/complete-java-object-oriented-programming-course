package application;

import java.util.Locale;
import java.util.Scanner;

import intities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		account = new Account(number, holder, inicialDeposit(sc));
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated data: ");
		System.out.println(account);
		
		System.out.println("\nEnter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
	
	public static double inicialDeposit(Scanner sc) { 
		
		char option = 'a';
		double value = 0.0;
		
		while (option != 'y' && option != 'n') {
			
			System.out.print("Is there an initial deposit (y/n)? ");
			option = sc.nextLine().charAt(0);
			
			switch (option) {
			case 'y':
				System.out.println("Enter initial deposit value: ");
				String input = sc.nextLine();
				value = Double.parseDouble(input);
				break;
			case 'n':
				break;
			default:
				System.out.println("Invalid value");
			}
		}
		return value;
	}


	
}

