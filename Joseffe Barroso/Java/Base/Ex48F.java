package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48F {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número: ");
		num = ler.nextInt();

		for (int i = 1; i <= 20; i++) {
		    num += 1;
		    System.out.println(num);
		}
	}
}
