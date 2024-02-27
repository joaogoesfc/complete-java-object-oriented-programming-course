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
		
		double highest = 0;
		int highestPosition = 0;
		for (int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			if (vect[i] > highest) {
				highestPosition = i + 1;
				highest = vect[i];
			}
		}
		
		System.out.println("Highest value = " + highest);
		System.out.println("Highest value position = " + highestPosition);

		sc.close();
	}

}
