package entrada_processamento_saida;

import java.util.Scanner;

public class Ex39W {

	public static void main(String[] args) {
		int ultimo, penultimo, count, termo;
		
		ultimo = 1;
		penultimo = 1;
		termo = 0;
		count = 3;
		
		System.out.printf("0\n");
		System.out.printf("1\n");
		System.out.printf("1\n");
		while (count <= 30) {
			termo = ultimo + penultimo;
		    penultimo = ultimo;
		    ultimo = termo;
		    System.out.printf("%d\n", termo);
		    count++;
		}
	}

}
