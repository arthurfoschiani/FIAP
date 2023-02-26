matriz=[]
 
linhas = int(input('Digite a quantidade de linhas que a matriz terá: '))
colunas = int(input('Digite a quantidade de colunas que a matriz terá: '))

for l in range(0, linhas, 1):
    matriz.append([])
    for c in range(0, colunas, 1):
        matriz[l].append(int(input('Digite um numero: ')))

multiplicativa = int(input('Digite a constante multiplicativa: '))


for l in range(0, linhas, 1):
    for c in range(0, colunas, 1):
        matriz[l][c] = matriz[l][c] * multiplicativa

# Mostra a matriz um uma linha única
print(matriz)
 
# Mostra a matriz de forma real
for i in range(0, linhas, 1):
    print(matriz[i])