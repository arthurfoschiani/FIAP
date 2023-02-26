package entrada_processamento_saida;

import java.util.Scanner;

public class Ex43DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, baixo, cima, i, impar, fator, soma;
		
		System.out.printf("Digite um valor: ");
	    n = ler.nextInt();

		while (n <= 0 || n >= 100) {
			System.out.printf("Valor inválido. Digite um valor maior que 0: ");
		    n = ler.nextInt();
		}

		impar = 3;
		cima = 2;
		fator = 1;
		baixo = 1;
		i = 1;

		do {
		    System.out.printf(cima + "/" + baixo + "\n");
		    soma = cima + impar;
		    cima = soma;
		    impar += 2;
		    fator += 1;
		    baixo = fator * fator * fator;
		    i++;
		}while (i <= n);
	}

}
