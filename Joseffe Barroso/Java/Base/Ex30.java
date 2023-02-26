package entrada_processamento_saida;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		double preco;
		
		System.out.printf("Qual o preço de etiqueta do produto? ");
		preco = ler.nextDouble();

		System.out.println("Qual a forma de pagamento? ");
		System.out.println("1 – À vista em dinheiro ou cheque");
		System.out.println("2 – À vista no cartão de crédito");
		System.out.println("3 – Em duas vezes no cartão de crédito");
		System.out.println("4 – Mais de duas vezes no cartão de crédito");
		opcao = ler.nextInt();

		if (opcao == 1) {
		    preco = preco * 0.9;
		    System.out.print(preco);
		}
		else if (opcao == 2){
		    preco = preco * 0.85;
		    System.out.print(preco);
		}
		else if (opcao == 3){
		    System.out.print(preco);
		}
		else if (opcao == 4){
		    preco = preco * 1.1;
		    System.out.print(preco);
		}
		else {
		    System.out.printf("Valor inválido");
		}
	}

}
