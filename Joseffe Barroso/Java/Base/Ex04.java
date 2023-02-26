package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float v1, v2, v3, v4, media;
		
		System.out.printf("Digite o primeiro valor:");
		v1 = ler.nextFloat();
		
		System.out.printf("Digite o segundo valor:");
		v2 = ler.nextFloat();
		
		System.out.printf("Digite o terceiro valor:");
		v3 = ler.nextFloat();
		
		System.out.printf("Digite o quarto valor:");
		v4 = ler.nextFloat();
		
		media = (v1 + v2 + v3 + v4)/4;
				
		System.out.printf("A média aritimética é de %.2f", media);
	}

}
