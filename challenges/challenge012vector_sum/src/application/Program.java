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
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		double sum = 0;
		System.out.print("Valores =");
		for (int i=0; i<vect.length; i++) {
			System.out.print(" " + vect[i]);
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.println("\n\nSum = " + sum);
		System.out.println("Average = " + avg);
		
		sc.close();
	}

}
