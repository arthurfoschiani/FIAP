package entrada_processamento_saida;

import java.util.Scanner;

public class Ex34DW {

	public static void main(String[] args) {
		//Exibir a tabuada do número cinco no intervalo de um a dez.

		int i, t;
		
		i = 1;

		do {
		    t = 5 * i;
		    System.out.printf("5 x %d = %d\n", i, t);
		    i ++;
		} while (i <= 10);
	}

}
