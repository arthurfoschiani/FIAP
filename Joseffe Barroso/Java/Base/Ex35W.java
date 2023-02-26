package entrada_processamento_saida;

import java.util.Scanner;

public class Ex35W {

	public static void main(String[] args) {
		//Exibir a tabuada do número cinco no intervalo de um a dez.

		Scanner ler = new Scanner(System.in);
		
		int i, t, num;

		do{
			System.out.printf("Digite um valor positivo: ");
			num = ler.nextInt();
		}while (num < 0);
		
		i = 0;

		while (i <= 10){
		    t = num * i;
		    System.out.printf("%d x %d = %d\n", num, i, t);
		    i ++;
		}
	}

}
