package entrada_processamento_saida;

import java.util.Scanner;

public class Ex34F {

	public static void main(String[] args) {
		//Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.

		Scanner ler = new Scanner(System.in);
		
		int i, t;

		for(i = 1; i <= 10; i++) {
		    t = 5 * i;
		    System.out.printf("5 x %d = %d\n", i, t);
		}
	}

}
