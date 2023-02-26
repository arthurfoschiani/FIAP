numeros = []

for i in range(20):
    num = int(input("Digite o {}º número: ".format(i+1)))
    numeros.append(num)

for i in range(len(numeros)):
    maximo = i
    for j in range(i + 1, len(numeros)):
        if numeros[j] > numeros[maximo]:
            maximo = j
    
    if maximo != i:
        dms = numeros[maximo];
        numeros[maximo] = numeros[i];
        numeros[i] = dms;

for item in numeros:
    print(item)

print("-------------------------------------------------------")
