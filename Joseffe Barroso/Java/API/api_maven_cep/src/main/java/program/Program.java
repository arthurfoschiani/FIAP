package program;

import java.io.IOException;
import java.util.Scanner;

import model.Endereco;
import service.ViaCepService;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ViaCepService viacepservice = new ViaCepService();
		
		String cep = "11111111";
		
		while (cep.length() == 8) {
			
			System.out.printf("Digite o cep que deseja buscar: ");
			cep = ler.next();
			
			while (cep.length() != 8 && cep.length() != 0) {
				System.out.printf("Digite cep válido: ");
				cep = ler.next();
			}
		
	        try {
	            Endereco endereco = viacepservice.getEndereco(cep);
	            
	            System.out.println("Logradouro: " + endereco.getLogradouro());
	            System.out.println("Bairro: " + endereco.getBairro());
	            System.out.println("Localidade: " + endereco.getLocalidade());
	            System.out.println("UF: " + endereco.getUf());
	            System.out.println("DDD: " + endereco.getDdd());
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } 
		}

	}

}
