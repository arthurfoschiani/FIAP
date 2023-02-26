n = int(input("Digite um valor: "))

while n <= 0 or n >= 100:
    n = int(input("Valor inválido. Digite um valor maior que 0: "))

impar = 3
ultimo = 2
count = 1
total = 0

while (count <= n):
    total += ultimo
    print(ultimo)
    soma = ultimo + impar
    ultimo = soma
    impar += 2
    count += 1

print("A soma é ", total)