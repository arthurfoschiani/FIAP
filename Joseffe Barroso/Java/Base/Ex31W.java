package entrada_processamento_saida;

import java.util.Scanner;

public class Ex31W {

	public static void main(String[] args) {
		//Criar uma rotina de entrada que aceite somente um valor positivo.
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um valor positivo: ");
		num = ler.nextInt();

		while (num < 0) {
			System.out.printf("Valor inválido. Digite um valor positivo: ");
			num = ler.nextInt();
		}
	}

}
