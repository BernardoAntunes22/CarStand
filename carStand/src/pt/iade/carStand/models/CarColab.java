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
	private String estado;

	public CarColab(int ID_Car, String marca, String modelo, int cilindrada, double preco, int ano, String combustivel, String estado) {
		super();
		this.ID_Car = ID_Car;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.preco = preco; 
		this.ano = ano;
		this.combustivel = combustivel;
		this.estado = estado;
		
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

	public int getID_Car() {
		return ID_Car;
	}
 
	public void setID_Car(int iD_Car) {
		ID_Car = iD_Car;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "IDCarro-> " + ID_Car + " - " + estado + " - " + marca + " " + modelo + ", Cilindrada: " + cilindrada + ", Preço: " + preco +
			 ", Ano: "+ ano + ", Combustivel: " + combustivel;
	}
}