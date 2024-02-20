import java.util.Scanner;

public class Cond1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What time is it?: ");
		int x = sc.nextInt();
		
		if (x < 12) {
			System.out.println("Good morning");
		} else if (x >= 12 && x < 18) {
			System.out.println("Good afternoon");
		} else {
			System.out.println("Good evening");
		}
		
		
		sc.close();
	}

}
