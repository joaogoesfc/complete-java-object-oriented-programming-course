package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Pro {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1; i<=n; i++) {
			System.out.printf("Product#%d data: \n", i);
			System.out.print("Common, usedorimported(c/u/i)? ");
			char category = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			switch (category) {
			case 'i':
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fee));
				break;
			case 'u':
				System.out.print("Manufacturedate (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), UsedProduct.fmt);
				list.add(new UsedProduct(name, price, date));
				break;
			case 'c':
				list.add(new Product(name, price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product pr: list) {
			System.out.println(pr.priceTag());
		}
		
		sc.close();

	}

}
