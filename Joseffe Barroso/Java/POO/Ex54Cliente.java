package poo;

public class Ex54Cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public Ex54ContaBancaria conta;
	
	Ex54Cliente () {
		
	}
	
	Ex54Cliente (int id, String nome, int idade, String email, Ex54ContaBancaria conta) {
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
		return ("Agência: " + this.conta.agencia + "\nNúmero: " + this.conta.numero + "\nSaldo: " + this.conta.saldo + "\n");
	}
}
