from Alunos import Aluno

alunos = {}

while True:
    print('1 - Incluir aluno')
    print('2 - Alterar aluno')
    print('3 - Excluir aluno')
    print('4 - Exibir alunos')
    print('0 - Sair')
    opcao = input('Escolha uma opção: ')

    if opcao == '1':
        nome = input('Nome: ')
        idade = int(input('Idade: '))
        ra = int(input('RA: '))
        curso = input('Curso: ')
        cep = input('CEP: ')

        aluno = Aluno(nome, idade, ra, curso, cep)
        alunos[ra] = aluno
        print('Aluno incluído com sucesso!\n')

    elif opcao == '2':
        ra = int(input('Digite o RA do aluno que deseja alterar: '))

        if ra in alunos:
            nome = input('Nome: ')
            idade = int(input('Idade: '))
            curso = input('Curso: ')
            cep = input('CEP: ')

            novo_aluno = Aluno(nome, idade, ra, curso, cep)
            alunos[ra] = novo_aluno
            print('Aluno alterado com sucesso!\n')
        else:
            print('RA não encontrado!\n')

    elif opcao == '3':
        ra = int(input('Digite o RA do aluno que deseja excluir: '))

        if ra in alunos:
            del alunos[ra]
            print('Aluno excluído com sucesso!\n')
        else:
            print('RA não encontrado!\n')

    elif opcao == '4':
        if alunos:
            for ra, aluno in alunos.items():
                print(f'RA: {ra}')
                print(f'Nome: {aluno.nome}')
                print(f'Idade: {aluno.idade}')
                print(f'Curso: {aluno.curso}')
                print(f'CEP: {aluno.cep}')
                print(f'Endereço: {aluno.endereco}')
                print(f'Bairro: {aluno.bairro}')
                print(f'Cidade: {aluno.cidade}')
                print()
        else:
            print('Nenhum aluno cadastrado!\n')

    elif opcao == '0':
        break

    else:
        print('Opção inválida!\n')