package Program;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Model.Dominio;
import Service.DominioService;

public class Programa {

	public static void main(String[] args) throws URISyntaxException, IOException {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do domínio que deseja verificar:");
        String nome = scanner.nextLine();
        
        Dominio dominio = new Dominio(nome);
        
        DominioService service = new DominioService();
        
        service.verificarDominio(dominio);
        
        if (dominio.isDisponivel()) {
            System.out.println("Domínio disponível");
        } else {
        	if (dominio.getDataExpiracao() != null) {
        	    String dataExpiracaoFormatada = dominio.getDataExpiracao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        	    System.out.println("Domínio já utilizado. Data de expiração: " + dataExpiracaoFormatada);
        	} else {
        	    System.out.println("Domínio já utilizado.");
        	}
        }
        
        scanner.close();
	}

}
