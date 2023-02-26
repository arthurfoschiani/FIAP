package poo;

public class Ex59ContaBancaria {
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
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	Ex59ContaBancaria () {
		
	}
	
	Ex59ContaBancaria (String agencia, String numero, Double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean sacar(double valorSaque) {
		if (this.saldo >= valorSaque) {			
			this.saldo -= valorSaque;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transferir(double valorTransf, Ex59Cliente destinatario) {
		if (this.saldo >= valorTransf) {
			this.saldo -= valorTransf;
			destinatario.getConta().depositar(valorTransf);
			return true;
		}
		else {
			return false;
		}
	}
	
	public String consultarSaldo() {
		return ("O saldo da conta é de " + this.saldo);
	}
}
