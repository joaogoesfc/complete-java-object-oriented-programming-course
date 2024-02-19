import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double width = sc.nextDouble();
		double length = sc.nextDouble();
		double mPrice = sc.nextDouble();
		
		double area = width * length;
		
		double price = area * mPrice;
		
		System.out.println(price);
		

	}

}
