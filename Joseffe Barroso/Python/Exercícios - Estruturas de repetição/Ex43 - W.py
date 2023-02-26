n = int(input("Digite um valor: "))

while n <= 0 or n >= 50:
    n = int(input("Valor inválido. Digite um valor maior que 0: "))

impar = 3
cima = 2
fator = 1
baixo = 1
count = 1

while (count <= n):
    completa = "{}/{}".format(cima, baixo)
    print(completa)
    soma = cima + impar
    cima = soma
    impar += 2
    fator += 1
    baixo = fator ** 3
    count += 1