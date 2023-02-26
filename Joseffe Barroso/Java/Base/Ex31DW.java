package entrada_processamento_saida;

import java.util.Scanner;

public class Ex31DW {

	public static void main(String[] args) {
		//Criar uma rotina de entrada que aceite somente um valor positivo.
		
		Scanner ler = new Scanner(System.in);
		
		int num;

		do{
			System.out.printf("Digite um valor positivo: ");
			num = ler.nextInt();
		}while (num < 0);
	}

}
