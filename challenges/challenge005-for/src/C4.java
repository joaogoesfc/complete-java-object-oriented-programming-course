import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.printf("Divisors of %d from 1 to %d\n", x, x);
		for (int i=1; i<=x; i++) {
			
			if (x % i == 0) {
				System.out.println(i);
			}
		
		}

		sc.close();
	}

}
