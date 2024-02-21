import java.util.Locale;
import java.util.Scanner;

public class Ex2ConvertUsingDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		 do {
			System.out.print("Enter the temperature in celsius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalent in fahrenheit: %.1f\n", f);
			System.out.print("Whish to repeat? (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
		sc.close();

	}

}
