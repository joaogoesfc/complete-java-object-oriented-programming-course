package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> people = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.printf("Tax payer#%d data:\n", i);
			
			System.out.print("Individual or company(i/c)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthcare = sc.nextDouble();
				people.add(new PhysicalPerson(name, income, healthcare));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				people.add(new LegalPerson(name, income, employees));
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Person li: people) {
			System.out.println(li);
		}
		
		double sum = 0.0;
		for(Person li: people) {
			sum += li.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum) );
		
		sc.close();
	}
}
