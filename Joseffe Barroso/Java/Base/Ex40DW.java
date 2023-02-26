package entrada_processamento_saida;

import java.util.Scanner;

public class Ex40DW {

	public static void main(String[] args) {
		int ultimo, penultimo, count, termo, anti;
		
		ultimo = 1;
		penultimo = 1;
		anti = 1;
		termo = 0;
		count = 1;
		
		System.out.printf("0\n");
		System.out.printf("1\n");
		System.out.printf("1\n");
		System.out.printf("1\n");
		do {
			termo = ultimo + penultimo + anti;
			anti = penultimo;
		    penultimo = ultimo;
		    ultimo = termo;
		    System.out.printf("%d\n", termo);
		    count++;
		} while (count <= 20);
	}

}
