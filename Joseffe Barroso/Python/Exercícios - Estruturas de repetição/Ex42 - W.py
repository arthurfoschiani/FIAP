n = int(input("Digite um valor: "))

while n <= 0 or n >= 50:
    n = int(input("Valor inválido. Digite um valor maior que 0: "))

cima = 1
baixo = 2
count = 1
soma = 0

while ( count <= n ):
    completa = "{}/{}".format(cima, baixo)
    total = cima / baixo;
    soma += total;
    print(completa)
    cima = baixo
    baixo += 1
    count += 1

print("{:.1f}".format(soma))