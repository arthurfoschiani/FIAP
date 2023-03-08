package Program;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import Model.Cliente;
import Model.ContaCorrente;
import Model.ContaPoupanca;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
	       
        HashMap<Integer, Cliente> listaClientes = new HashMap<Integer, Cliente>();
       
        int opcao;
        int opcaoConta;
        int id = 0;
        int idFonte = 0;
        Double valor = 0.0;
        String nome;
        String idade;
        String email;
        int index2 = -1;
        int idCliente;
        String agencia;
		String numero;
		Double saldo;
		Double chequeEspecial;
		Double rentabilidade;
 
        do {        
            System.out.printf("===> Banco Macgyver <===\n\n");
            System.out.printf("Escolha uma operação que deseja realizar hoje:\n");
            System.out.printf("1 - Inserir cliente \n" +
                              "2 - Deposito \n" +
                              "3 - Saque \n" +
                              "4 - Excluir cliente \n" +
                              "5 - Consultar clientes \n" +
                              "6 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if (opcao == 1) {
    			char possuiConta;
    			
            	Cliente cliente = new Cliente();
            	
            	if (listaClientes.size() != 0) {
            		idCliente = listaClientes.get(listaClientes.size()).getId() + 1;
            	}
            	else {
            		idCliente = 1;
            	}
            	cliente.setId(idCliente);
    			
    			System.out.println("Digite o nome do cliente: ");
    			cliente.setNome(ler.next());
    			
    			System.out.println("Digite o email do cliente: ");
    			cliente.setEmail(ler.next());
				
				System.out.println("O cliente possui conta (S/N)? "); 
				possuiConta = ler.next().toUpperCase().charAt(0); 
				
				while (possuiConta != 'N' && possuiConta != 'S') { 
					System.out.printf("Digite sim ou não: "); 
					possuiConta = ler.next().toUpperCase().charAt(0); 
				}
				
    			if (possuiConta == 'S') {     				
    				System.out.printf("Digite a agencia do cliente: ");
    				agencia = ler.next();
    				
    				System.out.printf("Digite a número da conta do cliente: ");
    				numero = ler.next();
    				
    				saldo = 0.0;

    	            System.out.printf("Você deseja ter qual tipo de conta? \n");
    	            System.out.printf("1 - Conta Corrente \n" +
    	                              "2 - Conta Poupança \n");
    	            System.out.printf("Digite a opção desejada: ");
    	            opcaoConta = ler.nextInt();
    	            
    	            while (opcaoConta != 1 && opcaoConta != 2) { 
    					System.out.printf("Digite uma opção válida: "); 
    					opcaoConta = ler.nextInt(); 
    				}
    	            
    	            if (opcaoConta == 1) {
    	            	chequeEspecial = 100.0;
    	            	
    	            	ContaCorrente cc = new ContaCorrente(agencia, numero, saldo, chequeEspecial);
    	            	cliente.setConta(cc);
    	            } else {
    	            	rentabilidade = 0.01;
    	            	
    	            	ContaPoupanca cp = new ContaPoupanca(agencia, numero, saldo, rentabilidade);
    	            	cliente.setConta(cp);
    	            }
    			} else {
    				cliente.setConta(null);
    			}
    			
    			listaClientes.put(idCliente, cliente);
    			
    			System.out.printf("Cliente cadastrado com sucesso com sucesso!");
    			System.in.read();
    		}
            else if (opcao == 2) {
            	if (listaClientes.size() != 0) {
	            	System.out.printf("Digite o ID do cliente que deseja realizar o depósito: ");
	            	id = ler.nextInt();
	            	
	            	if (listaClientes.get(id) != null) {
	            		System.out.printf("Digite o valor que deseja realizar o depósito: ");
	            		valor = ler.nextDouble();
	            		
	            		while (valor < 0) {
	            			System.out.printf("Valor inválido. Digite novamente: ");
		            		valor = ler.nextDouble();
	            		}          		
	            		
	            		Cliente cliente = listaClientes.get(id);
		            	
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
            	if (listaClientes.size() != 0) {
            		System.out.printf("Digite o ID do cliente que deseja realizar o saque: ");
	            	id = ler.nextInt();
	            	
	            	if (listaClientes.get(id) != null) {
	            		System.out.printf("Digite o valor que deseja realizar o saque: ");
	            		valor = ler.nextDouble();
	            		
	            		while (valor < 0) {
	            			System.out.printf("Valor inválido. Digite novamente: ");
		            		valor = ler.nextDouble();
	            		}

	            		Cliente cliente = listaClientes.get(id);
		            	
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
            		System.out.printf("Digite o ID do cliente que deseja deletar: ");
	            	id = ler.nextInt();
	            	
	            	if (listaClientes.get(id) != null) {
	            		listaClientes.remove(id);
	            		System.out.printf("Cliente removido com sucesso!");
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
            else if (opcao == 5) {
            	if (listaClientes.size() != 0) {
            		listaClientes.forEach((key, value) -> {
            			System.out.println("Id: "+value.getId());
            			System.out.println("Nome: "+value.getNome());
            			System.out.println("Email: "+value.getEmail());
            			if (value.getConta() != null) {
            				System.out.println("-------- Conta -------");
            				System.out.println("Agencia: "+value.getConta().getAgencia());
            				System.out.println("Número: "+value.getConta().getNumero());
            				System.out.println("Saldo: "+value.getConta().getSaldo());            	            
            	            if (value.getConta() instanceof ContaCorrente) {
            	            	ContaCorrente cc = (ContaCorrente) value.getConta();
            	            	System.out.println("Cheque especial: "+cc.getChequeEspecial());
            	            } else if (value.getConta() instanceof ContaPoupanca) {
            	            	ContaPoupanca cp = (ContaPoupanca) value.getConta();
            	            	System.out.println("Rentabilidade: "+cp.getRentabilidade());
            	            }
            			}
            			System.out.println("");
	            	});
            	}
            	else {
            		System.out.printf("Não há clientes cadastrados.");
            	}
                System.in.read();
            }
        }while(opcao >= 1 && opcao <= 5);
	}
}
