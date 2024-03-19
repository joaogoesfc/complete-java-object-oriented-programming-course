package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class Contract {

	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private int number;
	private LocalDate date;
	private double totalValue;
	
	private List<Installment> installments = new ArrayList<>();

	public Contract(int number, LocalDate date, double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void printInstallments() {
		for(Installment list: installments) {
			System.out.println(list.getDueDate().format(fmt) + " - " + String.format("%.2f", list.getAmount()));
		}
	}
	
	public void addInstallment(Installment installment) {
		installments.add(installment);
	} 
	
}