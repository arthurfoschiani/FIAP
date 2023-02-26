package entrada_processamento_saida;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.printf("Digite o primeiro valor:");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor:");
		b = ler.nextInt();
		
		soma = a + b;
				
		System.out.printf("%d + %d = %d", a, b, soma);
	}

}
