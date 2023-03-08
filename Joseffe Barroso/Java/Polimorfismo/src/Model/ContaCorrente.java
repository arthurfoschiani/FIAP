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
   
    public ContaCorrente() {
    	
    }
   
    public ContaCorrente(String agencia, String numero, Double salario, Double chequeEspecial) {
        super(agencia, numero, salario);
        
        this.chequeEspecial = chequeEspecial;
    }

}
