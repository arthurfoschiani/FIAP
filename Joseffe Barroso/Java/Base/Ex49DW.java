package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49DW {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, soma = 0;
		
		System.out.printf("Digite um número: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite um número maior: ");
		num2 = ler.nextInt();
		
		while (num1 >= num2) {
			System.out.printf("Valor inválido. Digite novamente um número maior: ");
			num2 = ler.nextInt();
		}
		
		int i = num1;

		do {
		    soma += i;
		    i++;
		}while (i <= num2);
		
		System.out.print(soma);
	}
}
