package entrada_processamento_saida;

public class Ex38F {

	public static void main(String[] args) {
		//Exibir a soma dos números inteiros positivos do intervalo de um a cem.
		
		int ultimo, soma, count;
		
		ultimo = 0;
		soma = 0;
		
		for (count = 0; count <= 100; count++) {
			soma = count + ultimo;
		    ultimo = soma;
		}
		
		System.out.printf("%d", soma);
	}

}
