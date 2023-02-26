package entrada_processamento_saida;

import java.util.Scanner;

public class Ex42W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i;
		float total, soma = 0, cima, baixo;
		
		System.out.printf("Digite um valor: ");
	    n = ler.nextInt();

		while (n <= 0 || n >= 100) {
			System.out.printf("Valor inválido. Digite um valor maior que 0: ");
		    n = ler.nextInt();
		}

		cima = 1;
		baixo = 2;
		i = 1;

		while (i <= n) {
		    System.out.printf(cima + "/" + baixo + "\n");
		    total = cima / baixo;
		    soma += total;
		    cima = baixo;
		    baixo += 1;
		    i++;
		}
		
		System.out.printf("%.1f", soma);
	}

}
