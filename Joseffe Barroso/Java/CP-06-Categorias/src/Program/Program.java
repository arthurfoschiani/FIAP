package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

import Connection.categoriaConnection;
import Model.Categoria;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		categoriaConnection db = new categoriaConnection();
        
        int opcao = 0;
        
        do {
            System.out.println("Menu:");
            System.out.println("1 - Incluir Categoria");
            System.out.println("2 - Atualizar Categoria");
            System.out.println("3 - Excluir Categoria");
            System.out.println("4 - Listar Categorias");
            System.out.println("5 - Buscar Categoria por ID");
            System.out.println("0 - Sair");
            
            try {
            	try {
                    System.out.println("Digite a opção desejada: ");
                    opcao = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite um número inteiro.");
                    opcao = 0;
                }
	            
	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome da Categoria: ");
	                    String nome = scanner.nextLine();
	                    
	                    db.InserirCategoriaDB(nome);
	                    
	                    System.out.println("\nCategoria cadastrada com sucesso!");
	                    System.in.read();
	                    break;
	                case 2:
	                	System.out.print("\nDigite o id do Categoria que deseja atualizar: ");
	                    int idAtt = scanner.nextInt();
	                    
	                    Categoria CategoriaBuscadaAtt = db.burcarPorId(idAtt);
	                    
	                    if (CategoriaBuscadaAtt != null) {
	                        System.out.println("\nCategoria encontrada: ");
	                        System.out.println("ID: " + CategoriaBuscadaAtt.getId());
	                        System.out.println("Nome: " + CategoriaBuscadaAtt.getNome());
	                        
	                        System.out.print("\nDigite o novo nome da Categoria: ");
	                        String novoNome = scanner.nextLine();
	                        
	                        Categoria CategoriaAtualizada = new Categoria(idAtt, novoNome);
	                        
	                        db.AtualizarCategoriaDB(CategoriaAtualizada);
	                        
	                        System.out.println("\nCategoria atualizada com sucesso!");
	                        System.in.read();
	                        
	                    } else {
	                        System.out.println("\nCategoria não encontrada!");
	                    }
	                    break;
	                case 3:
	                	System.out.print("\nDigite o id da Categoria que deseja deletar: ");
	                    int idDel = scanner.nextInt();
	                    
	                    Categoria CategoriaBuscadaDel = db.burcarPorId(idDel);
	                    
	                    if (CategoriaBuscadaDel != null) {
	                        System.out.println("\nCategoria encontrada: ");
	                        System.out.println("ID: " + CategoriaBuscadaDel.getId());
	                        System.out.println("Nome: " + CategoriaBuscadaDel.getNome());
	                        System.out.println();
	                        
	                        db.ExcluirCategoriaDB(idDel);
	                        
	                    } else {
	                        System.out.println("\nCategoria não encontrada!");
	                    }
	                    break;
	                case 4:
	                	db.ListarCategoriasDB();                	
	                    break;
	                case 5:
	                	System.out.print("\nDigite o id da Categoria que deseja buscar: ");
	                    int idList = scanner.nextInt();
	                    
	                    Categoria CategoriaBuscadaList = db.burcarPorId(idList);
	                    
	                    if (CategoriaBuscadaList != null) {
	                        System.out.println("\nCategoria encontrada: ");
	                        System.out.println("ID: " + CategoriaBuscadaList.getId());
	                        System.out.println("Nome: " + CategoriaBuscadaList.getNome());
	                        System.out.println();                        
	                    } else {
	                        System.out.println("\nCategoria não encontrada!");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa...");
	                    System.out.println("Programa encerrado");
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
            } catch (Exception e) {
            	System.out.println(e);
            }
            
        } while (opcao != 0);
        
        scanner.close();
	}
}
