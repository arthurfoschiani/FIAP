package entrada_processamento_saida;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		//Verificar se formam ou não um triângulo retangulo
		
		Scanner ler = new Scanner(System.in);
		
		float l1, l2, l3;
		boolean boole = false;
		
		System.out.printf("Digite o primeiro lado do triangulo: ");
		l1 = ler.nextFloat();
		
		System.out.printf("Digite o segundo lado do triangulo: ");
		l2 = ler.nextFloat();
		
		System.out.printf("Digite o terceiro lado do triangulo: ");
		l3 = ler.nextFloat();

		if (l1 > l2 && l1 > l3) {
		    if (l1 * l1 == l2 * l2 + l3 * l3){
		        boole = true;
		    }
		}
		else if (l2 > l1 && l1 > l3) {
		    if (l2 * l2 == l1 * l1 + l3 * l3) {
		        boole = true;
		    }
		}
		else if (l3 > l1 && l3 > l2) {
		    if (l3 * l3 == l2 * l2 + l1 * l1){
		        boole = true;
		    }
		}

		if (boole == true) {
		    System.out.printf("É um triangulo retângulo");
		}
		else {
		    System.out.printf("Não é um triangulo retangulo");
		}
	}

}
