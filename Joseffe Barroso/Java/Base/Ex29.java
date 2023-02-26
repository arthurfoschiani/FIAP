package entrada_processamento_saida;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.printf("Digite um número inteiro: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite outro número inteiro: ");
		num2 = ler.nextInt();		

		while (num1 == num2) {
			System.out.printf("Não pode ter número iguais. Digite outro valor: ");
			num2 = ler.nextInt();
		}
		
		System.out.printf("Digite outro número inteiro: ");
		num3 = ler.nextInt();

		while (num3 == num2 || num3 == num1) {
			System.out.printf("Não pode ter número iguais. Digite outro valor: ");
			num3 = ler.nextInt();
		}

		if (num1 > num2 && num2 > num3)
		    System.out.printf("%d, %d, %d", num1, num2, num3);
		else if (num1 > num3 && num3 > num2)
		    System.out.printf("%d, %d, %d", num1, num3, num2);
		else if (num2 > num1 && num1 > num3)
		    System.out.printf("%d, %d, %d", num2, num1, num3);
		else if (num2 > num3 && num3 > num1)
		    System.out.printf("%d, %d, %d", num2, num3, num1);
		else if (num3 > num2 && num2 > num1)
		    System.out.printf("%d, %d, %d", num3, num2, num1);
		else if (num3 > num1 && num1 > num2)
		    System.out.printf("%d, %d, %d", num3, num1, num2);

	}

}
