qntd = int(input("Digite a quantidade de números que deseja inserir: "))
lista = []

while qntd > 20:
    qntd = int(input("Digite um número de vezes menor que 20: "))

for i in range(1, qntd + 1, 1):
    num = int(input("Digite o {}º número: ".format(i)))
    lista.append(num)

positivo = []
negativo = []

print("O maior é {}".format(max(lista)))
print("O menor é {}".format(min(lista)))
print("A soma é {}".format(sum(lista)))
print("A média é {}".format(sum(lista)/len(lista)))
for item in lista:
    if item >= 0:
        positivo.append(item)
    else:
        negativo.append(item)
print("Porcentagem de números positivos é {:.1%}".format(len(positivo)/len(lista)))
print("Porcentagem de números négativos é {:.1%}".format(len(negativo)/len(lista)))