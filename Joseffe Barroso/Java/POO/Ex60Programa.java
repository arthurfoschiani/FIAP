package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex60Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
	       
        ArrayList<Ex60Cliente> listaClientes = new ArrayList<>();
 
        int opcao;
        int id;
        Ex60Cliente cli;
        int indexCliente;
        int id_cliente;
        double valor;
        int indexClienteOrigem;
        int indexClienteDestino;
        int id_cliente_origem;
        int id_cliente_destino;
        Ex60Cliente cli_origem;
        Ex60Cliente cli_destino;
       
        do {        
           System.out.printf("===> Macgyver Internet Banking <===\n\n");
           System.out.printf("Escolha uma opção:\n");          
           System.out.printf("1 - Criar cliente e conta \n" +
                             "2 - Depósito \n" +
                             "3 - Saque \n" +
                             "4 - Transferência \n" +
                             "5 - Consulta de saldo \n" +
                             "6 - Consulta de extrato \n" +
                             "7 - Sair\n\n");
 
           System.out.printf("Digite a opção desejada: ");
           opcao = ler.nextInt();
           
           if (opcao == 1) {
               Ex60Cliente cliente = new Ex60Cliente();
               
               if(listaClientes.size() > 0) {
                   id_cliente = listaClientes.get(listaClientes.size()-1).getId() + 1;
               }
               else {
                   id_cliente = 1;
               }
               cliente.setId(id_cliente);
               
               System.out.print("Digite o seu nome: ");
               cliente.setNome(ler.next());
               
               System.out.print("Digite a seu idade: ");
               cliente.setIdade(ler.nextInt());
               
               Ex60ContaBancaria conta = new Ex60ContaBancaria();
                                       
               //System.out.print("Digite a agencia: ");
               //conta.setAgencia(ler.next());
               
               //System.out.print("Digite o numero: ");
               //conta.setNumero(ler.next());
               
               conta.setNumero("00" + String.valueOf(id_cliente));
                           
               cliente.setConta(conta);
               
               listaClientes.add(cliente);
               
               System.out.printf("Cliente e conta cadastrados com sucesso!");
               System.in.read();
           }
           else if(opcao == 2) {
               for(Ex60Cliente c: listaClientes) {
                   System.out.println(c.ExibirDadosClienteConta());
               }
               
               if (listaClientes.size() == 0) {
                   System.out.print("Não existem clientes cadastrados!");
                   System.in.read();
                   continue;
               }
               
               System.out.print("Digite o ID do cliente que voc� deseja realizar um dep�sito: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Ex60Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
                   System.out.print("Digite o valor do dep�sito: ");
                   valor = ler.nextDouble();
                   
                   while(valor < 0) {
                       System.out.print("Erro, valor negativo! Digite um novo valor: ");
                       valor = ler.nextDouble();
                   }
                   
                   cli.getConta().Depositar(valor, false);
                                   
                   System.out.printf("Dep�sito realizado com sucesso!");
               }
               else {
                   System.out.printf("Cliente n�o encontrado!");
               }
               
               System.in.read();
           }
           else if(opcao == 3) {
               for(Ex60Cliente c: listaClientes) {
                   System.out.println(c.ExibirDadosClienteConta());
               }
               
               System.out.print("Digite o ID do cliente que voc� deseja realizar um saque: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Ex60Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
                   System.out.print("Digite o valor do saque: ");
                   valor = ler.nextDouble();
                   
                   while(valor < 0) {
                       System.out.print("Erro, valor negativo! Digite um novo valor: ");
                       valor = ler.nextDouble();
                   }
               
                   if (cli.getConta().Sacar(valor, false))
                       System.out.printf("Saque realizado com sucesso!");                      
                   else
                       System.out.printf("Saldo insuficiente para saque!");
/*
                   if (cli.getConta().getSaldo() >= valor) {
                       cli.getConta().Sacar(valor);
                       System.out.printf("Saque realizado com sucesso!");                      
                   }
                   else {
                       System.out.printf("Saldo insuficiente para saque!");
                   }
*/
               }
               else {
                   System.out.printf("Cliente n�o encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 4) {
               for(Ex60Cliente c: listaClientes) {
                   System.out.println(c.ExibirDadosClienteConta());
               }
               
               System.out.print("Digite o ID do cliente de origem da transfer�ncia: ");
               id_cliente_origem = ler.nextInt();
               
               indexClienteOrigem = -1;
               for(Ex60Cliente c: listaClientes) {
                   if (c.getId() == id_cliente_origem) {
                       indexClienteOrigem = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               System.out.print("Digite o ID do cliente de destino da transfer�ncia: ");
               id_cliente_destino = ler.nextInt();
               
               indexClienteDestino = -1;
               for(Ex60Cliente c: listaClientes) {
                   if (c.getId() == id_cliente_destino) {
                       indexClienteDestino = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if ( (indexClienteOrigem != -1) && (indexClienteDestino != -1) ) {
                   cli_origem = listaClientes.get(indexClienteOrigem);
                   cli_destino = listaClientes.get(indexClienteDestino);
                   
                   if (cli_origem == cli_destino) {
                       System.out.print("Erro! O cliente de origem é o mesmo de destino!");
                   }
                   else {
                       System.out.print("Digite o valor da transfer�ncia: ");
                       valor = ler.nextDouble();
                       
                       while(valor < 0) {
                           System.out.print("Erro, valor negativo! Digite um novo valor: ");
                           valor = ler.nextDouble();
                       }
                       
                       if (cli_origem.getConta().getSaldo() + cli_origem.getConta().getLimite() >= valor) {
                           cli_origem.getConta().Transferir(valor, cli_destino, cli_origem);
                           System.out.printf("Transfer�ncia realizada com sucesso!");                      
                       }
                       else {
                           System.out.printf("Saldo insuficiente para transferência!");
                       }
                   }
               }
               else {
                   System.out.printf("Cliente origem ou cliente destino n�o encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 5) {
               for(Ex60Cliente c: listaClientes) {
                   System.out.println(c.ExibirDadosClienteConta());
               }
               
               System.out.print("Digite o ID do cliente que voc� deseja obter o saldo: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Ex60Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
                   System.out.print("Saldo: R$ " + cli.getConta().ConsultarSaldo());
               }
               else {
                   System.out.printf("Cliente n�o encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 6) {
               for(Ex60Cliente c: listaClientes) {
                   System.out.println(c.ExibirDadosClienteConta());
               }
               
               System.out.print("Digite o ID do cliente que você deseja obter o extrato: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Ex60Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
                   System.out.print(cli.getConta().ConsultarExtrato());
               }
               else {
                   System.out.printf("Cliente não encontrado!");
               }
               System.in.read();
           }
           
        }while( (opcao >= 1) && (opcao <= 6) );
    }
}
