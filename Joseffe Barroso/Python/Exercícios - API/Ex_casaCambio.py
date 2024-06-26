import requests

MOEDAS = {
    "USD": "Dólar Americano",
    "EUR": "Euro",
    "JPY": "Iene Japonês",
    "GBP": "Libra Esterlina",
    "ARS": "Peso Argentino",
}

def obter_taxa_de_conversao(moeda_de_destino):
    url = f"https://economia.awesomeapi.com.br/json/last/{moeda_de_destino}-BRL"
    try:
        response = requests.get(url)
        response.raise_for_status()
        data = response.json()
        return float(data[f"{moeda_de_destino}BRL"]["ask"])
    except requests.exceptions.HTTPError:
        return None
    except requests.exceptions.RequestException:
        return None
    finally:
        response.close()


def converter_moeda(valor_em_reais, moeda_de_destino):
    taxa_de_conversao = obter_taxa_de_conversao(moeda_de_destino)
    
    if taxa_de_conversao is None:
        return None
    
    valor_convertido = valor_em_reais / taxa_de_conversao
    nome_da_moeda = MOEDAS.get(moeda_de_destino, "Moeda Desconhecida")
    
    return valor_convertido, nome_da_moeda


valor_em_reais = float(input("Digite o valor em reais: "))
moeda_de_destino = input(f"Digite a moeda de destino ({', '.join(MOEDAS.keys())}): ").upper()

if moeda_de_destino in MOEDAS:
    try:
        resultado = converter_moeda(valor_em_reais, moeda_de_destino)
        if resultado is not None:
            valor_convertido, nome_da_moeda = resultado
            print(f"R$ {valor_em_reais:.2f} equivale a {valor_convertido:.2f} {nome_da_moeda}")
        else:
            print("Conversão sem serviço!")
    except Exception:
        print("Erro ao converter a moeda!")
else:
    print("Moeda inválida!")
