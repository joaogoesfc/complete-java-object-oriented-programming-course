package entities;

public class PhysicalPerson extends Person{

	private double healthcare;

	public PhysicalPerson(String name, double income, double healthcare) {
		super(name, income);
		this.healthcare = healthcare;
	}

	public double getHealthcare() {
		return healthcare;
	}

	public void setHealthcare(double healthcare) {
		this.healthcare = healthcare;
	}
	
	@Override
	public double tax() {
		double discount = healthcare * 0.5;
		if (income <= 20000.00) {
			double tax = income * 0.15 - discount;
			return (tax < 0) ? 0.0 : tax;
		} else {
			double tax = income * 0.25 - discount;
			return (tax < 0) ? 0.0 : tax;
		}
	}
}
