package pt.iade.carStand.models;

public class Car {	
	private String marca;
	private String modelo;
	private String cor;
	private int cilindrada;
	private int ano;
	private int preco;
	
	//contrutor meramente para o CarListController funcionar
	public Car() {}
	
	public Car(String marca, String modelo, String cor, int cilindrada, int ano, int preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.cilindrada = cilindrada;
		this.ano = ano;
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	/*private double quantity;
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
	} */
	
}
