package pt.iade.carStand.models;

public class Car {	
	private String marca;
	private String modelo;
	private String cor;
	private int cilindrada;
	private int ano;
	private double preco;
	
	//contrutor meramente para o CarListController funcionar
	public Car() {}
	
	public Car(String marca, String modelo, int cilindrada, double preco, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.preco = preco;
		this.ano = ano;
		
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return marca + " " + modelo + ", Cilindrada: " + cilindrada + ", Preço: " + preco + ", Ano: "+ ano;
	}

}
