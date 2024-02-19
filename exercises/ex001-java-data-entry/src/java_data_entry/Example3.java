package java_data_entry;

import java.util.Locale;
import java.util.Scanner;

public class Example3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		double x;
		x = sc.nextDouble();
		System.out.printf("You typed: %.2f\n", x);
	
		sc.close();
	}

}
