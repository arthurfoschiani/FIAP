#Algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

a = float(input("Digite o valor de A: "))

b = float(input("Digite o valor de B: "))

c = float(input("Digite o valor de C: "))

if a + b < c:
    print("O valor de A + B é menor que C")
else:
    print("O valor de A + B é maior ou igual a C")