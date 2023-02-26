numeros = []

for i in range(20):
    num = int(input("Digite o {}º número: ".format(i+1)))
    numeros.append(num)

for i in range(len(numeros)):
    minimo = i
    for j in range(i + 1, len(numeros), 1):
        if numeros[j] < numeros[minimo]:
            minimo = j
    
    if minimo != i:
        dms = numeros[minimo];
        numeros[minimo] = numeros[i];
        numeros[i] = dms;

for item in numeros:
    print(item)

print("-------------------------------------------------------")
