package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid value, it isn't a integer number");
		}

		System.out.println("End of program");
		
		
		sc.close();
	}

}
