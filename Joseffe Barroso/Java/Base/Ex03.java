package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int altura, base, area;
		
		System.out.printf("Digite o valor da altura:");
		altura = ler.nextInt();
		
		System.out.printf("Digite o valor da base:");
		base = ler.nextInt();
		
		area = (altura * base)/2;
				
		System.out.printf("A área é do triangulo é de %d", area);

	}

}
