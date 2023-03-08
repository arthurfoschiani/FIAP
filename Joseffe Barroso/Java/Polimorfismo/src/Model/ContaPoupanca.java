package Model;

public class ContaPoupanca extends Conta {
	private Double rentabilidade;

    public Double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(Double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
    
    public void depositar(Double valor) {
    	super.depositar(valor + (valor*this.rentabilidade));
    }
    
    public ContaPoupanca() {
    	
    }
   
    public ContaPoupanca(String agencia, String numero, Double salario, Double rentabilidade) {
        super(agencia, numero, salario);
       
        this.rentabilidade = rentabilidade;
    }
}
