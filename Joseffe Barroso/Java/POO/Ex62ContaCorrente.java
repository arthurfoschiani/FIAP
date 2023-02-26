package poo;

public class Ex62ContaCorrente extends Ex62Conta {
	private double chequeEspecial;
	 
    public double getChequeEspecial() {
        return chequeEspecial;
    }
 
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
   
    public Ex62ContaCorrente() {
    }
   
    public Ex62ContaCorrente(String numero, double chequeEspecial) {
        super(numero);
        this.chequeEspecial = chequeEspecial;
    }

}
