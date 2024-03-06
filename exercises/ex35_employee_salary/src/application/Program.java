package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print(" Enter the number of employees: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i ++) {
			System.out.printf("Employee#%d data: ", i);
			System.out.print("Outsourced(y/n)? ");
			char outsourced  = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(outsourced == 'y') {
				System.out.print("Additionalcharge: ");
				double additional = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hour, valuePerHour, additional);
				employees.add(employee);
			} else {
				Employee employee = new Employee(name, hour, valuePerHour);
				employees.add(employee);
			}
		}
		System.out.println();
		for(Employee list : employees) {
			System.out.println(list.getName() + " - $ " + list.calcPayment());
		}	
		sc.close();
	}
}
