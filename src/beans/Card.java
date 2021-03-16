package beans;

import java.util.List;

public class Card {

	private List<Product> addedToCardProducts;
	private double totalPrice;
	private double shippingPrice;
	
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Card(List<Product> addedToCardProducts, double totalPrice,
			double shippingPrice) {
		super();
		this.addedToCardProducts = addedToCardProducts;
		this.totalPrice = totalPrice;
		this.shippingPrice = shippingPrice;
	}
	public List<Product> getAddedToCardProducts() {
		return addedToCardProducts;
	}
	public void setAddedToCardProducts(List<Product> addedToCardProducts) {
		this.addedToCardProducts = addedToCardProducts;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
}
