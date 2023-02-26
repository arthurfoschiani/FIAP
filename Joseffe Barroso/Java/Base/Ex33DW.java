package entrada_processamento_saida;

import java.util.Scanner;

public class Ex33DW {

	public static void main(String[] args) {
		//Criar uma rotina de entrada que aceite somente um valor positivo.
		
		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		do{
			System.out.printf("Digite seu sexo (M/F): ");
			sexo = ler.next().toUpperCase();
		}while (!sexo.equals("F") && !sexo.equals("M"));
	}

}
