package entrada_processamento_saida;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		//Calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente 
		
		Scanner ler = new Scanner(System.in);
		
		int opcao;		
		float valor1, valor2, resultado;
		
		System.out.printf("Insira o primeiro valor: ");
		valor1 = ler.nextFloat();
		
		System.out.printf("Insira o segundo valor: ");
		valor2 = ler.nextFloat();

		System.out.println("Ecolha uma das opções: ");
		System.out.println("1 – Multiplicação");
		System.out.println("2 – Adição");
		System.out.println("3 – Divisão");
		System.out.println("4 – Subtração");
		System.out.println("5 – Fim de processo (sair do programa)");
		opcao = ler.nextInt();

		resultado = 0;

		if (opcao == 1)
		    resultado = valor1 * valor2;
		else if (opcao == 2)
		    resultado = valor1 + valor2;
		else if (opcao == 3)
		    resultado = valor1 / valor2;
		else if (opcao == 4)
		    resultado = valor1 - valor2;
		else if (opcao == 5)
		    System.out.printf("Você saiu do programa");
		else
		    System.out.printf("Valor inválido. Essa opção não existe no seletor");

		System.out.print(resultado);
	}

}
