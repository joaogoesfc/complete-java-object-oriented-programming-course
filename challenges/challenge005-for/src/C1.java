import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		System.out.println("The odd ones are:");
		for (int i=1; i<=x; i++) {
			if ( i % 2 == 1) {
				System.out.print(i + ", ");
			} else if (x > 1000) {
				break;
			}
		}
		
		sc.close();
	}

}
