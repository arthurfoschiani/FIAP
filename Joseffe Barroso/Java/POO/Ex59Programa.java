package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex59Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
	       
        ArrayList<Ex59Cliente> listaClientes = new ArrayList<>();
       
        int opcao;
        int id = 0;
        int idFonte = 0;
        double valor = 0.0;
        String nome;
        String idade;
        String email;
        int index = -1;
        int index2 = -1;
        int idCliente;
 
        do {        
            System.out.printf("===> Banco Macgyver <===\n\n");
            System.out.printf("Escolha uma operação que deseja realizar hoje:\n");
            System.out.printf("1 - Criar cliente/conta \n" +
                              "2 - Deposito \n" +
                              "3 - Saque \n" +
                              "4 - Transferência \n" +
                              "5 - Consulta de saldo \n" +
                              "6 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if (opcao == 1) {
    			char possuiConta;
    			
            	Ex59Cliente cliente = new Ex59Cliente();
            	
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
    			
				/*
				 * System.out.printf("O cliente possui conta (S/N)? "); possuiConta =
				 * ler.next().toUpperCase().charAt(0); while (possuiConta != 'N' && possuiConta
				 * != 'S') { System.out.printf("Digite sim ou não: "); possuiConta =
				 * ler.next().toUpperCase().charAt(0); }
				 */
    			
    			/*if (possuiConta == 'S') {*/	
    				String agencia;
    				String numero;
    				Double saldo;				
    				
    				System.out.printf("Digite a agencia do cliente: ");
    				agencia = ler.next();
    				
    				System.out.printf("Digite a número da conta do cliente: ");
    				numero = ler.next();
    				
    				saldo = 0.0;
    				
    				Ex59ContaBancaria conta = new Ex59ContaBancaria(agencia, numero, saldo);
    				
    				cliente.setConta(conta);
					/*
					 * } else { cliente.setConta(null); }
					 */
    			
    			listaClientes.add(cliente);
    			
    			System.out.printf("Cliente cadastrado com sucesso com sucesso!");
    			System.in.read();
    		}
            else if (opcao == 2) {
            	index = -1;
            	if (listaClientes.size() != 0) {
	            	for (Ex59Cliente c: listaClientes) {
	            		System.out.println(c.exibirNomeIdade());
	        			if (c.getConta() != null)
	        				System.out.println(c.exibirDadosConta());
	        			else
	        				System.out.println("Este cliente não possui uma conta\n");
	            	}
	            	
	            	System.out.printf("Digite o ID do cliente que deseja realizar o depósito: ");
	            	id = ler.nextInt();
	            	
	            	         	
	            	for(Ex59Cliente c: listaClientes) {
	            		if(c.getId() == id) {
	            			index = listaClientes.indexOf(c);
	            			break;
	            		}
	            	}
	            	
	            	if (index != -1) {
	            		System.out.printf("Digite o valor que deseja realizar o depósito: ");
	            		valor = ler.nextDouble();
	            		
	            		while (valor < 0) {
	            			System.out.printf("Valor inválido. Digite novamente: ");
		            		valor = ler.nextDouble();
	            		}          		
	            		
	            		Ex59Cliente cliente = listaClientes.get(index);
		            	
		            	cliente.getConta().depositar(valor);
		    			
		    			System.out.printf("Depósito realizado com sucesso!");
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
            else if (opcao == 3) {
            	index = -1;
            	if (listaClientes.size() != 0) {
	            	for (Ex59Cliente c: listaClientes) {
	            		System.out.println(c.exibirNomeIdade());
	        			if (c.getConta() != null)
	        				System.out.println(c.exibirDadosConta());
	        			else
	        				System.out.println("Este cliente não possui uma conta\n");
	            	}
	            	
	            	System.out.printf("Digite o ID do cliente que deseja realizar o saque: ");
	            	id = ler.nextInt();
	            	
           	
	            	for(Ex59Cliente c: listaClientes) {
	            		if(c.getId() == id) {
	            			index = listaClientes.indexOf(c);
	            			break;
	            		}
	            	}
	            	
	            	if (index != -1) {
	            		System.out.printf("Digite o valor que deseja realizar o saque: ");
	            		valor = ler.nextDouble();
	            		
	            		while (valor < 0) {
	            			System.out.printf("Valor inválido. Digite novamente: ");
		            		valor = ler.nextDouble();
	            		}

	            		Ex59Cliente cliente = listaClientes.get(index);
		            	
		            	if (cliente.getConta().sacar(valor)) {
		            		System.out.printf("Saque realizado com sucesso!");
		            	} else {
		            		System.out.printf("Cliente sem saldo suficiente!");
		            	}
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
	            	for (Ex59Cliente c: listaClientes) {
	            		System.out.println(c.exibirNomeIdade());
	        			if (c.getConta() != null)
	        				System.out.println(c.exibirDadosConta());
	        			else
	        				System.out.println("Este cliente não possui uma conta\n");
	            	}
	            	
	            	System.out.printf("Digite o ID do cliente que realiza a transferência: ");
	            	idFonte = ler.nextInt();
	            	
	            	System.out.printf("Digite o ID do cliente que receberá a transferência: ");
	            	id = ler.nextInt();
	            	
           	
	            	for(Ex59Cliente c: listaClientes) {
	            		if(c.getId() == idFonte) {
	            			index2 = listaClientes.indexOf(c);
	            			break;
	            		}
	            	}
	            	
	            	for(Ex59Cliente c: listaClientes) {
	            		if(c.getId() == id) {
	            			index = listaClientes.indexOf(c);
	            			break;
	            		}
	            	}
	            	
	            	if (index != -1 && index2 != -1) {
	            		Ex59Cliente clienteFonte = listaClientes.get(index2);
	            		Ex59Cliente cliente = listaClientes.get(index);
	
	            		if (cliente != clienteFonte) {
	            			System.out.printf("Digite o valor da transferência: ");
	            			valor = ler.nextDouble();
	            			
	            			while (valor < 0) {
		            			System.out.printf("Valor inválido. Digite novamente: ");
			            		valor = ler.nextDouble();
		            		}
			            	
			            	if (clienteFonte.getConta().transferir(valor, cliente)) {
			            		System.out.printf("Saque realizado com sucesso!");
			            	} else {
			            		System.out.printf("Cliente sem saldo suficiente!");
			            	}
	            		}
	            		else {
	            			System.out.printf("Você não pode realizar tranferência para a mesma conta");
	            		}
	            	}
	            	else {
	            		System.out.printf("Um dos ID não foi encontrado");
	            	}
            	}
            	else {
            		System.out.printf("Não há clientes cadastrados.");
            	}
                System.in.read();
            }
            else if (opcao == 5) {
            	if (listaClientes.size() != 0) {
            		for (Ex59Cliente c: listaClientes) {
	            		System.out.println(c.exibirNomeIdade());
	            	}
            		
            		System.out.printf("Digite o ID do cliente que deseja saber o saldo: ");
	            	id = ler.nextInt();
	            	
	            	for(Ex59Cliente c: listaClientes) {
	            		if(c.getId() == id) {
	            			index = listaClientes.indexOf(c);
	            			break;
	            		}
	            	}
	            	
	            	if (index != -1) {
		            	Ex59Cliente cliente = listaClientes.get(index);
		            	
		            	System.out.printf(cliente.getConta().consultarSaldo());
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
        }while(opcao >= 1 && opcao <= 5);
	}
}
