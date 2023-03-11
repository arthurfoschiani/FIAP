package Model;

import java.util.ArrayList;

public class Conta {
	private String agencia;
	private String numero;
    private double saldo;
    private ArrayList<String> historico;
    
    public ArrayList<String> getHistorico() {
		return historico;
	}

	public void setHistorico(ArrayList<String> historico) {
		this.historico = historico;
	}
	
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

    public void depositar(Double valor) {
    	historico.add("Depósito: +" + valor);
    	this.saldo = this.saldo + valor;
    }
    
    public Boolean sacar(Double valor) {
    	if (this.saldo > valor) {
        	this.saldo = this.saldo - valor;
        	historico.add("Saque: -" + valor);
        	return true;
    	} else {
    		return false;
    	}
    }
	
	public Conta () {
    	this.historico = new ArrayList<String>();	
	}
	
	public Conta (String agencia, String numero, Double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
}
