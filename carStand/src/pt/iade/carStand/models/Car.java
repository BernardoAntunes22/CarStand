package pt.iade.carStand.models;

import pt.iade.carStand.models.Item1;

public class Car {
	private double quantity;
	private Item1 product;
	public Car(double quantity, Item1 product) {
		this.quantity = quantity;
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public Item1 getProduct() {
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
