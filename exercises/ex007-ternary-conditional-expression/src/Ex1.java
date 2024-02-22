import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		double discount = (price < 20.0) ? price * 0.10 : price * 0.005;
		
		
		
		System.out.println(discount);
		
		sc.close();
	}

}
