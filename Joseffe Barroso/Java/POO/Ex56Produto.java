package poo;

public class Ex56Produto {
	private int id;
	private String nome;
	private Double preco;
	private Double quantidade;
	private Ex56Categoria categoria;
	
	public Ex56Produto () {
		
	}
	
	public Ex56Produto (int id, String nome, Double preco, Double quantidade, Ex56Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	
	public String ExibirNomePreco () {
		return ("\nNome: " + this.nome + "\nPreço: " + this.preco + "\nQuantidade: " + this.quantidade);
	}
	
	public String ExibirNomeQuantidade () {
		return ("\nNome: " + this.nome + "\nQuantidade: " + this.quantidade);
	}
	
	public String ExibirCategoria () {
		return ("Categoria: " + this.categoria.getNome());
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

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Ex56Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Ex56Categoria categoria) {
		this.categoria = categoria;
	}
}
