import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int mask = 0b100000; // variable to test the sixth bit of a value
		int n = sc.nextInt();
		
		if ((n & 32) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
	}

}