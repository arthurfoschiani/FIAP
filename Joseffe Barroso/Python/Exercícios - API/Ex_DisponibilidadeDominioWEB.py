import requests

def verificar_dominio(dominio):
    try:
        url = f"https://brasilapi.com.br/api/registrobr/v1/{dominio}"
        response = requests.get(url)
        response.raise_for_status()
        dados = response.json()
        return dados
    except requests.exceptions.HTTPError:
        return None

def formatar_data(data):
    return data[8:10] + "/" + data[5:7] + "/" + data[0:4]

dominio = input("Digite o nome de domínio a ser verificado: ")
dados = verificar_dominio(dominio)
if dados:
    if dados["status"] == "AVAILABLE":
        print("Domínio disponível")
    else:
        data_formatada = formatar_data(dados['expires-at'])
        print(f"Domínio já utilizado, expira em {data_formatada}")
else:
    print("Não foi possível verificar o domínio")
