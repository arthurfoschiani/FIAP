package entrada_processamento_saida;

import java.util.Scanner;

public class Ex32W {

	public static void main(String[] args) {
		//Criar uma rotina de entrada que aceite somente um valor positivo.
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("Digite um primeiro valor positivo: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite um segundo valor positivo: ");
		num2 = ler.nextInt();

		while (num1 >= num2) {
			System.out.printf("Valor inválido. Digite novamente o segundo valor: ");
			num2 = ler.nextInt();
		}
	}

}
