package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the path: ");
		String path = sc.next();
		

		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> entries = new HashSet<>();

			String line = br.readLine();
			while(line != null) {
				String[] entry = line.split(" ");
				entries.add(new LogEntry(entry[0], Instant.parse(entry[1])));

				line = br.readLine();
			}
			System.out.printf("Total users %d", entries.size());
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
