nome = []
idade = []
sexo = []

for item in range (20):
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

for i in range(len(idade)):
    maximo = i
    for j in range(i + 1, len(idade), 1):
        if idade[j] > idade[maximo]:
            maximo = j
    
    if maximo != i:
        idadeNova = idade[maximo]
        nomeNovo = nome[maximo]
        sexoNovo = sexo[maximo]
        idade[maximo] = idade[i]
        nome[maximo] = nome[i]
        sexo[maximo] = sexo[i]
        idade[i] = idadeNova;
        nome[i] = nomeNovo;
        sexo[i] = sexoNovo;

for i, item in enumerate(idade):
    print("Nome: {} - Sexo:  {} - Idade: {}".format(nome[i], sexo[i], idade[i]))