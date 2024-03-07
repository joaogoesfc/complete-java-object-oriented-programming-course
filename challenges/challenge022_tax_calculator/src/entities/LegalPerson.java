package entities;

public class LegalPerson extends Person{

	private int employeeAmount;

	public LegalPerson(String name, double income, int employeesAmount) {
		super(name, income);
		this.employeeAmount = employeesAmount;
	}

	public int getEmployeesAmount() {
		return employeeAmount;
	}

	public void setEmployeesAmount(int employeesAmount) {
		this.employeeAmount = employeesAmount;
	}

	public double tax() {
		return employeeAmount <= 10 ? income * 0.16 : income * 0.14;
	}
}
