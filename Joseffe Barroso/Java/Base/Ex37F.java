package entrada_processamento_saida;

import java.util.Scanner;

public class Ex37F {

	public static void main(String[] args) {
		//Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla.
		
		Scanner ler = new Scanner(System.in);
		
		int i, t, i2;

		for (i = 1; i <= 20; i++){
		    for (i2 = 1; i2 <= 10; i2++) {
		        t = i * i2;
		        System.out.printf("%d x %d = %d\n", i, i2, t);
		    }
		    System.out.printf("Aperte ENTER");
		    ler.nextLine();
		}
	}

}
