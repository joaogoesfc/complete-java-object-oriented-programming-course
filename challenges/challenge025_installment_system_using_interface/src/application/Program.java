package application;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy)");
		LocalDate date = LocalDate.parse(sc.next(), Contract.fmt);
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		Contract contract = new Contract(number, date, value);
		
		System.out.println("Enter with the number of installments; ");
		int installments = sc.nextInt();
		
		ContractService.processContract(contract, installments, new PaypalService());
		
		System.out.println();
		System.out.println("Installments; ");
		contract.printInstallments();
		
	}

}
