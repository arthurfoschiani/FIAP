package Model;

public class ContaCorrente extends Conta {
	private Double chequeEspecial;


    public Double getChequeEspecial() {
        return chequeEspecial;
    }


    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public Boolean sacar(Double valor) {
    	double saldoDisponivel = this.getSaldo() + this.chequeEspecial;

        if (saldoDisponivel >= valor) {
            if (valor <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                double valorRestante = valor - this.getSaldo();
                this.setSaldo(0.0);
                this.chequeEspecial -= valorRestante;
            }
            return true;
        } else {
            return false;
        }
    }
    
    public void Depositar(double valor) {
    	if(this.chequeEspecial < 100) {
    		if ( valor <= (100-this.chequeEspecial) ) {
    			this.chequeEspecial += valor;
    		}
    		else {
    			valor = valor - (100 - this.chequeEspecial);
    			this.chequeEspecial = 100.0;
    			super.depositar(valor);
    		}
    	}
    	else
    		super.depositar(valor);
    }
   
    public ContaCorrente() {
    	
    }
   
    public ContaCorrente(String agencia, String numero, Double salario, Double chequeEspecial) {
        super(agencia, numero, salario);
        
        this.chequeEspecial = chequeEspecial;
    }

}
