#Máquina registradora

from time import sleep


produto1 = float(input("Digite o valor do primeiro produto: "))

produto2 = float(input("Digite o valor do segundo produto: "))

produto3 = float(input("Digite o valor do terceiro produto: "))

produto4 = float(input("Digite o valor do quarto produto: "))

produto5 = float(input("Digite o valor do quinto produto: "))

soma = produto1 + produto2 + produto3 + produto4 + produto5

sleep(0.5)

print("O valor total da compra é: {:.2f}".format(soma))

sleep(0.5)

valor = float(input("Quanto você vai dar? "))

while valor < soma:
    valor = float(input("Digite novamente um valor maior ou igual: "))
    sleep(0.5)

sleep(1)

print("O valor do troco é: {:.2f}".format(valor - soma))