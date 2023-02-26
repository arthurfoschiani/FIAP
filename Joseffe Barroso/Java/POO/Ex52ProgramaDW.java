package poo;

import java.util.Scanner;

public class Ex52ProgramaDW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex52Produto[] produtos = new Ex52Produto[10];
		Scanner ler = new Scanner(System.in);
		
		int i = 0;		
		do {
			Ex52Produto produto = new Ex52Produto();
			produto.id = i+1;
			System.out.printf("Digite a descrição do %dº produto: ", i+1);
			produto.descricao = ler.next();
			System.out.printf("Digite o valor do %dº produto: ", i+1);
			produto.valor = ler.nextDouble();
			System.out.printf("Digite a quantidade do %dº produto: ", i+1);
			produto.quantidade = ler.nextDouble();
			
			produtos[i] = produto;
			i++;
		} while (i < 10);
		
		i = 0;	
		do {
			if (produtos[i].valor <= 100)
				System.out.printf("O %dº produto tem a descrição %s, com %.0f quantidades\n", produtos[i].id, produtos[i].descricao, produtos[i].quantidade);
				
			i++;
		} while (i < 10);
	}

}
