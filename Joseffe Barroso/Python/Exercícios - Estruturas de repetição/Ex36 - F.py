

num = int(input("Digite um valor: "))

while num <= 0:
    num = int(input("Valor inválido. Digite um valor maior que 0: "))

num1 = int(input("Digite o primeiro valor do intervalo: "))

num2 = int(input("Digite o segundo valor do intervalo: "))

while num1 >=  num2:
    num2 = int(input("Valor inválido. Digite novamente o segundo valor: "))

for i in range(num2, num1-1, -1):
    t = num * i
    print("{} x {} = {}".format(num, i, t))