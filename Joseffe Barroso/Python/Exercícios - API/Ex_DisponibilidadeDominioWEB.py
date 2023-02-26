import requests

dominio = input("Digite o nome de domínio a ser verificado: ")
url = f"https://brasilapi.com.br/api/registrobr/v1/{dominio}"

response = requests.get(url)
if response.status_code == 200:
    dados = response.json()
    if dados["status"] == "AVAILABLE":
        print("Domínio disponível")
    else:
        dataFormatafa = dados['expires-at'][8:10] + "/" + dados['expires-at'][5:7] + "/" + dados['expires-at'][0:4]
        print(f"Domínio já utilizado, expira em {dataFormatafa}")
else:
    print("Não foi possível verificar o domínio")
