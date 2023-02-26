package entrada_processamento_saida;

public class Ex40F {

	public static void main(String[] args) {		
		int ultimo, penultimo, count, termo, anti;
		
		ultimo = 1;
		penultimo = 1;
		anti = 1;
		termo = 0;
		
		System.out.printf("0\n");
		System.out.printf("1\n");
		System.out.printf("1\n");
		System.out.printf("1\n");
		for (count = 1; count <= 20; count++) {
			termo = ultimo + penultimo + anti;
			anti = penultimo;
		    penultimo = ultimo;
		    ultimo = termo;
		    System.out.printf("%d\n", termo);
		}
	}

}
