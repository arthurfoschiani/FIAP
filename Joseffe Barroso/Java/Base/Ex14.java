package entrada_processamento_saida;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//Calculo Relação peso/altura
		
		Scanner ler = new Scanner(System.in);
		
		float peso, altura, imc;
		
		System.out.printf("Digite seu peso (em Kg): ");
		peso = ler.nextFloat();
		
		System.out.printf("Digite sua altura (em cm): ");
		altura = ler.nextFloat();

		altura = altura / 100;

		imc = peso / (altura * altura);

		if (imc < 20) {
		    System.out.printf("Abaixo do peso");
		}
		else if (imc >= 25) {
		    System.out.printf("Acima do peso");
		}
		else {
		    System.out.printf("Peso ideal\n");
		}

		System.out.printf("O seu IMC é %.2f", imc);
	}

}
