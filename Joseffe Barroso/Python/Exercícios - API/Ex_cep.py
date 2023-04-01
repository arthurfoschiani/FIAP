import requests

def busca_cep(cep):
    try:
        url = f"https://viacep.com.br/ws/{cep}/json/"
        response = requests.get(url)
        response.raise_for_status()
        dados = response.json()
        return dados
    except requests.exceptions.HTTPError:
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
