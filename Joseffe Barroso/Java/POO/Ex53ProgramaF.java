package poo;

import java.util.Scanner;

public class Ex53ProgramaF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex53Aluno[] alunos = new Ex53Aluno[2];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < alunos.length; i++) {
			Ex53Aluno aluno = new Ex53Aluno();
			System.out.printf("Digite o ra do %dº aluno: ", i+1);
			aluno.ra = ler.next();
			System.out.printf("Digite o nome do %dº aluno: ", i+1);
			aluno.nome = ler.next();
			String[] materias = new String[6];
			for (int i2 = 0; i2 < 6; i2++) {
				System.out.printf("Digite a sigla da %dª matéria do %dº aluno: ", i2+1, i+1);
				materias[i2] = ler.next();
			}
			aluno.materia = materias;
			System.out.printf("Digite o periodo do %dº aluno: ", i+1);
			aluno.periodo = ler.next().toLowerCase();
			
			alunos[i] = aluno;
		}
		
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].periodo.equals("noturno")) {
				System.out.printf("O %dº alunos se chama %s\n", i+1, alunos[i].nome);
				for(int j = 0; j < alunos[i].materia.length; j++) {
					System.out.printf("A %dº matéria do %d aluno é %s\n", j+1, i+1, alunos[i].materia[j]);
				}
			}
		}
	}
}
