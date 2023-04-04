package Ex02.Model;

public class Cliente {
	private String nome;
    private int idade;
    private String cidade;
    
    public Cliente(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCidade() {
        return cidade;
    }
}
