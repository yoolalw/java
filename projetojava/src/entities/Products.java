package entities;

public class Products {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public int removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
