from ConnectionBD import execute, executeSelect

def incluir_aluno():
    id = int(input("Digite o ID do aluno: "))
    nome = input("Digite o nome do aluno: ")
    ra = int(input("Digite o RA do aluno: "))
    curso = input("Digite o curso do aluno: ")
    request = execute("INSERT INTO TB_ALUNO VALUES ({}, '{}', {}, '{}')".format(id, nome, ra, curso))
    if(request[0]):
        print("Aluno adicionado com sucesso!")
    else:
        print(f"Ocorreu um problema durante a execução: {str(request[1])}")

def atualizar_aluno():
    id = int(input("Digite o ID do aluno a ser atualizado: "))
    request = executeSelect('SELECT * FROM TB_ALUNO WHERE ID={}'.format(id))
    if (request[0]):
        if (request[1]):
            nome = input("Digite o novo nome do aluno: ")
            curso = input("Digite o novo curso do aluno: ")
            request = execute("update tb_aluno set nome = '{}', curso = '{}' where id = {}".format(nome, curso, id))
            if(request[0]):
                print("Aluno atualizado com sucesso!")
            else:
                print(f"Ocorreu um problema durante a execução: {str(request[1])}")
        else:
            print("Aluno não encontrado.")
    else:
        print(f"Ocorreu um problema durante a execução: {str(request[1])}")

def excluir_aluno():
    id = int(input("Digite o ID do aluno a ser excluído: "))
    request = executeSelect('SELECT * FROM TB_ALUNO WHERE ID={}'.format(id))
    if (request[0]):
        if (request[1]):
            request = execute("delete from tb_aluno where id = {}".format(id))
            if(request):
                print("Aluno deletado com sucesso!")
            else:
                print(f"Ocorreu um problema durante a execução: {str(request[1])}")
        else:
            print("Aluno não encontrado.")
    else:
        print(f"Ocorreu um problema durante a execução: {str(request[1])}")

def listar_alunos():
    request = executeSelect('SELECT * FROM tb_aluno order by 1')
    if (request[0]):
        if (request[1]):
            for aluno in request[1]:
                print("ID: ", aluno[0])
                print("Nome: ", aluno[1])
                print("RA: ", aluno[2])
                print("Curso: ", aluno[3])
                print("")
        else:
            print("Aluno não encontrado.")
    else:
        print(f"Ocorreu um problema durante a execução: {str(request[1])}")

def listar_aluno():
    id = int(input("Digite o ID do aluno a ser listado: "))
    request = executeSelect('SELECT * FROM TB_ALUNO WHERE ID={}'.format(id))
    if (request[0]):
        if (request[1]):
            print("ID: ", request[1][0][0])
            print("Nome: ", request[1][0][1])
            print("RA: ", request[1][0][2])
            print("Curso: ", request[1][0][3])
        else:
            print("Aluno não encontrado.")
    else:
        print(f"Ocorreu um problema durante a execução: {str(request[1])}")

while True:
    print("Menu:")
    print("1 - Incluir aluno")
    print("2 - Atualizar aluno")
    print("3 - Excluir aluno")
    print("4 - Listar todos os alunos")
    print("5 - Listar um aluno")
    print("0 - Sair")
    opcao = input("Digite a opção desejada: ")

    if opcao == "1":
        incluir_aluno()
    elif opcao == "2":
        atualizar_aluno()
    elif opcao == "3":
        excluir_aluno()
    elif opcao == "4":
        listar_alunos()
    elif opcao == "5":
        listar_aluno()
    elif opcao == "0":
        print("Encerrando o programa.")
        break
    else:
        print("Opção inválida. Digite um número de 0 a 5.")
