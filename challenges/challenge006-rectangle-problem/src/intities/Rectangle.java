package intities;

public class Rectangle {
	public double height;
	public double base;
	
	public double area() {
		return base * height;
	}
	
	public double perimeter() {
		return 2 * (base + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(base, 2.0) + Math.pow(height, 2.0));
	}
	
}
