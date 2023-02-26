lista = []

for item in range (10):
    lista.append(int(input("Digite o {}º número: ".format(item + 1))))

print(max(lista))