#Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

num = int(input("Digite um número inteiro: "))

if num >= 0:
    print("Seu dobro é {}".format(num * 2))
else:
    print("Seu triplo é {}".format(num * 3))