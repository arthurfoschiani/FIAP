package Program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Model.Backend;
import Model.Frontend;
import Model.Tecnologia;

public class Program {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Tecnologia> tecnologias = new ArrayList<Tecnologia>();
        
        int numTecnologias = 0;

        try {
        	
        	try {
	            System.out.print("Quantas tecnologias você deseja criar? ");
	            numTecnologias = scanner.nextInt();
	            scanner.nextLine();
        	} catch (InputMismatchException e) {
        	    System.out.println("Entrada inválida. O número de tecnologias deve ser um valor inteiro.");
        	    System.in.read();
                main(args);
        	}

            for (int i = 0; i < numTecnologias; i++) {
                System.out.print("Deseja criar uma tecnologia de backend ou frontend? (B/F) ");
                String tipoTecnologia = scanner.nextLine();
                try {
	                if (tipoTecnologia.equalsIgnoreCase("B")) {
	                    Backend tecnologia = new Backend();
	                    tecnologia.setLinguagemProgramacao(lerDado(scanner, "Linguagem de programação: "));
	                    tecnologia.setDescricaoLinguagem(lerDado(scanner, "Descrição da linguagem: "));
	                    tecnologia.setPrincipalFramework(lerDado(scanner, "Framework principal: "));
	                    tecnologia.setDescricaoFramework(lerDado(scanner, "Descrição do Framework: "));
	                    tecnologia.setConteinerizar(lerDadoBoolean(scanner, "É possível conteinerizar o desenvolvimento? (s/n) "));
	                    tecnologias.add(tecnologia);
	                } else if (tipoTecnologia.equalsIgnoreCase("F")) {
	                    Frontend tecnologia = new Frontend();
	                    tecnologia.setLinguagemProgramacao(lerDado(scanner, "Linguagem de programação: "));
	                    tecnologia.setDescricaoLinguagem(lerDado(scanner, "Descrição da linguagem: "));
	                    tecnologia.setPrincipalFramework(lerDado(scanner, "Framework principal: "));
	                    tecnologia.setDescricaoFramework(lerDado(scanner, "Descrição do Framework: "));
	                    tecnologia.setIsWeb(lerDadoBoolean(scanner, "É compatível com web? (s/n) "));
	                    tecnologia.setIsMobile(lerDadoBoolean(scanner, "É compatível com mobile? (s/n) "));
	                    tecnologias.add(tecnologia);
	                } else {
	                    System.out.println("Tipo de tecnologia inválido. Tente novamente.");
	                    i--;
	                }
                } catch (Exception e) {
            	   System.out.println("Erro ao criar tecnologia: " + e.getMessage());
            	   System.in.read();
                   main(args);
            	}
            }
            
            try {
	            for (Tecnologia tecnologia : tecnologias) {
	                System.out.println("Linguagem: " + tecnologia.getLinguagemProgramacao());
	                System.out.println("Framework: " + tecnologia.getPrincipalFramework());
	                System.out.println("Descrição da linguagem: " + tecnologia.getDescricaoLinguagem());
	                System.out.println("Descrição do framework: " + tecnologia.getDescricaoFramework());
	                System.out.println();
	            }
            } catch (Exception e) {
        	   System.out.println("Erro ao acessar tecnologia: " + e.getMessage());
        	}
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. O número de tecnologias deve ser um valor inteiro.");
            System.in.read();
            main(args);
        }
	}
	
	private static String lerDado(Scanner scanner, String mensagem) {
		try {
	        System.out.print(mensagem);
	        return scanner.nextLine();
		} catch (Exception e) {
	        System.out.println("Erro ao ler dado: " + e.getMessage());
	        return "";
	    }
    }

    private static boolean lerDadoBoolean(Scanner scanner, String mensagem) {
    	try {
	        System.out.print(mensagem);
	        String resposta = scanner.nextLine();
	        return resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("SIM");
    	} catch (Exception e) {
            System.out.println("Erro ao ler dado booleano: " + e.getMessage());
            return false;
        }
    }
}
