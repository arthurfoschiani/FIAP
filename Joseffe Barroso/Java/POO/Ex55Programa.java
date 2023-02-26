package poo;

import java.util.Scanner;

public class Ex55Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Ex55Cliente[] listaClientes = new Ex55Cliente[3];
		
		for(int i = 0; i < listaClientes.length; i++) {
			char possuiConta;
			
			Ex55Cliente cliente = new Ex55Cliente();
			
			cliente.setId(i + 1);
			
			System.out.printf("Digite o nome do %dº cliente: ", i+1);
			cliente.setNome(ler.next());
			
			System.out.printf("Digite o email do %dº cliente: ", i+1);
			cliente.setEmail(ler.next());
			
			System.out.printf("Digite a idade do %dº cliente: ", i+1);
			cliente.setIdade(ler.nextInt());
			
			System.out.printf("O %dº cliente possui conta (S/N)? ", i+1);
			possuiConta = ler.next().toUpperCase().charAt(0);
			while (possuiConta != 'N' && possuiConta != 'S') {
				System.out.printf("Digite sim ou não: ");
				possuiConta = ler.next().toUpperCase().charAt(0);
			}
			
			if (possuiConta == 'S') {	
				String agencia;
				String numero;
				Double saldo;				
				
				System.out.printf("Digite a agencia do %dº cliente: ", i+1);
				agencia = ler.next();
				
				System.out.printf("Digite a número da conta do %dº cliente: ", i+1);
				numero = ler.next();
				
				System.out.printf("Digite o saldo da conta do %dº cliente: ", i+1);
				saldo = ler.nextDouble();
				
				Ex55ContaBancaria conta = new Ex55ContaBancaria(agencia, numero, saldo);
				
				cliente.setConta(conta);
			}
			else {
				cliente.setConta(null);
			}
			
			listaClientes[i] = cliente;
		}
		
		for(int i = 0; i < listaClientes.length; i++) {
			System.out.println(listaClientes[i].exibirNomeIdade());
			if (listaClientes[i].getConta() != null)
				System.out.println(listaClientes[i].exibirDadosConta());
			else
				System.out.println("Este cliente não possui uma conta\n");
		}
	}
}
