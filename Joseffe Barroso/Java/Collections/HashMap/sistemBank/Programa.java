package sistemBank;

import java.util.HashMap;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		HashMap<Integer, Cliente> listaClientes = new HashMap<Integer, Cliente>();
		
		char entrar = 'S';
		Integer i = 0;
		
		while(entrar == 'S') {
			char possuiConta;
			
			Cliente cliente = new Cliente();
			
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
				
				ContaBancaria conta = new ContaBancaria(agencia, numero, saldo);
				
				cliente.conta = conta;
			}
			else {
				cliente.conta = null;
			}
			
			listaClientes.put(i, cliente);
			
			System.out.printf("Deseja cadastrar mais um cliente? Sim/Não");
			entrar = ler.next().toUpperCase().charAt(0);
		}
		
		listaClientes.forEach((key, value) -> {
			System.out.println(value.exibirNomeIdade());
            if (value.conta != null)
				System.out.println(value.exibirDadosConta());
			else
				System.out.println("Este cliente não possui uma conta\n");
		});
	}

}
