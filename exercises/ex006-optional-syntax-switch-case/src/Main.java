import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("Enter a number from 1 to 7:");
		int x = sc.nextInt();
		String day;
		
		switch (x) {
		case 1: 
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "thursday";
			break;
		case 6: 
			day = "Friday";
			break;
		case 7: 
			day = "Saturday";
			break;
		default:
			day = "Invalid value";
			break;
		}
		
		System.out.println("Day of the week: " + day);

	}

}
