package program;

import java.io.IOException;
import java.util.Scanner;

import model.Usuario;
import service.GitHubService;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		GitHubService githubservice = new GitHubService();
		
		String user = "";
			
		System.out.printf("Digite o usuário que deseja buscar: ");
		user = ler.next();
	
        try {
            Usuario usuario = githubservice.getUsuario(user);
            
            System.out.println("Nome: " + usuario.getName());
            System.out.println("Quantidade de repositórios: " + usuario.getPublic_repos());
            System.out.println("Quantidade de seguidores: " + usuario.getFollowers());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
