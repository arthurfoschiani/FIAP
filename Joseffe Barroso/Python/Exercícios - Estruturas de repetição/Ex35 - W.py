#Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.

num = int(input("Digite um valor: "))

while num <= 0:
    num = int(input("Valor inválido. Digite um valor maior que 0: "))

i = 1

while i <= 10:
    t = num * i
    print("{} x {} = {}".format(num, i, t))
    i += 1