import java.util.Locale;
import java.util.Scanner;

public class Main {
	//USANDO O ECLIPSE
	//Para marcar uma linha de breakpoint:
	 //Run-> ToggleBreakpoint
	 //Para iniciar o debug:
	 //Botão direito na classe -> Debug as -> Java Application
	 //Para executar uma linha:
	 //F6
	 //Para interromper o debug: notão vermelho no menu superior

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width = sc.nextDouble();
		double length = sc.nextDouble();
		double squareMeter = sc.nextDouble();
		
		double area = width * length;
		double price = area * squareMeter;
		
		System.out.printf("Area = %.2f\n", area);
		System.out.printf("Price = %.2f\n", price);
		
		
		sc.close();
	}

}
