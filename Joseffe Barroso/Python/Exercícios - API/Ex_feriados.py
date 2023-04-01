import requests
from datetime import datetime

BASE_URL = "https://brasilapi.com.br/api/feriados/v1/"

def buscar_feriados(ano: int):
    url = BASE_URL + str(ano)
    response = requests.get(url)
    return response.json()

def verificar_feriado(data: datetime):
    try:
        feriados = buscar_feriados(data.year)
        data_formatada = data.strftime('%Y-%m-%d')
        for item in feriados:
            if data_formatada == item['date']:
                return item['name']
        return 'null'
    except requests.exceptions.RequestException as e:
        print(f"Erro ao buscar feriados: {e}")
        return 'null'

def feriados_do_mes(data: datetime):
    try:
        feriados = buscar_feriados(data.year)
        feriados_mes = []
        for dia in feriados:
            feriado_data = datetime.strptime(dia['date'], "%Y-%m-%d")
            if feriado_data.month == data.month:
                feriados_mes.append(f"{feriado_data.day}/{feriado_data.month} - {dia['name']}")
        return feriados_mes
    except requests.exceptions.RequestException as e:
        print(f"Erro ao buscar feriados: {e}")
        return []

try:
    data_str = input("Digite uma data (dd/mm): ")
    data = datetime.strptime(f"2023-{data_str}", "%Y-%d/%m")
except ValueError:
    print("A data fornecida está no formato incorreto. Certifique-se de digitar a data no formato dd/mm.")
else:
    try:
        feriado = verificar_feriado(data)
        if feriado != 'null':
            print(f"A data {data_str} é um feriado: {feriado}")
        else:
            print(f"A data {data_str} não é um feriado")

        feriados_mes = feriados_do_mes(data)
        if len(feriados_mes) > 0:
            print(f"Feriados do mês:")
            for feriado in feriados_mes:
                print(feriado)
        else:
            print("Não há feriados no mês")
    except Exception as e:
        print(str(e))
finally:
    print("Fim do programa")