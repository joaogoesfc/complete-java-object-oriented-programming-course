package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> list = new HashSet<>();
		List<Integer> courseAstudents = new ArrayList<>();
		List<Integer> courseBstudents = new ArrayList<>();
		List<Integer> courseCstudents = new ArrayList<>();
		
		includeStudent("A", courseAstudents, sc);
		includeStudent("B", courseBstudents, sc);
		includeStudent("C", courseCstudents, sc);
		
		list.addAll(courseCstudents);
		list.addAll(courseBstudents);
		list.addAll(courseAstudents);
		
		System.out.printf("You have a total of %d students", list.size());
		sc.close();
	}
	
	public static void includeStudent(String name, List<Integer> course, Scanner sc) {
		System.out.printf("How many students for course %s? ", name);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			course.add(s);
		}
	}

}
