package poo;

import java.util.Scanner;

public class Ex53ProgramaW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex53Aluno[] alunos = new Ex53Aluno[5];
		Scanner ler = new Scanner(System.in);
		
		int i = 0;
		while (i < 5) {
			Ex53Aluno aluno = new Ex53Aluno();
			System.out.printf("Digite o ra do %dº aluno: ", i+1);
			aluno.ra = ler.next();
			System.out.printf("Digite o nome do %dº aluno: ", i+1);
			aluno.nome = ler.next();
			String[] materias = new String[6];
			int i2 = 0;
			while (i2 < 6) {
				System.out.printf("Digite a sigla da %dª matéria do %dº aluno: ", i2+1, i+1);
				materias[i2] = ler.next();
				i2++;
			}
			aluno.materia = materias;
			System.out.printf("Digite o periodo do %dº aluno: ", i+1);
			aluno.periodo = ler.next();
			
			alunos[i] = aluno;
			i++;
		}
		
		i = 0;		
		while (i < 5) {
			if (alunos[i].periodo.equals("noturno"))
				System.out.printf("O %dº alunos se chama %s\n", i+1, alunos[i].nome);
			
			i++;
		}
	}
}
