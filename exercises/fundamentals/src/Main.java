import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// System.out.print, printl and printf
		
		String name = "Maria";
		int age = 31;
		double income = 4000.0;
		
		int y = 32;
		double x = 21.8784867;
		
		System.out.println("Good morning!");
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.4f\n", x);
		System.out.println("RESULT = " + x + " METERS");
		System.out.printf("RESULT = %.2f meters\n", x);
		
		System.out.printf("%s is %d years old and earns R$ %.2f reais\n", name, age, income);
		
		
	}

}
