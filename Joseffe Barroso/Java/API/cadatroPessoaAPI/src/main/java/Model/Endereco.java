package Model;

public class Endereco {
	private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    
    public String getCep() {
        return cep;
    }

    public String getRua() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return localidade;
    }

    public String getEstado() {
        return uf;
    }
    
    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", rua='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + localidade + '\'' +
                ", estado='" + uf + '\'' +
                '}';
    }
}
