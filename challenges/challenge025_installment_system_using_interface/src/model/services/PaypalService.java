package model.services;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {
		double aux = 0.01 * months;
		return amount * aux;
	}

}
