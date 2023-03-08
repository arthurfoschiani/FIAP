package Model;

public class Cliente {
	private int id;
	private String nome;
	private String email;
	private Conta conta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public Cliente () {
		
	}
	
	public Cliente (String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
}
