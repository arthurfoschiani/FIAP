package entrada_processamento_saida;

import java.util.Scanner;

public class Ex50W {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.printf("Digite um número: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite um número maior: ");
		num2 = ler.nextInt();
		
		while (num1 >= num2 || num2 <= 13) {
			System.out.printf("Valor inválido. Digite novamente um número maior: ");
			num2 = ler.nextInt();
		}
		
		int i = num1 + 1;

		while (i < num2) {
		    if (i >= 10 && num1 % 2 == 0)
		        System.out.println(i - 1);
		    else if (i >= 10 && num1 % 2 == 1)
		        System.out.println(i);
		    i = i + 2;
		}
	}
}
