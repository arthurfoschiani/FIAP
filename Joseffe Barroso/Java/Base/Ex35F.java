package entrada_processamento_saida;

import java.util.Scanner;

public class Ex35F {

	public static void main(String[] args) {
		//Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.

		Scanner ler = new Scanner(System.in);
		
		int i, t, num;

		do{
			System.out.printf("Digite um valor positivo: ");
			num = ler.nextInt();
		}while (num < 0);

		for(i = 1; i <= 10; i++) {
		    t = num * i;
		    System.out.printf("%d x %d = %d\n", num, i, t);
		}
	}

}
