package entrada_processamento_saida;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		//Calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente 
		
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2;
		
		System.out.printf("Insira a nota da primeira prova: ");
		nota1 = ler.nextFloat();

		while (nota1 > 10 || nota1 < 0) {
			System.out.printf("Nota inválida. Digite um valor válido: ");
			nota1 = ler.nextFloat();
		}

		nota2 = (15 - nota1) / 2;

		System.out.printf("O aluno precisa tirar pelo menos %.1f para ser aprovado",nota2);
	}

}
