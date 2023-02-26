#Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.

num1 = float(input("Digite o primeiro valor: "))

num2 = float(input("Digite o segundo valor: "))

if num1 > num2:
    print("O maior número é: {}".format(num1))
elif num2 > num1:
    print("O maior número é: {}".format(num2))
else:
    print("Os dois números são identicos")