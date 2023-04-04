package Ex01;

import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		String alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo";

        HashMap<String, String[]> candidatos = new HashMap<>();

        String[] alunos = alunosVestibular.split(";");
        for (String aluno : alunos) {
            String[] infoAluno = aluno.split(",");
            double nota = Double.parseDouble(infoAluno[1]);
            if (nota >= 7) {
                candidatos.put(infoAluno[0], infoAluno);
            }
        }

        for (String nome : candidatos.keySet()) {
            String[] infoAluno = candidatos.get(nome);
            System.out.println("Nome: " + infoAluno[0]);
            System.out.println("Nota: " + infoAluno[1]);
            System.out.println("Cidade: " + infoAluno[2]);
            System.out.println();
        }
	}

}
