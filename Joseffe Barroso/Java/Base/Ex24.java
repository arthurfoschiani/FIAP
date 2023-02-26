package entrada_processamento_saida;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		//Algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		
		System.out.printf("Qual seu nome? ");
		nome = ler.next();
		
		System.out.printf("Qual seu sexo? (M/F) ");
		sexo = ler.next().toUpperCase();

		//while (sexo != "F" && sexo != "M")
		//	System.out.printf("Valor inválido. Digite 'M' ou 'F': ");
		//	sexo = ler.next().toUpperCase();
			
		System.out.printf("Qual seu estado civil? (SOLTEIRA/CASADA) ");
		estadoCivil = ler.next().toUpperCase();

		//while (estadoCivil != "SOLTEIRA" && estadoCivil != "CASADA")
		//	System.out.printf("Valor inválido. Digite 'SOLTEIRA' ou 'CASADA': ");
		//	estadoCivil = ler.next().toUpperCase();

		if (sexo.equals("F") && estadoCivil.equals("CASADA")) {
			System.out.printf("Há quanto tempo você está casada? ");
			nome = ler.next();
		}

	}

}
