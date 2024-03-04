package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public interface Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birthdate (DD/MM/YYYY):");
		LocalDate birthDate = LocalDate.parse(sc.next(), Client.fmt);
		
		Client c1 = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), c1);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		System.out.println();
		for (int i=1; i<=n; i++) {
			System.out.printf("Enter #%d item data:\n", i);
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity; ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product(pName, price);
			
			order.addItem(new OrderItem(product, quantity));
		}
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}
}
