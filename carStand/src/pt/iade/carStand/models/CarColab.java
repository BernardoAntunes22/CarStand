package pt.iade.carStand.models;

public class CarColab {
	private int ID_Car;
	private String marca;
	private String modelo;
	private String cor;
	private int cilindrada;
	private int ano;
	private double preco;
	private String combustivel;
	
	//contrutor meramente para o CarListController funcionar

	public CarColab(int ID_Car, String marca, String modelo, int cilindrada, double preco, int ano, String combustivel) {
		super();
		this.ID_Car = ID_Car;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.preco = preco; 
		this.ano = ano;
		this.combustivel = combustivel;
		
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
		return "ID-> " + ID_Car + " -- " + marca + " " + modelo + ", Cilindrada: " + cilindrada + ", Preço: " + preco +
			 ", Ano: "+ ano + ", Combustivel: " + combustivel;
	}

	public int getID_Car() {
		return ID_Car;
	}
 
	public void setID_Car(int iD_Car) {
		ID_Car = iD_Car;
	}

}