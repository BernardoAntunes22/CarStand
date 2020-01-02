package pt.iade.carStand.models;

public class User {
	private String nome;
	private String morada;
	private int telemovel;
	private int nif;
	private String email;
	private String profissao; 	
	
	public User(String nome, String morada, int telemovel, int nif, String email, String profissao) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.telemovel = telemovel;
		this.nif = nif;
		this.email = email;
		this.profissao = profissao;
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
	@Override
	public String toString() {
		return "Nome: " + nome + ", Morada: " + morada + ", Telemóvel: " + telemovel + ", NIF: " + nif
				+ ", Email: "+ email + ", Profissão: " + profissao;
	}
}