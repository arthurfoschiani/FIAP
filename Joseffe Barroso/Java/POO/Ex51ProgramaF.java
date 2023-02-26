package poo;

import java.util.Scanner;

public class Ex51ProgramaF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex51Cliente[] clientes = new Ex51Cliente[5];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			Ex51Cliente cliente = new Ex51Cliente();
			cliente.id = i+1;
			System.out.printf("Digite o nome do %dº cliente: ", i+1);
			cliente.nome = ler.next();
			System.out.printf("Digite a idade do %dº cliente: ", i+1);
			cliente.idade = ler.nextInt();
			System.out.printf("Digite o email do %dº cliente: ", i+1);
			cliente.email = ler.next();
			
			clientes[i] = cliente;
		}
		
		for (int i = 0; i < 5; i++) {
			if (clientes[i].idade >= 18)
				System.out.printf("O %dº nome é %s, com o email %s\n", clientes[i].id, clientes[i].nome, clientes[i].email);
		}
	}

}
