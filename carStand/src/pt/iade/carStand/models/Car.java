package pt.iade.carStand.models;

import pt.iade.carStand.models.Item;

public class Car {
	private double quantity;
	private Item product;
	public Car(double quantity, Item product) {
		this.quantity = quantity;
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public Item getProduct() {
		return product;
	}
	public double getCost() {
		return quantity*product.getPrice();
	}
	@Override
	public String toString() {
		return quantity + " X " + product + " - Total : "+
				String.format("%.2f", getCost())+" €";
	}
	
}
