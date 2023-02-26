package Program;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

import Model.Pessoa;
import Service.EnderecoService;

public class Program {

	public static void main(String[] args) throws IOException {
		
		CadastroPessoas cadastro = new CadastroPessoas();
	    Scanner sc = new Scanner(System.in);
	    int opcao = 0;
	    do {
	        System.out.println("===== Menu =====");
	        System.out.println("1 - Incluir pessoa");
	        System.out.println("2 - Alterar pessoa");
	        System.out.println("3 - Excluir pessoa");
	        System.out.println("4 - Consultar pessoa");
	        System.out.println("5 - Listar pessoas");
	        System.out.println("6 - Sair");
	        System.out.print("Digite uma opção: ");
	        opcao = sc.nextInt();
	        sc.nextLine();
	        switch (opcao) {
            case 1:
                cadastro.incluirPessoa();
                break;
            case 2:
                cadastro.alterarPessoa();
                break;
            case 3:
                cadastro.excluirPessoa();
                break;
            case 4:
                cadastro.consultarPessoa();
                break;
            case 5:
                cadastro.listarPessoas();
                break;
            case 6:
                System.out.println("Programa encerrado.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
	    } while (opcao != 6);
	}
}
