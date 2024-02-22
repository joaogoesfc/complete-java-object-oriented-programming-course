package java_data_entry;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // before a nextLine() use other without a variable to absorb the line break(enter)
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("TYPED DATA:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
		sc.close();
	}

}
