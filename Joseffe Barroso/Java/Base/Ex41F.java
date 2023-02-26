package entrada_processamento_saida;

import java.util.Scanner;

public class Ex41F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, impar, ultimo, total, soma, i;
		
		System.out.printf("Digite um valor: ");
	    n = ler.nextInt();

		while (n <= 0 || n >= 100) {
			System.out.printf("Valor inválido. Digite um valor maior que 0: ");
		    n = ler.nextInt();
		}

		impar = 3;
		ultimo = 2;
		total = 0;

		for (i = 1; i <= n; i++) {
		    total += ultimo;
		    System.out.printf("%d\n", ultimo);
		    soma = ultimo + impar;
		    ultimo = soma;
		    impar += 2;
		}

		System.out.printf("\nA soma é %d", total);
	}

}
