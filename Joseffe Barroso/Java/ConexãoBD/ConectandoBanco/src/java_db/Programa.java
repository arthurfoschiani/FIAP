package java_db;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		AlunoDBOracle db = new AlunoDBOracle();
        
        int opcao = 0;
        
        do {
            System.out.println("Menu:");
            System.out.println("1 - Incluir alunos");
            System.out.println("2 - Atualizar alunos");
            System.out.println("3 - Excluir alunos");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Buscar aluno por ID");
            System.out.println("0 - Sair");
            
            try {
            	try {
                    System.out.println("Digite a opção desejada: ");
                    opcao = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite um número inteiro.");
                    opcao = 0;
                }
	            
	            switch (opcao) {
	                case 1:                    
	                    System.out.print("\nDigite o id do aluno: ");
	                    int id = scanner.nextInt();
	                    
	                    System.out.print("Digite o nome do aluno: ");
	                    String nome = scanner.next();
	                    
	                    System.out.print("Digite o RA do aluno: ");
	                    int ra = scanner.nextInt();
	                    
	                    System.out.print("Digite o curso do aluno: ");
	                    String curso = scanner.next();
	                    
	                    Aluno novoAluno = new Aluno(id, nome, ra, curso);
	                    
	                    db.InserirAlunoDB(novoAluno);
	                    
	                    System.out.println("\nAluno cadastrado com sucesso!");
	                    break;
	                case 2:
	                	System.out.print("\nDigite o id do aluno que deseja atualizar: ");
	                    int idAtt = scanner.nextInt();
	                    
	                    Aluno alunoBuscadoAtt = db.burcarPorId(idAtt);
	                    
	                    if (alunoBuscadoAtt != null) {
	                        System.out.println("\nAluno encontrado: ");
	                        System.out.println("ID: " + alunoBuscadoAtt.getId());
	                        System.out.println("Nome: " + alunoBuscadoAtt.getNome());
	                        System.out.println("RA: " + alunoBuscadoAtt.getRa());
	                        System.out.println("Curso: " + alunoBuscadoAtt.getCurso());
	                        
	                        System.out.print("\nDigite o novo nome do aluno: ");
	                        String novoNome = scanner.next();
	                        
	                        System.out.print("Digite o novo curso do aluno: ");
	                        String novoCurso = scanner.next();
	                        
	                        Aluno alunoAtualizado = new Aluno(idAtt, novoNome, alunoBuscadoAtt.getRa(), novoCurso);
	                        
	                        db.AtualizarUsuarioDB(alunoAtualizado);
	                        
	                        System.out.println("\nAluno atualizado com sucesso!");
	                        
	                    } else {
	                        System.out.println("\nAluno não encontrado!");
	                    }
	                    break;
	                case 3:
	                	System.out.print("\nDigite o id do aluno que deseja deletar: ");
	                    int idDel = scanner.nextInt();
	                    
	                    Aluno alunoBuscadoDel = db.burcarPorId(idDel);
	                    
	                    if (alunoBuscadoDel != null) {
	                        System.out.println("\nAluno encontrado: ");
	                        System.out.println("ID: " + alunoBuscadoDel.getId());
	                        System.out.println("Nome: " + alunoBuscadoDel.getNome());
	                        System.out.println("RA: " + alunoBuscadoDel.getRa());
	                        System.out.println("Curso: " + alunoBuscadoDel.getRa());
	                        System.out.println();
	                        
	                        db.ExcluirUsuarioDB(idDel);
	                        
	                        System.out.println("\nAluno deletado com sucesso!");
	                        
	                    } else {
	                        System.out.println("\nAluno não encontrado!");
	                    }
	                    break;
	                case 4:
	                	db.ListarUsuarioDB();                	
	                    break;
	                case 5:
	                	System.out.print("\nDigite o id do aluno que deseja buscar: ");
	                    int idList = scanner.nextInt();
	                    
	                    Aluno alunoBuscadoList = db.burcarPorId(idList);
	                    
	                    if (alunoBuscadoList != null) {
	                        System.out.println("\nAluno encontrado: ");
	                        System.out.println("ID: " + alunoBuscadoList.getId());
	                        System.out.println("Nome: " + alunoBuscadoList.getNome());
	                        System.out.println("RA: " + alunoBuscadoList.getRa());
	                        System.out.println("Curso: " + alunoBuscadoList.getRa());
	                        System.out.println();                        
	                    } else {
	                        System.out.println("\nAluno não encontrado!");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa...");
	                    System.out.println("Programa encerrado");
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
            } catch (Exception e) {
            	System.out.println(e);
            }
            
        } while (opcao != 0);
        
        scanner.close();
	}

}
