package java_data_entry;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("You typed: " + x);
	
		sc.close();
	}

}
