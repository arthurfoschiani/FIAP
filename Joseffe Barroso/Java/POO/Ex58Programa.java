package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex58Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
	       
        ArrayList<Ex58Produto> listaProdutos = new ArrayList<>();
       
        int opcao;
        int id = 0;
        int idCategoria = 0;
    	Double preco;
    	Double quantidade;
    	String categoria;
        int index = -1;
        int idProduto;
 
        do {        
            System.out.printf("===> Sistema de Cadastro de Produtos <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir produto \n" +
                              "2 - Atualizar produto \n" +
                              "3 - Excluir produto \n" +
                              "4 - Exibir Produtos \n" +
                              "5 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if (opcao == 1) {
    			char resposta;
    			
				Ex58Produto produto = new Ex58Produto();
				
				if (listaProdutos.size() != 0) {
            		idProduto = listaProdutos.get(listaProdutos.size() - 1).getId() + 1;
            	}
            	else {
            		idProduto = 1;
            	}
            	produto.setId(idProduto);
				
				System.out.printf("Digite o nome do produto: ");
				produto.setNome(ler.next());
				
				System.out.printf("Digite o preço do produto: ");
				produto.setPreco(ler.nextDouble());
				
				System.out.printf("Digite a quantidade do produto: ");
				produto.setQuantidade(ler.nextDouble());
				
				System.out.printf("O produto %s tem categoria? : ", produto.getNome());
				resposta = ler.next().toUpperCase().charAt(0);
				
				while (resposta != 'N' && resposta != 'S') {
					System.out.printf("Digite sim ou não: ");
					resposta = ler.next().toUpperCase().charAt(0);
				}
				
				if (resposta == 'S') {
					int idCat;
					String nome;			
					
					idCat = idCategoria;
					idCategoria++;
					
					System.out.print("Digite a categoria: ");
					nome = ler.next();
					
					Ex58Categoria c = new Ex58Categoria(idCat, nome);
					
					produto.setCategoria(c);
				}
				else {
					produto.setCategoria(null);
				}
				
				listaProdutos.add(produto);
			}
            else if (opcao == 2) {
            	index = -1;
            	if (listaProdutos.size() != 0) {
            		for(Ex58Produto p: listaProdutos) {
            			System.out.println(p.ExibirNomePreco());
            			if (p.getCategoria() != null)
            				System.out.println(p.ExibirCategoria());
            			else
            				System.out.println("Este produto não possui uma categoria\n");
            		}
            		
            		System.out.printf("Digite o ID do produto que deseja alterar: ");
	            	id = ler.nextInt();
	            	         	
	            	for(Ex58Produto p: listaProdutos) {
	            		if(p.getId() == id) {
	            			index = listaProdutos.indexOf(p);
	            			break;
	            		}
	            	}
	            	
	            	if (index != -1) {
	            		Ex58Produto produto = listaProdutos.get(index);
	    				
	    				System.out.printf("Digite o nome do produto: ");
	    				produto.setNome(ler.next());
	    				
	    				System.out.printf("Digite o preço do produto: ");
	    				produto.setPreco(ler.nextDouble());
	    				
	    				System.out.printf("Digite a quantidade do produto: ");
	    				produto.setQuantidade(ler.nextDouble());
	    				
	    				if (produto.getCategoria() != null) {
	    					int idCat;
	    					String nome;			
	    					
	    					idCat = idCategoria;
	    					idCategoria++;
	    					
	    					System.out.print("Digite a categoria: ");
	    					nome = ler.next();
	    					
	    					Ex58Categoria c = new Ex58Categoria(idCat, nome);
	    					
	    					produto.setCategoria(c);
		    			}
	    				
	    				System.out.printf("produto atualizado com sucesso!");
	            	}
	            	else {
	            		System.out.printf("ID não encontrado");
	            	}
            	}
            	else {
            		System.out.printf("Não há usuários cadastrados.");
            	}
                System.in.read();
            }
            else if (opcao == 3) {
            	index = -1;
            	if (listaProdutos.size() != 0) {
            		for(Ex58Produto p: listaProdutos) {
            			System.out.println(p.ExibirNomePreco());
            			if (p.getCategoria() != null)
            				System.out.println(p.ExibirCategoria());
            			else
            				System.out.println("Este produto não possui uma categoria\n");
            		}
	            	
	            	System.out.printf("Digite o ID do produto que deseja deletar: ");
	            	id = ler.nextInt();
           	
	            	for(Ex58Produto p: listaProdutos) {
	            		if(p.getId() == id) {
	            			index = listaProdutos.indexOf(p);
	            			break;
	            		}
	            	}
	            	
	            	if (index != -1) {            	
		            	listaProdutos.remove(index);
		            	
		            	System.out.printf("Produto deletado com sucesso!");
	            	}
	            	else {
	            		System.out.printf("ID não encontrado");
	            	}
            	}
            	else {
            		System.out.printf("Não há produtos cadastrados.");
            	}
                System.in.read();
            }
            else if (opcao == 4) {
            	if (listaProdutos.size() != 0) {
            		for(Ex58Produto p: listaProdutos) {
            			System.out.println(p.ExibirNomePreco());
            			if (p.getCategoria() != null)
            				System.out.println(p.ExibirCategoria());
            			else
            				System.out.println("Este produto não possui uma categoria\n");
            		}
            	}
            	else {
            		System.out.printf("Não há usuários cadastrados.");
            	}
               
                System.in.read();
            } 
        }while(opcao >= 1 && opcao <= 4);
	}
}
