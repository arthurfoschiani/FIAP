#Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal.

from time import sleep

sexo = input("Digite seu sexo (m/f): ").lower()

while sexo != "f" and sexo != "m":
    sexo = input("Valor inválido. Digite 'm' ou 'f': ").lower()

peso = float(input("Digite seu peso (em Kg): "))

altura = float(input("Digite sua altura (em cm): "))

altura = altura / 100

imc = peso/(altura * altura)

if sexo == "f":
    if imc < 19:
        print("Abaixo do peso")
    elif imc >= 24:
        print("Acima do peso")
    else:
        print("Peso ideal")
elif sexo == "m":
    if imc < 20:
        print("Abaixo do peso")
    elif imc >= 25:
        print("Acima do peso")
    else:
        print("Peso ideal")

sleep(0.5)

print("O seu IMC é {:.2f}".format(imc))