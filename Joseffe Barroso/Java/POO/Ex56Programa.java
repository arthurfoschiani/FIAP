package poo;

import java.util.Scanner;

public class Ex56Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Ex56Produto[] produtos = new Ex56Produto[5];
		
		int idCategoria = 0;
		
		for (int i = 0; i < produtos.length; i++) {
			char resposta;
			
			Ex56Produto produto = new Ex56Produto();
			
			produto.setId(i + 1);
			
			System.out.printf("Digite o nome do %dº produto: ", i+1);
			produto.setNome(ler.next());
			
			System.out.printf("Digite o preço do %dº produto: ", i+1);
			produto.setPreco(ler.nextDouble());
			
			System.out.printf("Digite a quantidade do %dº produto: ", i+1);
			produto.setQuantidade(ler.nextDouble());
			
			System.out.printf("O produto %s tem categoria? : ", produto.getNome());
			resposta = ler.next().toUpperCase().charAt(0);
			
			while (resposta != 'N' && resposta != 'S') {
				System.out.printf("Digite sim ou não: ");
				resposta = ler.next().toUpperCase().charAt(0);
			}
			
			if (resposta == 'S') {
				int id;
				String nome;			
				
				id = idCategoria;
				idCategoria++;
				
				System.out.print("Digite a categoria: ");
				nome = ler.next();
				
				Ex56Categoria categoria = new Ex56Categoria(id, nome);
				
				produto.setCategoria(categoria);
			}
			else {
				produto.setCategoria(null);
			}
			
			produtos[i] = produto;
		}
			
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].ExibirNomePreco());
			if (produtos[i].getCategoria() != null)
				System.out.println(produtos[i].ExibirCategoria());
			else
				System.out.println("Este produto não possui uma categoria\n");
		}
	}
}
