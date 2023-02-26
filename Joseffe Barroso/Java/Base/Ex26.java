package entrada_processamento_saida;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		//Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

		Scanner ler = new Scanner(System.in);
		
		Float num;
		
		System.out.printf("Digite um número inteiro: ");
		num = ler.nextFloat();

		if (num >= 0)
		    System.out.printf("Seu dobro é %", num * 2);
		else
		    System.out.printf("Seu triplo é %", num * 3);
	}

}
