nome = []
idade = []
sexo = []

for item in range (4):
    nome.append(input("Digite o nome da {}ª pessoa: ".format(item + 1)))
    idadeStr = int(input("Digite a idade da {}ª pessoa: ".format(item + 1)))
    while idadeStr < 0 or idadeStr > 130:
        idadeStr = int(input("Digite uma idade válida (M/F): "))
    idade.append(idadeStr)
    sexoStr = input("Digite o sexo da {}ª pessoa (M/F): ".format(item + 1)).upper()
    while sexoStr != "M" and sexoStr != "F":
        sexoStr = input("Digite um sexo válido (M/F): ").upper()
    if sexoStr == "M":
        sexoStr = "Masculino"
    elif sexoStr == "F":
        sexoStr = "Feminino"
    sexo.append(sexoStr)

count = 0

for i, item in enumerate(nome):
    if idade[i] >= 18:
        if count == 2:
            input("Digite qualquer tecla para continuar")
            count = 0
        print("{} tem {} anos e é do sexo {}.".format(item.capitalize(), idade[i], sexo[i].lower()))
        count += 1;