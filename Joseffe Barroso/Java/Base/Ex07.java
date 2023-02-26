package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float produto1, produto2, produto3, produto4, produto5, soma, valor;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		produto1 = ler.nextFloat();
		
		System.out.printf("Digite o valor do segundo produto: ");
		produto2 = ler.nextFloat();
		
		System.out.printf("Digite o valor do terceiro produto: ");
		produto3 = ler.nextFloat();
		
		System.out.printf("Digite o valor do quarto produto: ");
		produto4 = ler.nextFloat();
		
		System.out.printf("Digite o valor do quinto produto: ");
		produto5 = ler.nextFloat();

		soma = produto1 + produto2 + produto3 + produto4 + produto5;

		System.out.printf("\nO valor total da compra é R$%.2f\n\n",soma);
		
		System.out.printf("Quanto você vai dar? ");
		valor = ler.nextFloat();

		while(valor < soma) {
			System.out.printf("\nDigite novamente um valor maior ou igual: ");
			valor = ler.nextFloat();
		}
		
		System.out.printf("\n\nO valor do troco é: R$%.2f", valor-soma);
	}

}
