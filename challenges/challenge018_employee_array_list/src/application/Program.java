package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import intities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be entered? ");
		int n = sc.nextInt();
		List<Employee> li = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (i + 1));
			
			int id = enterId(li, sc);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			li.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the id that awill have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = li.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double p = sc.nextDouble();
			emp.IncreaseSalary(p);
		}
		
		System.out.println();
		listOfEmployees(li);
		
		sc.close();
	}
	
	public static void listOfEmployees(List<Employee> li) {
		System.out.println("List of employees:");
		for(Employee list : li) System.out.println(list);
	}
	
	public static int enterId(List<Employee> li, Scanner sc) {
		Employee emp;
		int code;
		do {
			System.out.print("Id: ");
			int id = sc.nextInt();
			code = id;
			emp = li.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (emp != null) System.out.println("This id have been taken! try again.");
		} while (emp != null);
		return code;
	}

}
