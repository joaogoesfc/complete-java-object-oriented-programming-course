package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nRent #%d:\n", i + 1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms:");
		for(int i=0; i<9; i++) {
			if(rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		sc.close();
	}
}
