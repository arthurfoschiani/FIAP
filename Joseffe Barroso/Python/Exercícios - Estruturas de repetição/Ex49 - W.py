num1 = int(input("Digite um número: "))
num2 = int(input("Digite um número maior: "))

while num1 >= num2:
    num2 = int(input("Valor inválido. Digite novamente um número maior: "))

soma = 0

i = num1

while (i <= num2):
    soma += i
    i += 1
print(soma)