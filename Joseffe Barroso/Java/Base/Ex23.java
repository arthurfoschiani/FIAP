package entrada_processamento_saida;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		//Algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

		Scanner ler = new Scanner(System.in);
		
		float a, b , c;
		
		System.out.printf("Digite o valor de A: ");
		a = ler.nextFloat();
		
		System.out.printf("Digite o valor de B: ");
		b = ler.nextFloat();
		
		System.out.printf("Digite o valor de C: ");
		c = ler.nextFloat();

		if (a + b < c)
		    System.out.printf("O valor de A + B é menor que C");
		else
		    System.out.printf("O valor de A + B é maior ou igual a C");
	}

}
