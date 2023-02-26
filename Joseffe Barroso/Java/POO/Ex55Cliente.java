package poo;

public class Ex55Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private Ex55ContaBancaria conta;
	
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ex55ContaBancaria getConta() {
		return conta;
	}

	public void setConta(Ex55ContaBancaria conta) {
		this.conta = conta;
	}

	Ex55Cliente () {
		
	}
	
	Ex55Cliente (int id, String nome, int idade, String email, Ex55ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail (String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade () {
		return ("Nome: " + this.nome + "\nIdade: " + this.idade);
	}
	
	public String exibirDadosConta () {
		return ("Agência: " + this.conta.getAgencia() + "\nNúmero: " + this.conta.getNumero() + "\nSaldo: " + this.conta.getSaldo() + "\n");
	}
}
