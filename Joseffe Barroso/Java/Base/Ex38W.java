package entrada_processamento_saida;

public class Ex38W {

	public static void main(String[] args) {
		//Exibir a soma dos números inteiros positivos do intervalo de um a cem.
		
		int ultimo, soma, count;
		
		ultimo = 0;
		soma = 0;
		count = 0;
		
		while (count <= 100) {
			soma = count + ultimo;
		    ultimo = soma;
		    count++;
		}
		
		System.out.printf("%d", soma);
	}

}
