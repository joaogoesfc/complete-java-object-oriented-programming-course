package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	public static void processContract(Contract contract, int months, OnlinePaymentService service) {
		LocalDate dueDate = contract.getDate();
		double baseInstallment = contract.getTotalValue() / months;
		for(int i = 1; i<=months; i++) {
			double interest = service.interest(baseInstallment, i);
			double installment = baseInstallment  + interest + service.paymentFee(baseInstallment + interest);
			dueDate = dueDate.plusMonths(1);
			contract.addInstallment(new Installment(((LocalDate) dueDate), installment));
		}
	}
}
