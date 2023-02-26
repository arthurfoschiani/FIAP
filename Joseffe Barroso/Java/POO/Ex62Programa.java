package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex62Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
	       
        ArrayList<Ex62Conta> listaConta = new ArrayList<>();
        
        int opcao;
        int numConta = 4022;
        
        do {        
            System.out.printf("===> Sistemas de operações <===\n\n");
            System.out.printf("Escolha uma opção:\n");          
            System.out.printf("1 - Conta corrente \n" +
                              "2 - Conta poupança \n" +
                              "3 - Conta salário \n" +
                              "4 - Listar contas \n" +
                              "5 - Sair\n\n");
  
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if (opcao == 1) {
            	Ex62ContaCorrente contaCorrente = new Ex62ContaCorrente();
            	            	
            	contaCorrente.setNumero(String.valueOf(numConta));
                numConta++;
                
                System.out.println("Digite o valor do cheque especial: ");                
                contaCorrente.setChequeEspecial(ler.nextDouble());
                
                listaConta.add(contaCorrente);

                System.out.printf("Conta cadastrada com sucesso!");
                System.in.read();
            }
            else if (opcao == 2) {
            	Ex62ContaPoupanca contaPoupanca = new Ex62ContaPoupanca();
            	            	
            	contaPoupanca.setNumero(String.valueOf(numConta));
                numConta++;
                
                System.out.println("Digite o valor da rentabilidade: ");                
                contaPoupanca.setRentabilidade(ler.nextDouble());
                
                listaConta.add(contaPoupanca);

                System.out.printf("Conta cadastrada com sucesso!");
                System.in.read();
            }
            else if (opcao == 3) {
            	Ex62ContaSalario contaSalario = new Ex62ContaSalario();
            	            	
            	contaSalario.setNumero(String.valueOf(numConta));
                numConta++;
                
                listaConta.add(contaSalario);
                
                System.out.printf("Conta cadastrada com sucesso!");
                System.in.read();
            }
            else if (opcao == 4) {
            	for (Ex62Conta c: listaConta) {
            		System.out.println("Agência: " + c.getAgencia());
            		System.out.println("Conta: " + c.getNumero());
            		System.out.println("Saldo: " + c.getSaldo());
            	}

                System.in.read();
            }
        } while ( (opcao >= 1) && (opcao <= 4) ); 
    }
}
