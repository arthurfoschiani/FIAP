package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		celsius = ler.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32;
				
		System.out.printf("A temperatura em Fahrenheit é %.2f", fahrenheit);
	}
}