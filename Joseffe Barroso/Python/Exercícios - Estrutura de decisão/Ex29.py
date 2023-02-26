#Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.

num1 = int(input("Digite um número inteiro: "))

num2 = int(input("Digite outro número inteiro: "))

while num1 == num2:
    num2 = int(input("Não pode ter número iguais. Digite outro valor: "))

num3 = int(input("Digite outro número inteiro: "))

while num3 == num2 or num3 == num1:
    num3 = int(input("Não pode ter número iguais. Digite outro valor: "))

if num1 > num2 and num2 > num3:
    print("{}, {}, {}".format(num1, num2, num3))
elif num1 > num3 and num3 > num2:
    print("{}, {}, {}".format(num1, num3, num2))
elif num2 > num1 and num1 > num3:
    print("{}, {}, {}".format(num2, num1, num3))
elif num2 > num3 and num3 > num1:
    print("{}, {}, {}".format(num2, num3, num1))
elif num3 > num2 and num2 > num1:
    print("{}, {}, {}".format(num3, num2, num1))
elif num3 > num1 and num1 > num2:
    print("{}, {}, {}".format(num3, num1, num2))