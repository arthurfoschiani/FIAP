reposta = "S"

while reposta == "S":
    num = int(input("Digite o número que deseja fazer fatorial: "))

    while num < 0 :
        num = int(input("Digite novamente um número maior que 0: "))

    i = num - 1

    while (i > 0):
        t = num * i
        num = t
        i -= 1

    print(t)

    reposta = input("Você deseja realizar uma nova execução? (S/N)").upper()

    while reposta != "S" and reposta != "N":
        reposta = input("Resposta inválida, digite novamente: ").upper()