package poo;

import java.util.Scanner;

public class Ex51Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex51Cliente[] clientes = new Ex51Cliente[5];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			Ex51Cliente cliente = new Ex51Cliente();
			cliente.id = i;
			System.out.printf("Digite o nome do %dº cliente: ", i);
			cliente.nome = ler.next();
			System.out.printf("Digite a idade do %dº cliente: ", i);
			cliente.idade = ler.nextInt();
			System.out.printf("Digite o email do %dº cliente: ", i);
			cliente.email = ler.next();
			
			clientes[i] = cliente;
		}
		
		for (int i = 1; i <= 5; i++) {
			if (clientes[i].idade >= 18)
				System.out.printf("O %dº nome é %s, com o email %s", clientes[i].id, clientes[i].nome, clientes[i].email);
		}
	}

}
