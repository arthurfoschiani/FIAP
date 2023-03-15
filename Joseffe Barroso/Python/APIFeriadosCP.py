from datetime import datetime

def buscar_feriados():
    response = [
                    {"date":"2023-01-01","name":"Confraternização mundial","type":"national"},
                    {"date":"2023-02-21","name":"Carnaval","type":"national"},
                    {"date":"2023-04-07","name":"Sexta-feira Santa","type":"national"},
                    {"date":"2023-04-09","name":"Páscoa","type":"national"},
                    {"date":"2023-04-21","name":"Tiradentes","type":"national"},
                    {"date":"2023-05-01","name":"Dia do trabalho","type":"national"},
                    {"date":"2023-06-08","name":"Corpus Christi","type":"national"},
                    {"date":"2023-09-07","name":"Independência do Brasil","type":"national"},
                    {"date":"2023-10-12","name":"Nossa Senhora Aparecida","type":"national"},
                    {"date":"2023-11-02","name":"Finados","type":"national"},
                    {"date":"2023-11-15","name":"Proclamação da República","type":"national"},
                    {"date":"2023-12-25","name":"Natal","type":"national"}
                ]

    return response

opcao = 1
idComentario = 0

feriados = buscar_feriados()
for i, item in enumerate(feriados):
    item['id'] = i + 1
    item['comments'] = []
    data = datetime.strptime(item['date'], '%Y-%m-%d')
    item['date'] = data.strftime("%d/%m/%Y")

while (opcao > 0 and opcao < 4):

    print("----- Seja bem vindo! -----")
    for i, item in enumerate(feriados):
        print(f"{item['id']} - {item['date']}")

    print("")
    print("===== Menu =====")
    print("1 - Ver detalhes do feriado")
    print("2 - Fazer um comentário do feriado")
    print("3 - Excluir um comentário")
    print("4 - Sair")
    opcao = int(input("Digite uma opção: "))

    if (opcao == 1):
        idFeriado = int(input("Digite o id do feriado: "))
        encontrado = False
        for item in feriados:
            if (item['id'] == idFeriado):
                print("Nessa data, será:")
                print(f"==== {item['name']} ====")
                if (item['comments']):
                    print('Os comentários são: ')
                    for comment in item['comments']:
                        print(f"{comment['id']} - {comment['nome']} comentou: {comment['comentario']}")
                else:
                    print('Não existem comentários cadastrados para esse feriado.')
                encontrado = True
                break
        if not encontrado:
            print(f"Feriado com id {idFeriado} não encontrado.")
        input()
    elif (opcao == 2):
        idFeriado = int(input("Digite o id do feriado que deseja adicionar um comentário: "))
        encontrado = False
        for item in feriados:
            if (item['id'] == idFeriado):
                nome = input("Digite o seu nome: ")
                comentario = input("Digite o comentário: ")
                item['comments'].append({'id': idComentario, 'nome': nome, 'comentario': comentario})
                idComentario += 1
                print("Comentário cadastrado com sucesso!")
                encontrado = True
                break
        if not encontrado:
            print(f"Feriado com id {idFeriado} não encontrado.")
        input()
    elif (opcao == 3):
        idFeriado = int(input("Digite o id do feriado que deseja excluir o comentário: "))
        encontrado = False
        for item in feriados:
            if (item['id'] == idFeriado):
                if (item['comments']):
                    print('Os comentários são: ')
                    for comment in item['comments']:
                        print(f"{comment['id']} - {comment['nome']} comentou: {comment['comentario']}")
                else:
                    print('Não existem comentários cadastrados para esse feriado.')

                idComentario = int(input("Digite o id do comentário que deseja excluir: "))
                del item['comments'][idComentario]
                print("Comentário deletado com sucesso!")
                encontrado = True
                break
        if not encontrado:
            print(f"Feriado com id {idFeriado} não encontrado.")
        input()
    else:
        print('Opcao inválida')
        break