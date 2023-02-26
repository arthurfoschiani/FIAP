package entrada_processamento_saida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex47DW {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String r = "S";
		
		while(r.equals("S")) {
			
			int i, num, soma, qntd, t = 0;
			
			System.out.printf("Digite o número que deseja fazer fatorial: ");
			num = ler.nextInt();
			
			while (num < 0) {
				System.out.printf("Digite novamente um número maior que 0: ");
				num = ler.nextInt();
			}
			
			i = num - 1;
			
			do {
		        t = num * i;
		        num = t;
		        i--;
		    }while ( i > 0 );

		    System.out.print(t);
	
			
			System.out.printf("\nVocê deseja realizar uma nova execução? (S/N) ");
			r = ler.next().toUpperCase();

		    while (!r.equals("S") && !r.equals("N")){
		    	System.out.printf("Resposta inválida, digite novamente: ");
		    	r = ler.next().toUpperCase();
		    }
		}
	}

}
