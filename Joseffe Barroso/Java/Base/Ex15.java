package entrada_processamento_saida;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		//Verificar se formam ou não um triângulo
		
		Scanner ler = new Scanner(System.in);
		
		float l1, l2, l3;
		boolean boole = true;
		
		System.out.printf("Digite o primeiro lado do triangulo: ");
		l1 = ler.nextFloat();
		
		System.out.printf("Digite o segundo lado do triangulo: ");
		l2 = ler.nextFloat();
		
		System.out.printf("Digite o terceiro lado do triangulo: ");
		l3 = ler.nextFloat();

		if (l1 <= l3 && l2 <= l3) {
		    if (l1 + l2 <= l3){
		        boole = false;
		    }
		}
		else if (l2 <= l1 && l3 <= l1) {
		    if (l2 + l3 <= l1) {
		        boole = false;
		    }
		}
		else if (l3 <= l2 && l1 <= l2) {
		    if (l1 + l3 <= l2){
		        boole = false;
		    }
		}
		else {
		    System.out.printf("erro");
		}

		if (boole == true) {
		    if (l1 == l2 && l2 == l3) {
		        System.out.printf("Este trinagulo é equilátero");
		    }
	        else if (l1 == l2 && l2 != l3 || l2 == l3 && l3 != l1 || l1 == l3 && 13 != l2){
		        System.out.printf("Este é um triangulo isósceles");
		    }
		    else {
		        System.out.printf("Este é um triangulo escaleno");
		    }
		}
		else {
		    System.out.printf("As medidas não formam um trinagulo");
		}
	}

}
