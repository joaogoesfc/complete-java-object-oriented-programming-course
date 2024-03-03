package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

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

	public List<OrderItem> getOrders() {
		return orders;
	}
	
	public void addItem(OrderItem orderItem) {
		orders.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		orders.remove(orderItem);
	}
	
	public void viewItems() {
		for(OrderItem it : orders) {
			System.out.println(
					it.getProduct().getName() 
					+ ", $" + String.format("%.2f", it.getPrice()) 
					+ ", Quantity: " + it.getQuantity()
					+ ", Subtotal: " + it.subTotal()
					);
		}
	}
	
	public double totalPrice() {
		double sum = 0;
		for(OrderItem it : orders) {
			sum += it.subTotal();
		}
		return sum;
	}
}
