package entrada_processamento_saida;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”.

		Scanner ler = new Scanner(System.in);
		
		float base, altura, area;
		
		System.out.printf("Digite o valor da base: ");
		base = ler.nextFloat();
		
		System.out.printf("Digite o valor da altura: ");
		altura = ler.nextFloat();

		area = base * altura;

		if (base > 100){
			System.out.printf("Terreno grande");
		}
	}

}
