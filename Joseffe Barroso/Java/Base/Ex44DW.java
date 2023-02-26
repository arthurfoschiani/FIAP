package entrada_processamento_saida;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex44DW {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i;
		float maior = 0, soma = 0, num;
		
		i = 1;

		do {
			System.out.printf("Digite o %dº número: ", i);
		    num = ler.nextInt();
		    while (num < 0) {
		    	System.out.printf("Digite o %dº valor novamente: ", i);
			    num = ler.nextInt();
		    }
		    if (i == 1)
		        maior = num;
		    else {
		        if (num > maior)
		            maior = num;
		    }
		    soma += num;
		    i++;
		}while (i <= 10);

		System.out.printf("O maior valor é %.0f\n", maior);
		System.out.printf("A soma desses valores é %.0f\n", soma);
		System.out.printf("A média desses valores é %.1f\n", soma/10);
	}

}
