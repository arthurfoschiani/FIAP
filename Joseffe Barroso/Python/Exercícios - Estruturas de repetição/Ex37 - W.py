#Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla.

i = 1

while i <= 20:
    i2 = 1
    while i2 <= 10:
        t = i * i2
        print("{} x {} = {}".format(i, i2, t))
        i2 += 1
    i += 1
    input("Aperte qualquer tecla")