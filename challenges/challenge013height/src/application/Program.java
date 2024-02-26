package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		
		Person[] p = new Person[n];
		
		int under16 = 0;
		double sum = 0.0;
		for (int i=1; i<=p.length; i++) {
			System.out.printf("%dth person data: \n", i);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			sum += height;
			if (age < 16) under16 ++;
			p[i - 1] = new Person(name, age, height);
		}
		double avg = sum / p.length;
		double avgH = (double) under16 / n * 100;
		System.out.printf("Average height: %.2f\n", avg);
		System.out.printf("People under 16: %.0f%s\n", avgH, "%");
		
		for(int i=0; i< p.length; i++) {
			if(p[i].getAge() < 16) System.out.println(p[i].getName());
		}
		sc.close();
	}

}
