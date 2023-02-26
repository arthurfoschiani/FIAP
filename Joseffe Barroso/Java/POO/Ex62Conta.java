package poo;

public class Ex62Conta {
	private String agencia;
    private String numero;
    private double saldo;
   
    public String getAgencia() {
        return agencia;
    }
 
    public String getNumero() {
        return numero;
    }
 
    public void setNumero(String numero) {
        this.numero = numero;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    protected String exibirMensagem() {
        return "Bem vindo ao Internet Banking do Prof. Joseffe!";
    }  
   
    Ex62Conta(){
       this.agencia = "001";
       this.saldo = 0.0;
    }
   
    Ex62Conta(String numero){
        this.agencia = "001";
        this.numero = numero;
        this.saldo = 0;
    }
}
