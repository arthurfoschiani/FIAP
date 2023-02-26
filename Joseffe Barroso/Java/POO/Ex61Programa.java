package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex61Programa {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
	       
        ArrayList<Ex61Cliente> listaClientes = new ArrayList<>();
        ArrayList<Ex61Produto> listaProdutos = new ArrayList<>();
        ArrayList<Ex61Pedido> listaPedidos = new ArrayList<>();
        
        int opcao;
        int id_cliente;
        int id_produto;
        int id_pedido;
        double quantidade;
        int index = -1;
        int id = 0;
       
        do {        
           System.out.printf("===> Sistemas de pedidos <===\n\n");
           System.out.printf("Escolha uma opção:\n");          
           System.out.printf("1 - Cadastrar clientes \n" +
                             "2 - Atualiza clientes \n" +
                             "3 - Excluir clientes \n" +
                             "4 - Listar clientes \n" +
                             "5 - Cadastrar produtos \n" +
                             "6 - Atualizar produtos \n" +
                             "7 - Excluir produtos \n" +
                             "8 - Listar produtos \n" +
                             "9 - Criar um pedido\n" +
                             "10 - Listar pedidos realizados \n" +
                             "11 - Sair\n\n");
 
           System.out.printf("Digite a opção desejada: ");
           opcao = ler.nextInt();
           
           if (opcao == 1) {
        	   Ex61Cliente cliente = new Ex61Cliente();
               
               if(listaClientes.size() > 0) {
                   id_cliente = listaClientes.get(listaClientes.size()-1).getId() + 1;
               }
               else {
                   id_cliente = 1;
               }
               cliente.setId(id_cliente);
               
               System.out.print("Digite o seu nome: ");
               cliente.setNome(ler.next());
               
               System.out.print("Digite o seu email: ");
               cliente.setEmail(ler.next());
               
               listaClientes.add(cliente);
               
               System.out.printf("Cliente cadastrado com sucesso!");
               
               System.in.read();
           }
           
           
           else if (opcao == 2) {
        	   index = -1;
        	   if (listaClientes.size() != 0) {
					for(Ex61Cliente c: listaClientes) {
						System.out.printf(c.pegarDados());
					}
					
					System.out.printf("Digite o ID do cliente que deseja alterar: ");
			    	id = ler.nextInt();
			    	         	
			    	for(Ex61Cliente c: listaClientes) {
			    		if(c.getId() == id) {
			    			index = listaClientes.indexOf(c);
			    			break;
			    		}
			    	}
			    	
			    	if (index != -1) {
			    		Ex61Cliente cliente = listaClientes.get(index);
						
						System.out.printf("Digite o nome do cliente: ");
						cliente.setNome(ler.next());
						
						System.out.printf("Digite o email do cliente: ");
						cliente.setEmail(ler.next());
						
						System.out.printf("Cliente atualizado com sucesso!");
			    	}
			    	else {
			    		System.out.printf("ID não encontrado");
			    	}
				}
				else {
					System.out.printf("Não há clientes cadastrados.");
				}
				System.in.read();
			}
           
           
           else if (opcao == 3){
        	   index = -1;
			   if (listaClientes.size() != 0) {
					for(Ex61Cliente c: listaClientes) {
						System.out.printf(c.pegarDados());
					}
					
					System.out.printf("Digite o ID do cliente que deseja deletar: ");
			    	id = ler.nextInt();
			    	         	
			    	for(Ex61Cliente c: listaClientes) {
			    		if(c.getId() == id) {
			    			index = listaClientes.indexOf(c);
			    			break;
			    		}
			    	}
			    	
			    	if (index != -1) {
			    		listaClientes.remove(index);
						
						System.out.printf("Cliente deletado com sucesso!");
			    	}
			    	else {
			    		System.out.printf("ID não encontrado");
			    	}
				}
				else {
					System.out.printf("Não há clientes cadastrados.");
				}
			   	System.in.read();
			}
           
           
           	else if (opcao == 4) {
           		if (listaClientes.size() != 0) {
					for(Ex61Cliente c: listaClientes) {
						System.out.printf(c.pegarDados());
					}
           		}
				else {
					System.out.printf("Não há clientes cadastrados.");
				}
			   	System.in.read();
           	}
           
           
           	else if (opcao == 5) {
           		Ex61Produto produto = new Ex61Produto();
                
                if(listaProdutos.size() > 0) {
                    id_produto = listaProdutos.get(listaProdutos.size()-1).getId() + 1;
                }
                else {
                	id_produto = 1;
                }
                produto.setId(id_produto);
                
                System.out.print("Digite o nome do produto: ");
                produto.setNome(ler.next());
                
                System.out.print("Digite a quantidade disponível no estoque: ");
                produto.setEstoque(ler.nextDouble());
                
                System.out.print("Digite o preço do produto: ");
                produto.setPreco(ler.nextDouble());
                
                listaProdutos.add(produto);
                
                System.out.printf("Produto cadastrado com sucesso!");
                
                System.in.read();
           	}
           
           
           	else if (opcao == 6) {
           		index = -1;
           		if (listaProdutos.size() != 0) {
 					for(Ex61Produto c: listaProdutos) {
 						System.out.printf(c.pegarDados());
 					}
 					
 					System.out.printf("Digite o ID do produto que deseja alterar: ");
 			    	id = ler.nextInt();
 			    	         	
 			    	for(Ex61Produto p: listaProdutos) {
 			    		if(p.getId() == id) {
 			    			index = listaProdutos.indexOf(p);
 			    			break;
 			    		}
 			    	}
 			    	
 			    	if (index != -1) {
 			    		Ex61Produto produto = listaProdutos.get(index);
 						
 						System.out.printf("Digite o nome do produto: ");
 						produto.setNome(ler.next());
 						
 						System.out.printf("Digite a quantidade no estoque: ");
 						produto.setEstoque(ler.nextDouble());
 						
 						System.out.printf("Digite o preço: ");
 						produto.setPreco(ler.nextDouble());
 						
 						System.out.printf("Produto atualizado com sucesso!");
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
           
           
           	else if (opcao == 7){
           		index = -1;
           		if (listaProdutos.size() != 0) {
 					for(Ex61Produto p: listaProdutos) {
 						System.out.printf(p.pegarDados());
 					}
 					
 					System.out.printf("Digite o ID do produto que deseja deletar: ");
 			    	id = ler.nextInt();
 			    	         	
 			    	for(Ex61Produto p: listaProdutos) {
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
           
           	else if (opcao == 8) {
	       		if (listaProdutos.size() != 0) {
					for(Ex61Produto p: listaProdutos) {
						System.out.printf(p.pegarDados());
					}
	       		}
				else {
					System.out.printf("Não há produtos cadastrados.");
				}
			   	System.in.read();
	       	}
           
           	else if (opcao == 9) {
           		if (listaClientes.size() != 0) {           		
	           		Ex61Pedido pedido = new Ex61Pedido();
	                
	                if(listaPedidos.size() > 0) {
	                    id_pedido = listaPedidos.get(listaPedidos.size()-1).getId() + 1;
	                }
	                else {
	                	id_pedido = 1;
	                }
	                pedido.setId(id_pedido);
	                
	                for(Ex61Cliente c: listaClientes) {
						System.out.printf(c.pegarDados());
					}
					
					System.out.printf("Digite o ID do cliente que está fazendo o pedido: ");
			    	id = ler.nextInt();
			    			    	         	
			    	for(Ex61Cliente c: listaClientes) {
			    		if(c.getId() == id) {
			    			index = listaClientes.indexOf(c);
			    			break;
			    		}
			    	}
			    	
			    	if (index != -1) {
			    		Ex61Cliente cliente = listaClientes.get(index);
						
						pedido.setCliente(cliente);
			    	}
			    	else {
			    		System.out.printf("ID não encontrado");
			    		continue;
			    	}
			    	
			    	char escolha = 'S';
			    	
			    	ArrayList<Ex61ItemPedido> listaItemPedido = new ArrayList<>();
			    	
			    	if (listaProdutos.size() != 0) {
				    	do {
					    	Ex61ItemPedido itemPedido = new Ex61ItemPedido();
			
			 					for(Ex61Produto p: listaProdutos) {
			 						System.out.printf(p.pegarDados());
			 					}
			 					
			 					System.out.printf("Digite o ID do produto que deseja adicionar: ");
			 			    	id = ler.nextInt();
			 			    	         	
			 			    	for(Ex61Produto p: listaProdutos) {
			 			    		if(p.getId() == id) {
			 			    			index = listaProdutos.indexOf(p);
			 			    			break;
			 			    		}
			 			    	}
			 			    	
			 			    	if (index != -1) {
			 			    		Ex61Produto produto = listaProdutos.get(index);
			 			    		itemPedido.setProduto(produto);
			 			    		
			 			    		System.out.printf("Digite a quantidade: ");
			 	 			    	quantidade = ler.nextDouble();
			 	 			    	
			 	 			    	listaItemPedido.add(itemPedido);
			 			    	}
			 			    	else {
			 			    		System.out.printf("ID não encontrado");
			 			    	}
					    	
					    	System.out.printf("Você deseja adicionar mais um produto? ");
					    	escolha = ler.next().toUpperCase().charAt(0);
					    	while (escolha != 'S' && escolha != 'N') {
					    		System.out.printf("Valor inválido! Digite novamente");
						    	escolha = ler.next().toUpperCase().charAt(0);
					    	}
				    	} while (escolha == 'S');
				    	pedido.setListaProduto(listaItemPedido);
				    	
				    	listaPedidos.add(pedido);
		                
		                System.out.printf("Pedido cadastrado com sucesso!");
			    	}			    	
			    	else {
			    		System.out.printf("Não há produtos cadastrados.");
			    	}
	           	}
	       		else {
	       			System.out.printf("Não há clientes cadastrados");
	       		}
           		System.in.read();
       		}
           	else if (opcao == 10) {
           		if (listaPedidos.size() != 0) {
	           		for(Ex61Pedido p: listaPedidos) {
	           			String lista = "";
	           			for (Ex61ItemPedido i: p.getListaProduto()) {
	           				lista = lista + ", " + i.getQuantidade() + " " + i.getProduto().getNome();
	           			}
	           			
						System.out.print("Cliente: " + p.getCliente().getNome() + " - Pedido: " + lista);
					}
           		}
           		else {
           			System.out.printf("Não há pedidos cadastrados");
           		}
           		System.in.read();
           	}
        }while( (opcao >= 1) && (opcao <= 10) );
	}

}
