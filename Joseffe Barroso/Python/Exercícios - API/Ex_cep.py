import requests

def busca_cep(cep):
    url = f"https://viacep.com.br/ws/{cep}/json/"
    response = requests.get(url)

    if response.status_code == 200:
        dados = response.json()
        return dados
    else:
        return None

def imprime_dados(dados):
    if dados:
        print(f"CEP: {dados['cep']}")
        print(f"Logradouro: {dados['logradouro']}")
        print(f"Bairro: {dados['bairro']}")
        print(f"Cidade: {dados['localidade']}")
        print(f"Estado: {dados['uf']}")
    else:
        print("CEP não encontrado.")

cep = input("Digite o CEP desejado: ")
dados = busca_cep(cep)
imprime_dados(dados)