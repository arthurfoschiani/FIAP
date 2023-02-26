package entrada_processamento_saida;

import java.util.Scanner;

public class Ex36F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, t, num, num1, num2;
		
		System.out.printf("Digite um valor: ");
		num = ler.nextInt();
		
		while (num <= 0) {
			System.out.printf("Valor inválido. Digite um valor maior que 0: ");
			num = ler.nextInt();
		}
		
		System.out.printf("Digite o primeiro valor do intervalo: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor do intervalo: ");
		num2 = ler.nextInt();
		
		while (num1 >=  num2) {
			System.out.printf("Valor inválido. Digite novamente o segundo valor: ");
			num2 = ler.nextInt();
		}
		
		for (i = num2; i >= num1; i--) {
			t = num * i;
		    System.out.printf("%d x %d = %d\n", num, i, t);
		}
	}

}
