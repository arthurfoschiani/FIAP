#Entrar via teclado, com dois valores distintos. Exibir o menor deles.

num1 = float(input("Digite o primeiro valor: "))

num2 = float(input("Digite o segundo valor: "))

if num1 < num2:
    print("O menor número é: {}".format(num1))
elif num2 < num1:
    print("O menor número é: {}".format(num2))
else:
    print("Os dois números são iguais")