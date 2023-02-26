package poo;

import java.util.Scanner;

public class Ex52Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex52Produto[] produtos = new Ex52Produto[10];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
			Ex52Produto produto = new Ex52Produto();
			produto.id = i;
			System.out.printf("Digite a descrição do %dº produto: ", i);
			produto.descricao = ler.next();
			System.out.printf("Digite o valor do %dº produto: ", i);
			produto.valor = ler.nextDouble();
			System.out.printf("Digite a quantidade do %dº produto: ", i);
			produto.quantidade = ler.nextDouble();
			
			produtos[i] = produto;
		}
		
		for (int i = 1; i <= 3; i++) {
			if (produtos[i].valor <= 100)
				System.out.printf("O %dº produto tem a descrição %s, com %.0f quantidades\n", produtos[i].id, produtos[i].descricao, produtos[i].quantidade);
		}
	}

}
