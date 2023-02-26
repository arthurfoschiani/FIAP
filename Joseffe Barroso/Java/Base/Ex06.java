package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float cotacao, qntdDinheiro, real;
		
		System.out.printf("Digite a cotação do dólar: ");
		cotacao = ler.nextFloat();
		
		System.out.printf("Digite a quantidade de dólar que deseja converter: ");
		qntdDinheiro = ler.nextFloat();
		
		real = cotacao * qntdDinheiro;
				
		System.out.printf("O valor corresponde a R$%.2f", real);
	}

}
