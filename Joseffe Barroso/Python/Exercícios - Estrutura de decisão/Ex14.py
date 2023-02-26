#Calculo Relação peso/altura

from time import sleep

peso = float(input("Digite seu peso (em Kg): "))

altura = float(input("Digite sua altura (em cm): "))

altura = altura / 100

imc = peso/(altura * altura)

if imc < 20:
    print("Abaixo do peso")
elif imc >= 25:
    print("Acima do peso")
else:
    print("Peso ideal")

sleep(0.5)

print("O seu IMC é {:.2f}".format(imc))