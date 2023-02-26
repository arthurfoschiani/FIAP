package entrada_processamento_saida;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		//Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal.
		
		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		float peso, altura, imc;
		
		System.out.printf("Digite seu sexo (m/f): ");
		sexo = ler.next().toLowerCase();
		
		while (!sexo.equals("f") && !sexo.equals("m")) {
			System.out.printf("Valor inválido. Digite 'm' ou 'f': ");
			sexo = ler.next().toLowerCase();
		}
		
		System.out.printf("Digite seu peso (em Kg): ");
		peso = ler.nextFloat();
		
		System.out.printf("Digite sua altura (em cm): ");
		altura = ler.nextFloat();

		altura = altura / 100;

		imc = peso / (altura * altura);

		 if (sexo.equals("f")) {
			 if (imc < 19) {
			     System.out.printf("Abaixo do peso");
			 }
			 else if (imc >= 24) {
			     System.out.printf("Acima do peso");
			 }
			 else {
			     System.out.printf("Peso ideal\n");
			 }
		 }
		 else if (sexo.equals("m")) {
			 if (imc < 20) {
			     System.out.printf("Abaixo do peso");
			 }
			 else if (imc >= 25) {
			     System.out.printf("Acima do peso");
			 }
			 else {
			     System.out.printf("Peso ideal\n");
			 }
		 }

		System.out.printf("O seu IMC é %.2f", imc);
	}

}
