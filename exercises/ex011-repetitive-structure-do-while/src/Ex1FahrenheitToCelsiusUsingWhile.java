import java.util.Locale;
import java.util.Scanner;

public class Ex1FahrenheitToCelsiusUsingWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp = 's'; // with do-while declare this variable with a value isn't necessary
		
		while (resp != 'n') {
			System.out.print("Enter the temperature in celsius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalent in fahrenheit: %.1f\n", f);
			System.out.print("Whish to repeat? (s/n)? ");
			resp = sc.next().charAt(0);
		}
		
		
		sc.close();
	}

}
