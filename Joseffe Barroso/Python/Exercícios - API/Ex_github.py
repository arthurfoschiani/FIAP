import requests

user = input("Digite o usuário que deseja pesquisar: ")
url = f"https://api.github.com/users/{user}"

response = requests.get(url)

if response.status_code == 200:
    dados = response.json()
    print(f"Nome: {dados['login']}")
    print(f"Quantidade de repositórios: {dados['public_repos']}")
    print(f"Quantidade de seguidores: {dados['followers']}")
else:
    print("Usuário não encontrado.")