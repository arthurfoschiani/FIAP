nome = []
idade = []
sexo = []

for item in range (100):
    nome.append(input("Digite o nome da {}ª pessoa: ".format(item + 1)))
    idadeStr = int(input("Digite a idade da {}ª pessoa: ".format(item + 1)))
    while idadeStr < 0 or idadeStr > 130:
        idadeStr = int(input("Digite uma idade válida (M/F): "))
    idade.append(idadeStr)
    sexoStr = input("Digite o sexo da {}ª pessoa (M/F): ".format(item + 1)).upper()
    while sexoStr != "M" and sexoStr != "F":
        sexoStr = input("Digite um sexo válido (M/F): ").upper()
    sexo.append(sexoStr)

for i, item in enumerate(nome):
    if sexo[i] == "F":
        sexo[i] = "feminino"
        print("{} tem {} anos e é do sexo {}.".format(item, idade[i], sexo[i]))