package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
		this.price = product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		return product.getName() 
				+ ", $" + String.format("%.2f", price) 
				+ ", Quantity: " + quantity
				+ ", Subtotal: " + subTotal();
	}
}
