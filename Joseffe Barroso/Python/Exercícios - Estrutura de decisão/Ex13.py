#Entrar via teclado com três valores distintos. Exibir o maior deles.

num1 = float(input("Digite o primeiro valor: "))

num2 = float(input("Digite o segundo valor: "))

num3 = float(input("Digite o terceiro valor: "))

if num1 > num2 and num1 > num3:
    print("O maior número é: {}".format(num1))
elif num2 > num1 and num2 > num3:
    print("O maior número é: {}".format(num2))
elif num3 > num1 and num3 > num2:
    print("O maior número é: {}".format(num3))
else:
    print("Não coloque valores iguais")