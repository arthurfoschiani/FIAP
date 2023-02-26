num1 = int(input("Digite um número: "))
num2 = int(input("Digite um número maior: "))

while num1 >= num2 or num2 <= 13:
    num2 = int(input("Valor inválido. Digite novamente um número maior: "))

for i in range(num1 + 1, num2, 2):
    if i >= 10 and num1 % 2 == 0:
        print(i - 1)
    elif i >= 10 and num1 % 2 == 1:
        print(i)
