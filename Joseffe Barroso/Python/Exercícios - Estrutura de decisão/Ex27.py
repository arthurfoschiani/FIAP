#Algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

num = int(input("Digite um número inteiro: "))

if num % 2 == 1:
    print(num + 8)
else:
    print(num + 5)