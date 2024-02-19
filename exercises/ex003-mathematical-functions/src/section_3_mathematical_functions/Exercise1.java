package section_3_mathematical_functions;

public class Exercise1 {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Square root of " + x + " = " + A);
		System.out.println("Square root of " + y + " = " + B);
		System.out.println("Square root of 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + "to the power of " + y + " = " + A);
		System.out.println(x + "squared = " + B);
		System.out.println("5 squared = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Absolute value of " + y + " = " + A);
		System.out.println("Absolute value of " + z + " = " + B);

	}

}
