package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int aresta, area;
		
		System.out.printf("Digite o valor da aresta do quadrado:");
		aresta = ler.nextInt();
		
		area = aresta * aresta;
				
		System.out.printf("A área do quadrado é de %d", area);

	}

}
