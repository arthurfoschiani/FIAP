soma = 0
i = 1
while (i <= 10):
    num = int(input("Digite o {}º número: ".format(i)))
    while num < 0:
        num = int(input("Digite o {}º valor novamente: ".format(i)))
    if i == 1:
        maior = num
    else:
        if num > maior:
            maior = num
    soma += num
    i += 1

print("O maior valor é {}".format(maior))
print("A soma desses valores é {}".format(soma))
print("A média desses valores é {}".format(soma/10))