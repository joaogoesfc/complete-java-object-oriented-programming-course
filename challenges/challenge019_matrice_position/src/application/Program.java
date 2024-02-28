package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		int r = sc.nextInt();
		int c = sc.nextInt();
		Integer[][] mat = new Integer[r][c];
		
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		int positionOf = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == positionOf) {
					System.out.println("Position " + i + "," + j + ":");
					if(i-1 >= 0) System.out.println("Top: " + mat[i - 1][j]);
					if(j + 1 < mat[i].length) System.out.println("Right: " + mat[i][j + 1]);
					if(i + 1 < mat[i].length) System.out.println("Bottom: " + mat[i + 1][j]);
					if(j - 1 >= 0) System.out.println("Left: " + mat[i][j - 1]);
				}
			}
		}
		
		sc.close();
	}

}
