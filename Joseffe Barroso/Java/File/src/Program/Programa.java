package Program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Model.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[10];
        String nome;
        Double quantidade;
        Double preco;

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i+1) + ":");
            System.out.print("Nome: ");
            nome = scanner.next();
            System.out.print("Quantidade: ");
            quantidade = scanner.nextDouble();
            System.out.print("Preço unitário: ");
            preco = scanner.nextDouble();
            produtos[i] = new Produto(nome, quantidade, preco);
        }
        
        String path = "C:\\temp\\arquivo02.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for(Produto produto: produtos) {
                bw.write(produto.getNome() + "," + produto.getQuantidade() + "," + produto.getPreco_unit());
                bw.newLine();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
	}

}
