package entrada_processamento_saida;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		//Entrar via teclado com três valores distintos. Exibir o maior deles.
		
		Scanner ler = new Scanner(System.in);
		
		float num1, num2, num3;
		
		System.out.printf("Digite o primeiro valor: ");
		num1 = ler.nextFloat();
		
		System.out.printf("Digite o segundo valor: ");
		num2 = ler.nextFloat();
		
		System.out.printf("Digite o terceiro valor: ");
		num3 = ler.nextFloat();

		if (num1 > num2 && num1 > num3) {
		    System.out.printf("O maior número é: %.0f}", num1);
		}
		else if (num2 > num1 && num2 > num3) {
		    System.out.printf("O maior número é: %.0f", num2);
		}
		else if (num3 > num1 && num3 > num2) {
		    System.out.printf("O maior número é: %.0f", num3);
		}
		else {
		    System.out.printf("Não coloque valores iguais");
		}
	}

}
