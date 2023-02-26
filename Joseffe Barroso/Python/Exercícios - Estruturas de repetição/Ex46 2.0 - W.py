reposta = "S"

while reposta == "S":
    soma = 0
    menor = 0
    positivo = 0
    negativo = 0

    qntd = int(input("Digite a quantidade de números que deseja inserir: "))

    while qntd > 20:
        qntd = int(input("Digite um número de vezes menor que 20: "))

    i = 1

    while (i <= qntd):
        num = int(input("Digite o {}º número: ".format(i)))
        if i == 1:
            maior = num
            menor = num
        else:
            if num >= maior:
                maior = num
            elif num <= menor:
                menor = num
            
        if num < 0:
            negativo += 1
        else:
            positivo += 1

        soma += num
        i += 1

    print("O maior é {}".format(maior))
    print("O menor é {}".format(menor))
    print("A soma é {}".format(soma))
    print("A média é {}".format(soma/qntd))
    print("Porcentagem de números positivos é {:.1%}".format(positivo/qntd))
    print("Porcentagem de números négativos é {:.1%}".format(negativo/qntd))

    reposta = input("Você deseja realizar uma nova execução? (S/N)").upper()

    while reposta != "S" and reposta != "N":
        reposta = input("Resposta inválida, digite novamente: ").upper()