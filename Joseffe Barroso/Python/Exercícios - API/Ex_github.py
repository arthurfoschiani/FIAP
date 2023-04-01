import requests

def obter_dados_usuario(user):
    try:
        url = f"https://api.github.com/users/{user}"
        response = requests.get(url)
        response.raise_for_status()
        return response.json()
    except requests.exceptions.HTTPError as e:
        print(f"Erro ao fazer requisição: {e}")
        return None
    finally:
        response.close()

def exibir_dados_usuario(dados):
    if dados:
        print(f"Nome: {dados['login']}")
        print(f"Quantidade de repositórios: {dados['public_repos']}")
        print(f"Quantidade de seguidores: {dados['followers']}")
    else:
        print("Usuário não encontrado.")

user = input("Digite o usuário que deseja pesquisar: ")
dados_usuario = obter_dados_usuario(user)
exibir_dados_usuario(dados_usuario)
