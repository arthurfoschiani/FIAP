package entrada_processamento_saida;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		//Entrar via teclado, com dois valores distintos. Exibir o menor deles.

		Scanner ler = new Scanner(System.in);
		
		float num1, num2;
		
		System.out.printf("Digite o primeiro valor: ");
		num1 = ler.nextFloat();
		
		System.out.printf("Digite o segundo valor: ");
		num2 = ler.nextFloat();

		if (num1 < num2) {
			System.out.printf("O menor número é: %.0f", num1);
		}
		else if (num2 < num1) {
			System.out.printf("O menor número é: %.0f", num2);
		}
		else {
			System.out.printf("Os dois números são iguais");
		}
	}

}
