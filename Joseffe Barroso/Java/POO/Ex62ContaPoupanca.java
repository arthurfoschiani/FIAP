package poo;

public class Ex62ContaPoupanca extends Ex62Conta {
	private double rentabilidade;
	 
    public double getRentabilidade() {
        return rentabilidade;
    }
 
    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public Ex62ContaPoupanca() {
    }
   
    public Ex62ContaPoupanca(String numero, double rentabilidade) {
        super(numero);
       
        this.rentabilidade = rentabilidade;
    }

}
