package entrada_processamento_saida;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		//Calcular a velocidade final de um automóvel
		
		Scanner ler = new Scanner(System.in);
		
		float acelereacao, velocidadeInicial, tempo, velocidade;
		
		System.out.printf("Insira a velocidade inicial do automóvel (m/s): ");
		velocidadeInicial = ler.nextFloat();
		
		System.out.printf("Insira a acelereação do automóvel (m/s2): ");
		acelereacao = ler.nextFloat();
		
		System.out.printf("Insira o tempo de percurso do automóvel (s): ");
		tempo = ler.nextFloat();

		velocidade = velocidadeInicial + acelereacao * tempo;

		System.out.println(velocidade);

		if (velocidade <= 40) {
		    System.out.printf("Veículo muito lento");
		}
		else if (velocidade <= 60){
		    System.out.printf("Velocidade permitida");
		}
		else if (velocidade <= 80){
		    System.out.printf("Velocidade de cruzeiro");
		}
		else if (velocidade <= 120){
		    System.out.printf("Veículo rápido");
		}
		else {
		    System.out.printf("Veículo muito alto");
		}

	}

}
