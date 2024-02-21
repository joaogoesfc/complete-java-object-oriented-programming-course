import java.util.Scanner;

public class FavoriteFuel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		int option = 0;
		
		System.out.println("Choose a fuel");
		System.out.println("1.Alcohol 2.Gasoline 3.Diesel 4.End");
		
		while (option != 4) {
			
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				alcohol += 1;
				break;
			case 2:
				gasoline += 1;
				break;
			case 3:
				diesel += 1;
				break;
			default:
				System.out.println("Invalid value, try again!");
				break;
			}
		}
		System.out.println("Thank you very much!");
		System.out.println("Alcohol: " + alcohol + " times");
		System.out.println("Alcohol: " + gasoline + " times");
		System.out.println("Alcohol: " + diesel + " times");
		
	}

}
