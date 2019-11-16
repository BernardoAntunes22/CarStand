package pt.iade.carStand.models;

public class Item1 {
	protected String name;
	protected double price;
	public Item1(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return name + " : " + price;
	}
}
