package Model;

import java.io.IOException;

import Service.EnderecoService;

public class Pessoa {
	private String nome;
    private String email;
    private String numeroCasa;
    private String complemento;
    private Endereco endereco;

    public Pessoa(String nome, String email, String numeroCasa, String complemento, String cep) throws IOException {
    	EnderecoService enderecoService = new EnderecoService();
        this.nome = nome;
        this.email = email;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.endereco = enderecoService.getEndereco(cep);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
    	return "Pessoa{" +
	    	"nome= " + nome + ' ' +
	    	", email= " + email + ' ' +
	    	", numeroCasa= " + numeroCasa + ' ' +
	    	", complemento= " + complemento + ' ' +
	    	", endereco= " + endereco +
	    	'}';
	}
}
