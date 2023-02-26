#Aprovado ou reprovado

from time import sleep

nota1 = float(input("Digite a primeira nota: "))

while nota1 > 10 or nota1 < 0:
    nota1 = float(input("Digite a primeira nota válida: "))

nota2 = float(input("Digite a segunda nota: "))

while nota2 > 10 or nota2 < 0:
    nota2 = float(input("Digite a segunda nota válida: "))


media = (nota1 + nota2) / 2

if media < 5 :
    print("Aluno reprovado")
else:
    print("Aluno aprovado")

sleep(0.5)

print("A média é {}".format(media))