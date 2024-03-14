package app;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a folder path");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		System.out.println("Files:");
		File[] files = path.listFiles(File::isFile);
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\joao cola").mkdir();
		System.out.println();
		System.out.println("Directory created successfully " + success);
		
		sc.close();
	}

}
