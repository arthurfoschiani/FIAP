package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48DW {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número: ");
		num = ler.nextInt();

		int i = 1;
		
		do {
		    num += 1;
		    System.out.println(num);
		    i++;
		}while ( i <= 20 );
	}
}
