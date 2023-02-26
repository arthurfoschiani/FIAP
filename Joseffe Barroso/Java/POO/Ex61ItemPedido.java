package poo;

public class Ex61ItemPedido {
	private int id;
	private Ex61Produto produto;
	private Double quantidade;
	
	public Ex61ItemPedido(int id, Ex61Produto produto, Double quantidade) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Ex61ItemPedido() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ex61Produto getProduto() {
		return produto;
	}

	public void setProduto(Ex61Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
}
