lista = []
consulta = "S"

qntd = int(input("Qual a quantidade de valores que deseja inserir? "))

while qntd > 20 or qntd <= 0:
    qntd = int(input("Digite um valor válido: (Menor que 20) "))

for i in range(qntd):
    lista.append(int(input("Digite o {}º número: ".format(i + 1))))

while consulta == "S":
    y = False
    valor = int(input("Digite o valor da lista que deseja procurar a posição: "))

    for i, item in enumerate(lista):
        if item == valor:
            print("O índice deste número é {}".format(i))
            y = True
        
        if i == len(lista) - 1 and y == False:
            print("Valor não encontrado")

    consulta = input("Deseja realiza uma nova consulta? (S/N) ").upper()

    while consulta != "S" and consulta != "N":
        consulta = input("Digite um valor válido? (S/N) ").upper()