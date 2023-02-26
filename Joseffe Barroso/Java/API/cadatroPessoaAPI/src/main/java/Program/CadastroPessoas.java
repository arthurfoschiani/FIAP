package Program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Pessoa;

public class CadastroPessoas {
	private ArrayList<Pessoa> pessoas;
	
	public CadastroPessoas() {
	    pessoas = new ArrayList<>();
	}

	public void incluirPessoa() throws IOException {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o nome da pessoa: ");
	    String nome = sc.nextLine();
	    System.out.print("Digite o email da pessoa: ");
	    String email = sc.nextLine();
	    System.out.print("Digite o número da casa: ");
	    String numeroCasa = sc.nextLine();
	    System.out.print("Digite o complemento: ");
	    String complemento = sc.nextLine();
	    System.out.print("Digite o CEP: ");
	    String cep = sc.nextLine();
	    Pessoa pessoa = new Pessoa(nome, email, numeroCasa, complemento, cep);
	    pessoas.add(pessoa);
	}

	public void alterarPessoa() throws IOException {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o email da pessoa que deseja alterar: ");
	    String email = sc.nextLine();
	    for (Pessoa pessoa : pessoas) {
	        if (pessoa.getEmail().equals(email)) {
	            System.out.print("Digite o novo número da casa: ");
	            String numeroCasa = sc.nextLine();
	            System.out.print("Digite o novo complemento: ");
	            String complemento = sc.nextLine();
	            System.out.print("Digite o novo CEP: ");
	            String cep = sc.nextLine();
	            pessoa = new Pessoa(pessoa.getNome(), pessoa.getEmail(), numeroCasa, complemento, cep);
	            System.out.println("Pessoa alterada com sucesso.");
	            return;
	        }
	    }
	    System.out.println("Pessoa não encontrada.");
	}

	public void excluirPessoa() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o email da pessoa que deseja excluir: ");
	    String email = sc.nextLine();
	    for (int i = 0; i < pessoas.size(); i++) {
	        Pessoa pessoa = pessoas.get(i);
	        if (pessoa.getEmail().equals(email)) {
	            pessoas.remove(i);
	            System.out.println("Pessoa excluída com sucesso.");
	            return;
	        }
	    }
	    System.out.println("Pessoa não encontrada.");
	}

	public void consultarPessoa() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o email da pessoa que deseja consultar: ");
	    String email = sc.nextLine();
	    for (Pessoa pessoa : pessoas) {
	        if (pessoa.getEmail().equals(email)) {
	            System.out.println(pessoa);
	            return;
	        }
	    }
	    System.out.println("Pessoa não encontrada.");
	}

	public void listarPessoas() {
	    for (Pessoa pessoa : pessoas) {
	        System.out.println(pessoa);
	    }
	}
}
