package sistemBank;

public class ContaBancaria {
	public String agencia;
	public String numero;
	public Double saldo;
	
	ContaBancaria () {
		
	}
	
	ContaBancaria (String agencia, String numero, Double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
}
