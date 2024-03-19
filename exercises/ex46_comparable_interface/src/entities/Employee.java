package entities;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		return -salary.compareTo(o.getSalary());
	}
	
	@Override
	public String toString() {
		return name + ", " + salary;
	}
}
