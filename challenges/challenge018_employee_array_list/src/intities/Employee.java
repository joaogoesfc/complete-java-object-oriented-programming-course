package intities;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void IncreaseSalary(double percentage) {
		salary += salary / 100 * percentage;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + ", name: " + name + ", salary: " + salary;
	}
	
}
