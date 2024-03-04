package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	List<OrderItem> orders = new ArrayList<>();
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}
	
	public void addItem(OrderItem orderItem) {
		orders.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		orders.remove(orderItem);
	}
	
	public double totalPrice() {
		double sum = 0.0;
		for(OrderItem it : orders) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + moment.format(fmt) + "\n");
		sb.append("Order status: " + status + "\n");
		
		sb.append(client + "\n");
		
		sb.append("Order items:");
		for(OrderItem it : orders) sb.append("\n" + it);
		sb.append("\nTotal price: " + String.format("%.2f", totalPrice()));
		
		return sb.toString();
	}
	/*
	for(OrderItem it : orders) {
		System.out.println("Cliente: " + client.getName() + ", " + client.getEmail());
		System.out.println(
				it.getProduct().getName() 
				+ ", $" + String.format("%.2f", it.getPrice()) 
				+ ", Quantity: " + it.getQuantity()
				+ ", Subtotal: " + it.subTotal()
				);
	}
	*/
	
}
