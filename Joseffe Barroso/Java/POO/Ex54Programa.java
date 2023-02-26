package poo;

import java.util.Scanner;

public class Ex54Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Ex54Cliente[] listaClientes = new Ex54Cliente[3];
		
		for(int i = 0; i < listaClientes.length; i++) {
			char possuiConta;
			
			Ex54Cliente cliente = new Ex54Cliente();
			
			cliente.id = i + 1;
			
			System.out.printf("Digite o nome do %dº cliente: ", i+1);
			cliente.nome = ler.next();
			
			System.out.printf("Digite o email do %dº cliente: ", i+1);
			cliente.email = ler.next();
			
			System.out.printf("Digite a idade do %dº cliente: ", i+1);
			cliente.idade = ler.nextInt();
			
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
				
				Ex54ContaBancaria conta = new Ex54ContaBancaria(agencia, numero, saldo);
				
				cliente.conta = conta;
			}
			else {
				cliente.conta = null;
			}
			
			listaClientes[i] = cliente;
		}
		
		for(int i = 0; i < listaClientes.length; i++) {
			System.out.println(listaClientes[i].exibirNomeIdade());
			if (listaClientes[i].conta != null)
				System.out.println(listaClientes[i].exibirDadosConta());
			else
				System.out.println("Este cliente não possui uma conta\n");
		}
	}
}
