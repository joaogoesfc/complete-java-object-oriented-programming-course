import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int sum = 0;
		System.out.println("Enter positive numbers and 0 to finish:");
		while (x != 0) {
			x = sc.nextInt();
			sum += x;
		}
		System.out.println(x + " is the sum of your numbers!");
		sc.close();
	}

}
