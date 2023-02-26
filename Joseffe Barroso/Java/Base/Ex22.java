package entrada_processamento_saida;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opcao;		
		float base, altura, lado, raio;
		double area;

		System.out.println("Escolha um das opções: ");
		System.out.println("1 – Triângulo");
		System.out.println("2 – Quadrado");
		System.out.println("3 – Retângulo");
		System.out.println("4 – Círculo");
		System.out.println("5 – Fim de processo");
		opcao = ler.nextInt();
		
		if (opcao == 1) {
			System.out.printf("Digite a base do triangulo: ");
			base = ler.nextFloat();
			System.out.printf("Digite a altura do triangulo: ");
			altura = ler.nextFloat();
		
		    area = base * altura / 2;
		
		    System.out.printf("A area do trinagulo é %f",area);
		}
		else if (opcao == 2) {
			System.out.printf("Digite o lado do quadrado: ");
			lado = ler.nextFloat();
		
		    area = lado * lado;
		
		    System.out.printf("A area do quadrado é %f",area);
		}
		else if (opcao == 3) {
			System.out.printf("Digite a base do retangulo: ");
			base = ler.nextFloat();
			System.out.printf("Digite a altura do retangulo: ");
			altura = ler.nextFloat();
		
		    area = base * altura;
		
		    System.out.printf("A area do retangulo é %f",area);
		}
		else if (opcao == 4) {
			System.out.printf("Digite o raio do círculo: ");
			raio = ler.nextFloat();
		
		    area = 3.14 * raio;
		
		    System.out.printf("A area do circulo é %f",area);
		}
		else if (opcao == 5)
		    System.out.printf("Você saiu do programa");
		else
		    System.out.printf("Valor inválido. Essa opção não existe no seletor");
	}

}
