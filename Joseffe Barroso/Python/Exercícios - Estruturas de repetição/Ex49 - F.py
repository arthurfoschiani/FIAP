num1 = int(input("Digite um número: "))
num2 = int(input("Digite um número maior: "))

while num1 >= num2:
    num2 = int(input("Valor inválido. Digite novamente um número maior: "))

soma = 0

for i in range(num1, num2 + 1, 1):
    soma += i
print(soma)