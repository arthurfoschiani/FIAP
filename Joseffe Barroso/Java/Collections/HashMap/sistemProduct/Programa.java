package sistemProduct;

import java.util.HashMap;
import java.util.Scanner;

import sistemBank.Cliente;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();
		
		char entrar = 'S';
		Integer i = 0;
		int idCategoria = 0;
		
		while(entrar == 'S') {
			char resposta;
			
			Produto produto = new Produto();
			
			produto.setId(i + 1);
			
			System.out.printf("Digite o nome do %dº produto: ", i+1);
			produto.setNome(ler.next());
			
			System.out.printf("Digite o preço do %dº produto: ", i+1);
			produto.setPreco(ler.nextDouble());
			
			System.out.printf("Digite a quantidade do %dº produto: ", i+1);
			produto.setQuantidade(ler.nextDouble());
			
			System.out.printf("O produto %s tem categoria? ", produto.getNome());
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
				
				Categoria categoria = new Categoria(id, nome);
				
				produto.setCategoria(categoria);
			}
			else {
				produto.setCategoria(null);
			}
			
			produtos.put(i, produto);
			
			i++;
			
			System.out.println("Deseja cadastrar mais um produto? Sim/Não ");
			entrar = ler.next().toUpperCase().charAt(0);
		}
		
		produtos.forEach((key, value) -> {
			System.out.println(value.ExibirNomePreco());
            if (value.getCategoria() != null)
				System.out.println(value.ExibirCategoria());
			else
				System.out.println("Este produto não possui uma categoria\n");
		});
	}

}
