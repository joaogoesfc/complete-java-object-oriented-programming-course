import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println("Squared and cubed values ​​from 1 to " + x);
		for (int i=1; i <= x; i++) {
			
			System.out.println(i + " " + ( (int) Math.pow(i, 2)) + " " + ( (int) Math.pow(i, 3)));
		}

		sc.close();
	}

}
