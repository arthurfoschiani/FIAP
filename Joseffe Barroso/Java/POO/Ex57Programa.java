package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex57Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
	       
        ArrayList<Ex57Cliente> listaClientes = new ArrayList<>();
       
        int opcao;
        int id = 0;
        String nome;
        String idade;
        String email;
        int index = -1;
        int idCliente;
 
        do {        
            System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir cliente \n" +
                              "2 - Atualizar cliente \n" +
                              "3 - Excluir cliente \n" +
                              "4 - Exibir clientes \n" +
                              "5 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if (opcao == 1) {
    			char possuiConta;
    			
            	Ex57Cliente cliente = new Ex57Cliente();
            	
            	if (listaClientes.size() != 0) {
            		idCliente = listaClientes.get(listaClientes.size() - 1).getId() + 1;
            	}
            	else {
            		idCliente = 1;
            	}
            	cliente.setId(idCliente);
    			
    			System.out.printf("Digite o nome do cliente: ");
    			cliente.setNome(ler.next());
    			
    			System.out.printf("Digite o email do cliente: ");
    			cliente.setEmail(ler.next());
    			
    			System.out.printf("Digite a idade do cliente: ");
    			cliente.setIdade(ler.nextInt());
    			
    			System.out.printf("O cliente possui conta (S/N)? ");
    			possuiConta = ler.next().toUpperCase().charAt(0);
    			while (possuiConta != 'N' && possuiConta != 'S') {
    				System.out.printf("Digite sim ou não: ");
    				possuiConta = ler.next().toUpperCase().charAt(0);
    			}
    			
    			if (possuiConta == 'S') {	
    				String agencia;
    				String numero;
    				Double saldo;				
    				
    				System.out.printf("Digite a agencia do cliente: ");
    				agencia = ler.next();
    				
    				System.out.printf("Digite a número da conta do cliente: ");
    				numero = ler.next();
    				
    				System.out.printf("Digite o saldo da conta do cliente: ");
    				saldo = ler.nextDouble();
    				
    				Ex57ContaBancaria conta = new Ex57ContaBancaria(agencia, numero, saldo);
    				
    				cliente.setConta(conta);
    			}
    			else {
    				cliente.setConta(null);
    			}
    			
    			listaClientes.add(cliente);
    			
    			System.out.printf("Cliente incluido com sucesso!");
    			System.in.read();
    		}
            else if (opcao == 2) {
            	index = -1;
            	if (listaClientes.size() != 0) {
	            	for (Ex57Cliente c: listaClientes) {
	            		System.out.println(c.exibirNomeIdade());
	        			if (c.getConta() != null)
	        				System.out.println(c.exibirDadosConta());
	        			else
	        				System.out.println("Este cliente não possui uma conta\n");
	            	}
	            	
	            	System.out.printf("Digite o ID do cliente que deseja alterar: ");
	            	id = ler.nextInt();
	            	         	
	            	for(Ex57Cliente c: listaClientes) {
	            		if(c.getId() == id) {
	            			index = listaClientes.indexOf(c);
	            			break;
	            		}
	            	}
	            	
	            	if (index != -1) {
		            	Ex57Cliente cliente = listaClientes.get(index);
		    			
		    			System.out.printf("Digite o nome do cliente: ");
		    			cliente.setNome(ler.next());
		    			
		    			System.out.printf("Digite o email do cliente: ");
		    			cliente.setEmail(ler.next());
		    			
		    			System.out.printf("Digite a idade do cliente: ");
		    			cliente.setIdade(ler.nextInt());
		    			
		    			if (cliente.getConta() != null) {
		    				String agencia;
		    				String numero;
		    				Double saldo;				
		    				
		    				System.out.printf("Digite a agencia do cliente: ");
		    				agencia = ler.next();
		    				
		    				System.out.printf("Digite a número da conta do cliente: ");
		    				numero = ler.next();
		    				
		    				System.out.printf("Digite o saldo da conta do cliente: ");
		    				saldo = ler.nextDouble();
		    				
		    				Ex57ContaBancaria conta = new Ex57ContaBancaria(agencia, numero, saldo);
		    				
		    				cliente.setConta(conta);
		    			}
		    			
		    			System.out.printf("Cliente atualizado com sucesso!");
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
            	if (listaClientes.size() != 0) {
	            	for (Ex57Cliente c: listaClientes) {
	            		System.out.println(c.exibirNomeIdade());
	        			if (c.getConta() != null)
	        				System.out.println(c.exibirDadosConta());
	        			else
	        				System.out.println("Este cliente não possui uma conta\n");
	            	}
	            	
	            	System.out.printf("Digite o ID do cliente que deseja deletar: ");
	            	id = ler.nextInt();
           	
	            	for(Ex57Cliente c: listaClientes) {
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
            		System.out.printf("Não há usuários cadastrados.");
            	}
                System.in.read();
            }
            else if (opcao == 4) {
            	if (listaClientes.size() != 0) {
	            	for (Ex57Cliente c: listaClientes) {
	            		System.out.println(c.exibirNomeIdade());
	        			if (c.getConta() != null)
	        				System.out.println(c.exibirDadosConta());
	        			else
	        				System.out.println("Este cliente não possui uma conta\n");
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
