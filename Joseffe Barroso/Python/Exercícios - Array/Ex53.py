lista = []

for item in range (20):
    lista.append(int(input("Digite o {}º número: ".format(item + 1))))

multiplicador = int(input("Digite o multiplicador: "))

for i, item in enumerate(lista):
    lista[i] = item * multiplicador
    print(lista[i])