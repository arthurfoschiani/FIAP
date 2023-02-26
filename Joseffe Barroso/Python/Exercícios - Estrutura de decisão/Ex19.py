#Calcular a média de um aluno

nota1 = float(input("Insira a nota da primeira prova: "))

while nota1 > 10 or nota1 < 0:
    nota1 = float(input("Nota inválida. Digite um valor válido: "))

nota2 = float(input("Insira a nota da segunda prova: "))

while nota2 > 10 or nota2 < 0:
    nota2 = float(input("Nota inválida. Digite um valor válido: "))

media = (nota1 + (2 * nota2)) / 3

if media >= 5:
    print("Aprovado! Média {:.1f}".format(media))
else:
    print("Reprovado! Média {:.1f}".format(media))