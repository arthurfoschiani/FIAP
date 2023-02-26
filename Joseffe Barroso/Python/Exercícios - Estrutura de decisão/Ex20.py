#Calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente 

nota1 = float(input("Insira a nota da primeira prova: "))

while nota1 > 10 or nota1 < 0:
    nota1 = float(input("Nota inválida. Digite um valor válido: "))

nota2 = (15 - nota1) / 2

print("O aluno precisa tirar pelo menos {} para ser aprovado".format(nota2))