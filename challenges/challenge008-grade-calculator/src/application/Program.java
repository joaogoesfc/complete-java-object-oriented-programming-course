package application;

import java.util.Locale;
import java.util.Scanner;

import intities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		s.name = sc.nextLine();
		s.quarter1 = sc.nextDouble();
		s.quarter2 = sc.nextDouble();
		s.quarter3 = sc.nextDouble();
		
		System.out.println("Final grade = " + s.finalGrade());
		if (s.finalGrade() < 60) {
			System.out.printf("Failed\nMissing %.2f points", s.missingPoints());
		} else {System.out.println("Pass");}
		
		sc.close();
	}

}
