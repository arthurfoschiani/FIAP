package poo;

public class Ex63PessoaFisica extends Ex63Pessoa {
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Ex63PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ex63PessoaFisica(int id, String nome, String email, String cpf) {
		super(id, nome, email);
		this.CPF = cpf;
	}
}
