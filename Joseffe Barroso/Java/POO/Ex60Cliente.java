package poo;

public class Ex60Cliente {
	private int id;
    private String nome;
    private int idade;
    private Ex60ContaBancaria conta;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Ex60ContaBancaria getConta() {
        return conta;
    }
    public void setConta(Ex60ContaBancaria conta) {
        this.conta = conta;
    }
   
    public Ex60Cliente() {
       
    }
   
    public Ex60Cliente(int id, String nome, int idade, Ex60ContaBancaria conta) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
    }
   
    public String ExibirDadosClienteConta() {
        return "ID: " + this.id + " - Nome: " + this.nome + " - Agência: " + this.conta.getAgencia() + " - Número: " + this.conta.getNumero() + " - Saldo: " + this.conta.getSaldo() + " - Limite: " + this.conta.getLimite();
    }
}
