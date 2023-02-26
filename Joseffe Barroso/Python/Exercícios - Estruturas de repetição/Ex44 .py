lista = []

for i in range(1, 11, 1):
    num = int(input("Digite o {}º número: ".format(i)))
    while num < 0 or num in lista:
        num = int(input("Digite o {}º valor novamente: ".format(i)))
    lista.append(num)

print("O maior valor é {}".format(max(lista)))
print("A soma desses valores é {}".format(sum(lista)))
print("A média desses valores é {}".format(sum(lista)/len(lista)))