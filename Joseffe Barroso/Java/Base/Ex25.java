package entrada_processamento_saida;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		//Algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.

		Scanner ler = new Scanner(System.in);
		
		Float num;
		
		System.out.printf("Digite um número inteiro: ");
		num = ler.nextFloat();

		if (num % 2 == 1)
		    System.out.printf("IMPAR");
		else
		    System.out.printf("PAR");
	}

}
