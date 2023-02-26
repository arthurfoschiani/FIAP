

num = int(input("Digite um valor: "))

while num <= 0:
    num = int(input("Valor inválido. Digite um valor maior que 0: "))

num1 = int(input("Digite o primeiro valor do intervalo: "))

num2 = int(input("Digite o segundo valor do intervalo: "))

while num1 >=  num2:
    num2 = int(input("Valor inválido. Digite novamente o segundo valor: "))

while num2 >= num1:
    t = num * num2
    print("{} x {} = {}".format(num, num2, t))
    num2 -= 1
