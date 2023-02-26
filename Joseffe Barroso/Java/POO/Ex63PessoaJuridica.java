package poo;

public class Ex63PessoaJuridica extends Ex63Pessoa {
	private String CNPJ;
   
    public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Ex63PessoaJuridica() {
    	
    }
   
	public Ex63PessoaJuridica(int id, String nome, String email, String cnpj) {
		super(id, nome, email);
		this.CNPJ = cnpj;
	}

}
