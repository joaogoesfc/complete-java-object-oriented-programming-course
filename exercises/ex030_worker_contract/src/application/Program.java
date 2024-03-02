package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter departament's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		/*
		WorkerLevel level;
		do {
			System.out.print("Level: ");
			level = WorkerLevel.parse(sc.next());
			if (level == null) System.out.println("JUNIOR, MID_LEVEL ou SENIOR?"); 
		} while(level == null);
		*/
		System.out.print("Level: ");
		String level = sc.next();
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Enter contract #%d data: \n", (i + 1));
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			System.out.print("Value per hour: ");
			Double hour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			
			worker.addContract(new HourContract(date, hour, duration));
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthYear + ": " +String.format("%.2f", worker.income(year, month)));
		sc.close();
	}

}
