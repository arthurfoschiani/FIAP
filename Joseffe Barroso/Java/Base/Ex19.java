package entrada_processamento_saida;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		//Calcular a média de um aluno
		
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.printf("Insira a nota da primeira prova: ");
		nota1 = ler.nextFloat();
		
		while (nota1 > 10 || nota1 < 0) {
    		System.out.printf("Nota inválida. Digite um valor válido: ");
			nota1 = ler.nextFloat();
		}
		
		System.out.printf("Insira a nota da segunda prova: ");
		nota2 = ler.nextFloat();
		
		while (nota2 > 10 || nota2 < 0) {
    		System.out.printf("Nota inválida. Digite um valor válido: ");
			nota2 = ler.nextFloat();
		}

		media = (nota1 + (2 * nota2)) / 3;

		if (media >= 5) {
		    System.out.printf("Aprovado! Média %.1f", media);
		}
		else {
		    System.out.printf("Reprovado! Média %.1f", media);
		}
	}

}
