import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 2002;
		System.out.print("Enter your password: ");
		int x = sc.nextInt();
		while (x != password) {
			System.out.println("Invalid password! try again.");
			x = sc.nextInt();
		}
		
		System.out.println("Access allowed");
		

	}

}
