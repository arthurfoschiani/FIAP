package entrada_processamento_saida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex46W {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String r = "S";
		
		while(r.equals("S")) {
			
			int i = 1, qntd;
			float soma = 0, num, maior = 0, menor = 0, negativo = 0, positivo = 0;
			
			System.out.printf("Digite a quantidade de números que deseja inserir: ");
			qntd = ler.nextInt();

			while ( i <= qntd) {
				System.out.printf("Digite o %dº número: ", i);
			    num = ler.nextInt();
			    if (i == 1){
			        maior = num;
			        menor = num;
			    }
			    else {
			        if (num >= maior)
			            maior = num;
			        else if (num <= menor)
			            menor = num;
			    }
			        
			    if (num < 0)
			        negativo += 1;
			    else
			        positivo += 1;

			    soma += num;
			    i++;
			}

			System.out.printf("O maior valor é %.0f\n", maior);
			System.out.printf("O menor valor é %.0f\n", menor);
			System.out.printf("A soma desses valores é %.0f\n", soma);
			System.out.printf("A média desses valores é %.0f\n", soma/qntd);
			System.out.printf("A porcentagem de números positivos é %.1f porcento\n", (positivo/qntd)*100);
			System.out.printf("A porcentagem de números negativos é %.1f porcento\n", (negativo/qntd)*100);
			
			System.out.printf("Você deseja realizar uma nova execução? (S/N) ");
			r = ler.next().toUpperCase();

		    while (!r.equals("S") && !r.equals("N")){
		    	System.out.printf("Resposta inválida, digite novamente: ");
		    	r = ler.next().toUpperCase();
		    }
		}
	}

}
