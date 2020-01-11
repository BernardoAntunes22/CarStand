package pt.iade.carStand.models;

/**
 *Classe criada para que atraves desta possamos mostrar a lista de usuários
 *no caso, um dos cenários secundários
 */
public class User {
	private int ID_Cliente;
	private String nome;
	private String morada;
	private int telemovel;
	private int nif;
	private String email;
	private String profissao; 	

	public User(int ID_Cliente, String nome, String morada, int telemovel, int nif, String email, String profissao) {
		super();
		this.ID_Cliente = ID_Cliente;
		this.nome = nome;
		this.morada = morada;
		this.telemovel = telemovel;
		this.nif = nif;
		this.email = email;
		this.profissao = profissao;
	}
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setNome(int ID_Cliente) {
		this.ID_Cliente = ID_Cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public int getTelemovel() {
		return telemovel;
	}
	public void setTelemovel(int telemovel) {
		this.telemovel = telemovel;
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	/**
	 *serve apenas para mostrar do modo que queremos a lista de clientes ao colaborador
	 */
	@Override
	public String toString() {
		return nome + ", Morada: " + morada + ", Telemóvel: " + telemovel + ", NIF: " + nif
				+ ", Email: "+ email + ", Profissão: " + profissao;
	}
}