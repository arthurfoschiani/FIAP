package Program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import Model.Movie;
import Model.Comment;
import Service.MovieService;

public class Program {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		MovieService filmeService = new MovieService();
		
		HashMap<Integer, Movie> movies = filmeService.getMovies();
		
        Scanner scanner = new Scanner(System.in); 
        
        Integer opcao = 0;
         
        do {
        	
        	System.out.println("Lista de filmes: ");
    		movies.forEach((key, value) -> {
    			System.out.println(value);
    		});
        	
        	System.out.println("");
            System.out.println("Escolha uma opção");
            System.out.println("1. Ver detalhes do filme");
            System.out.println("2. Fazer um comentário do filme");
            System.out.println("3. Excluir um comentário");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            
            while (opcao < 1 || opcao > 4) {
            	System.out.println("Opcao inválida. Digite novamente.");
                opcao = scanner.nextInt();
            }
            
            if (opcao == 1) {
            	System.out.println("Digite o id do filme: ");
                int id = scanner.nextInt();

                Movie movie = movies.get(id);
                if (movie == null) {
                    System.out.println("Filme não encontrado.");
                    scanner.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();
                    continue;
                }

                System.out.println("Nome: " + movie.getTitulo());
                System.out.println("Sinopse: " + movie.getSinopse());

                ArrayList<Comment> comments = movie.getComentarios();
                if (comments.size() > 0) {
                    System.out.println("\nComentários:");
                    for (Comment comment : comments) {
                        System.out.println(comment);
                        System.out.println("================");
                    }
                } else {
                    System.out.println("\nNenhum comentário.");
                }
                scanner.nextLine();
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
                
            } else if (opcao == 2) {
            	System.out.println("Digite o id do filme: ");
                int id = scanner.nextInt();

                Movie movie = movies.get(id);
                if (movie == null) {
                    System.out.println("Filme não encontrado.");
                    scanner.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();
                    break;
                }

                System.out.println("Digite o seu nome: ");
                String autor = scanner.next();

                System.out.println("Digite o comentário: ");
                String conteudo = scanner.next();

                int comentarioId = movie.getComentarios().size() + 1;
                
                Comment comment = new Comment(comentarioId, autor, conteudo);
                
                movie.adicionarComentario(comment);
                
                System.out.println("Comentário adicionado com sucesso.");
                
                scanner.nextLine();
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
                
            } else if (opcao == 3) {
            	
            	System.out.println("Digite o id do filme: ");
                int id = scanner.nextInt();

                Movie movie = movies.get(id);
                if (movie == null) {
                    System.out.println("Filme não encontrado.");
                    scanner.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();
                    break;
                }

                ArrayList<Comment> comments = movie.getComentarios();
                if (comments.size() == 0) {
                    System.out.println("Não há comentários a serem excluídos.");
                    scanner.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();
                    break;
                }
                
                System.out.println("\nComentários:");
                for (Comment comment : comments) {
                    System.out.println(comment);
                    System.out.println("================");
                }

                System.out.print("Digite o id do comentário que deseja excluir: ");
                int comentarioId = scanner.nextInt() - 1;

                if (comentarioId < 0 || comentarioId >= comments.size()) {
                    System.out.println("Comentário inválido.");
                    scanner.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();
                    break;
                }

                movie.excluirComentario(comentarioId);
                System.out.println("Comentário excluído com sucesso.");
                
                scanner.nextLine();
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
                
            } else if (opcao == 4) {
            	System.out.println("Até mais! Volte sempre que quiser.");
                break;
            }
        } while (opcao >= 1 && opcao <= 4);
	}

}
