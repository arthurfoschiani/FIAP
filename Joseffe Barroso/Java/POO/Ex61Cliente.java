package poo;

public class Ex61Cliente {
	private int id;
	private String nome;
	private String email;
	
	public Ex61Cliente(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public Ex61Cliente() {
		
	}
	
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
	
	public String pegarDados () {
		return("Id: " + this.id + " - Nome: " + this.nome + " - Email: " + this.email + "\n------------------------------------\n");
	}
}
