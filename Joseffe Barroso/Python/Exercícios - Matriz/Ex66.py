matriz = [ [0,0], [0,0], [0,0] ]
 
for l in range(0, 3, 1):
    for c in range(0, 2, 1):
        matriz[l][c] = int(input('Digite um numero: '))
 
# Mostra a matriz um uma linha única
print(matriz)
 
# Mostra a matriz de forma real
for i in range(0, 3, 1):
    print(matriz[i])
 
# Mostra cada valor da matriz
for l in range(0, 3, 1):
    for c in range(0, 2, 1):
        print(matriz[l][c])