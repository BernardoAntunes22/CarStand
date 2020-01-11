package pt.iade.carStand.models;

/**
 *Heran�a de Car visto que os atributos do PurchasedCar s�o todos iguais
 *implementa��o de 2 atributos necess�rios
 */
public class PurchasedCar extends Car{
	private int ID_Comprador;
	private String nome;
	
	public PurchasedCar(int ID_Car, String marca, String modelo, int cilindrada, int preco, int ano,
			String combustivel, String estado, int iD_Comprador, String nome) {
		
		super(ID_Car, marca, modelo, cilindrada, preco, ano, combustivel, estado);
		this.ID_Comprador = iD_Comprador;
		this.nome = nome;
	}
	public int getID_Comprador() {
		return ID_Comprador;
	}
	public void setID_Comprador(int iD_Comprador) {
		ID_Comprador = iD_Comprador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Carro-> " + ID_Car + " - " + estado + " por " + nome +" ("+ "Id-" + ID_Comprador+") - " + marca + " " + 
				modelo + ", Cilindrada: " + cilindrada + ", Pre�o: " + preco +
				", Ano: "+ ano + ", Combustivel: " + combustivel;
	}	
}