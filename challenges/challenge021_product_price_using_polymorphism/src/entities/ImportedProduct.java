package entities;

public class ImportedProduct extends Product{

	private double costomsFee;
	private double totalPrice;

	public ImportedProduct(String name, double price, double costomsFee) {
		super(name, price);
		this.costomsFee = costomsFee;
	}

	public double getCostomsFee() {
		return costomsFee;
	}

	public void setCostomsFee(double costomsFee) {
		this.costomsFee = costomsFee;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public double calcTotalPrice() {
		this.totalPrice = super.getPrice() + costomsFee;
		return totalPrice;
	}
	
	@Override
	public String priceTag() {
		return calcTotalPrice() + " (Customs fee: $ " + costomsFee + ")";
	}
}
