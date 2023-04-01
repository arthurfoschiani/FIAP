import requests

def busca_cep(cep):
    url = f'https://viacep.com.br/ws/{cep}/json/'
    try:
        response = requests.get(url)
        response.raise_for_status()
        dados = response.json()
        return {
            'rua': dados['logradouro'],
            'bairro': dados['bairro'],
            'cidade': dados['localidade'],
            'estado': dados['uf']
        }
    except requests.exceptions.HTTPError:
        return None
    except requests.exceptions.RequestException as e:
        print(f"Ocorreu um erro ao buscar o CEP: {e}")
        return None

def incluir_pessoa(cadastro):
    try:
        nome = input("Nome: ")
        email = input("E-mail: ")
        cep = input("CEP: ")
        endereco = busca_cep(cep)
        if endereco is None:
            print("CEP inválido!")
        else:
            numero = input("Número da casa: ")
            complemento = input("Complemento: ")
            cadastro.append({
                'nome': nome,
                'email': email,
                'endereco': endereco,
                'numero': numero,
                'complemento': complemento
            })
            print("Pessoa incluída com sucesso!")
    except KeyboardInterrupt:
        print("Operação interrompida pelo usuário!")
    except Exception as e:
        print("Erro ao incluir pessoa:", e)

def alterar_pessoa(cadastro):
    try:
        email = input("E-mail da pessoa a ser alterada: ")
        for item in cadastro:
            if item['email'] == email:
                nome = input("Novo nome: ")
                cep = input("Novo CEP: ")
                endereco = busca_cep(cep)
                if endereco is None:
                    print("CEP inválido!")
                else:
                    numero = input("Novo número da casa: ")
                    complemento = input("Novo complemento: ")
                    item['nome'] = nome
                    item['endereco'] = endereco
                    item['numero'] = numero
                    item['complemento'] = complemento
                    print("Dados da pessoa alterados com sucesso!")
                return
        print("Usuário não encontrado")
    except KeyboardInterrupt:
        print("Operação interrompida pelo usuário!")
    except Exception as e:
        print("Erro ao atualizar pessoa:", e)

def excluir_pessoa(cadastro):
    try:
        email = input("E-mail da pessoa a ser excluída: ")
        for item in cadastro:
            if item['email'] == email:
                cadastro.remove(item)
                print("Pessoa excluída com sucesso!")
                return
        print("Usuário não encontrado")
    except KeyboardInterrupt:
        print("Operação interrompida pelo usuário!")
    except Exception as e:
        print("Erro ao excluir pessoa:", e)

def consultar_pessoa(cadastro):
    email = input("E-mail da pessoa a ser consultada: ")
    for item in cadastro:
        if item['email'] == email:
            print(f"Nome: {item['nome']}")
            print(f"Email: {item['email']}")
            print(f"Endereço: {item['endereco']['rua']}, {item['numero']}, {item['complemento']}, {item['endereco']['bairro']}, {item['endereco']['cidade']}, {item['endereco']['estado']}")
            print(f"Número da casa: {item['numero']}")
            print(f"Complemento da casa: {item['complemento']}")
            return
    print("Usuário não encontrado")

def menu():
    print("Digite a opção desejada:")
    print("I - Incluir")
    print("A - Alterar")
    print("E - Excluir")
    print("C - Consultar")
    print("S - Sair")

cadastro = []

menu()

while True:
    opcao = input("Digite a opção desejada (I - Incluir, A - Alterar, E - Excluir, C - Consultar, S - Sair): ").upper()
    
    if opcao == "I":
        incluir_pessoa(cadastro)
    
    elif opcao == "A":
        alterar_pessoa(cadastro)
    
    elif opcao == "E":
        excluir_pessoa(cadastro)
    
    elif opcao == "C":
        consultar_pessoa(cadastro)
    
    elif opcao == "S":
        break
    
    else:
        print("Opção inválida!")
