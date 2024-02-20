import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many minutes did you use?: ");
		int min = sc.nextInt();
		
		double bill = 50.00;
		
		if (min > 100) {
			bill += (min - 100) * 2.0;// bill += is the same of "bill = bill +"
		}
		System.out.printf("Amount to pay: R$ %.2f\n", bill);
		
		sc.close();
	}

}
