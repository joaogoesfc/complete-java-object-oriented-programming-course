import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		for (int i=0; i < n; i++) {
			int x = sc.nextInt();
			
			if (x <= 20 && x >= 10) {
				in++;
			} else out++;
		}
		System.out.println("Numbers between 10 and 20:");
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
