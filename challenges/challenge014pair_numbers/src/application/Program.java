package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		int pair = 0;
		double sum = 0;
		System.out.print("Value =");
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				pair ++;
				sum += vect[i];
				System.out.print(" " + vect[i]);
			}
		}
		
		System.out.println("\nSum = " + sum);
		System.out.println("Average = " + sum / pair);
		
		sc.close();
	}

}
