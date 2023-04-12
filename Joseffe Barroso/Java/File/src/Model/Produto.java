package Model;

public class Produto {
	private String nome;
	private Double quantidade;
	private Double preco_unit;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getPreco_unit() {
		return preco_unit;
	}
	
	public void setPreco_unit(Double preco_unit) {
		this.preco_unit = preco_unit;
	}

	public Produto(String nome, Double quantidade, Double preco_unit) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco_unit = preco_unit;
	}
	
	public Produto() {
		
	}
}
