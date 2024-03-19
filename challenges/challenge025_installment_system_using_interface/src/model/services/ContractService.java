package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService service;
	
	
	public ContractService(OnlinePaymentService service) {
		this.service = service;
	}


	public void processContract(Contract contract, int months) {
		
		double baseInstallment = contract.getTotalValue() / months;
		for(int i = 1; i<=months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(1);
			double interest = service.interest(baseInstallment, i);
			double installment = baseInstallment  + interest + service.paymentFee(baseInstallment + interest);
			contract.addInstallment(new Installment(((LocalDate) dueDate), installment));
		}
	}
}
