package entrada_processamento_saida;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		//Algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número inteiro: ");
		num = ler.nextInt();

		if (num % 2 == 1)
		    System.out.print(num + 8);
		else
		    System.out.print(num + 5);
	}

}
