lista = []
produtos = []

for item in range (20):
    lista.append(int(input("Digite o {}º número: ".format(item + 1))))

multiplicador = int(input("Digite o multiplicador: "))

for i, item in enumerate(lista):
    produtos.append(item * multiplicador)
    print("{} x {} = {}".format(multiplicador, lista[i], produtos[i]))