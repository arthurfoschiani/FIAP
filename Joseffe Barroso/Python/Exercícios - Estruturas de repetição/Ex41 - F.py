n = int(input("Digite um valor: "))

while n <= 0 or n >= 100:
    n = int(input("Valor inválido. Digite um valor maior que 0: "))

impar = 3
ultimo = 2
total = 0

for count in range(1, n + 1, 1):
    total += ultimo
    print(ultimo)
    soma = ultimo + impar
    ultimo = soma
    impar += 2

print("A soma é ", total)