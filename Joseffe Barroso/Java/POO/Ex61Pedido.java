package poo;

import java.util.ArrayList;

public class Ex61Pedido {
	private int id;
	private Ex61Cliente cliente;
	private ArrayList<Ex61ItemPedido> listaProduto;
	
	public Ex61Pedido(int id, Ex61Cliente cliente, ArrayList<Ex61ItemPedido> listaProduto) {
		this.id = id;
		this.cliente = cliente;
		this.listaProduto = listaProduto;
	}
	
	public Ex61Pedido() {

	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Ex61Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Ex61Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<Ex61ItemPedido> getListaProduto() {
		return listaProduto;
	}
	
	public void setListaProduto(ArrayList<Ex61ItemPedido> listaProduto) {
		this.listaProduto = listaProduto;
	}	
}