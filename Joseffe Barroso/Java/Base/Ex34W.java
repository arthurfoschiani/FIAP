package entrada_processamento_saida;

import java.util.Scanner;

public class Ex34W {

	public static void main(String[] args) {
		//Exibir a tabuada do número cinco no intervalo de um a dez.

		int i, t;
		i = 1;

		while (i <= 10){
		    t = 5 * i;
		    System.out.printf("5 x %d = %d\n", i, t);
		    i ++;
		}
	}

}
