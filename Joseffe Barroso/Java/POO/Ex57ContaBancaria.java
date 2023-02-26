package poo;

public class Ex57ContaBancaria {
	private String agencia;
	private String numero;
	private Double saldo;
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	Ex57ContaBancaria () {
		
	}
	
	Ex57ContaBancaria (String agencia, String numero, Double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
}
