matriz=[]
 
linhas = int(input('Digite a quantidade de linhas que a matriz terá: '))
while (linhas > 10 or linhas < 1) :
    linhas = int(input('Digite um valor válido: '))

colunas = int(input('Digite a quantidade de colunas que a matriz terá: '))
while (colunas > 10 or colunas < 1) :
    colunas = int(input('Digite um valor válido: '))

for l in range(0, linhas, 1):
    matriz.append([])
    for c in range(0, colunas, 1):
        matriz[l].append(int(input('Digite um numero: ')))

validador = False

while validador == False:
    consulta = int(input('Digite um valor para consulta na matriz: '))

    for l in range(0, linhas, 1):
        for c in range(0, colunas, 1):
            if consulta == matriz[l][c]:
                print("Esse valor está na {}ª linha e na {}ª coluna.".format(l+1, c+1))
                validador = True

    if validador == False:
        reposta = input("Valor inválido. Deseja realizar uma nova consulta? ").upper()

        while reposta[0] != "S" and reposta[0] != "N" :
            reposta = input("Digite sim ou não. ").upper()

        if reposta[0] == "N":
            validador = True
        else:
            validador = False