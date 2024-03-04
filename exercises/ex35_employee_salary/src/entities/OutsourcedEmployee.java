package entities;

public class OutsourcedEmployee extends Employee {

	private double additionalCharge;

	public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double calcPayment() {
		payment = super.calcPayment() + additionalCharge * 1.1;
		return payment;
	}
}
