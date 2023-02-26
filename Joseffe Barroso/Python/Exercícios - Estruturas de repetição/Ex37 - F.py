#Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla.

for i in range(1, 21, 1):
    for i2 in range(1, 11, 1):
        t = i * i2
        print("{} x {} = {}".format(i, i2, t))
    input("Aperte qualquer tecla")