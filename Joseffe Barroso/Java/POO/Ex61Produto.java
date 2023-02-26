package poo;

public class Ex61Produto {
	private int id;
	private String nome;
	private Double preco;
	private Double estoque;
	
	public Ex61Produto(int id, String nome, Double preco, Double estoque) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public Ex61Produto() {

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getEstoque() {
		return estoque;
	}

	public void setEstoque(Double estoque) {
		this.estoque = estoque;
	}
	
	public String pegarDados () {
		return("Id: " + this.id + " - Nome: " + this.nome + " - Estoque: " + this.estoque + " - Preço: " + this.preco + "\n------------------------------------\n");
	}
}
