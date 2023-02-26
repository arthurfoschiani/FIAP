nome = []
idade = []

for item in range (100):
    nome.append(input("Digite o nome da {}ª pessoa: ".format(item + 1)))
    idade.append(int(input("Digite a idade da {}ª pessoa: ".format(item + 1))))

for i, item in enumerate(nome):
    print("{} tem {} anos.".format(item, idade[i]))