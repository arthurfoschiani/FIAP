lista_compras = []
for i in range(1):
    nome_produto = input("Digite o nome do produto: ")
    quantidade = input("Digite a quantidade: ")
    while not quantidade.replace(".", "").isdigit() or float(quantidade) <= 0:
        quantidade = input("Quantidade inválida. Digite novamente: ")
    preco_unitario = input("Digite o preço unitário: ")
    while not preco_unitario.replace(".", "").isdigit() or float(preco_unitario) <= 0:
        preco_unitario = input("Preço inválido. Digite novamente: ")
    lista_compras.append((nome_produto, float(quantidade), float(preco_unitario)))

with open("Exercícios - File/lista.txt", "w") as arquivo:
    for produto in lista_compras:
        arquivo.write("{},{},{}\n".format(produto[0], produto[1], produto[2]))

with open("Exercícios - File/lista.txt", "r") as arquivo:
    lista_compras = []
    for linha in arquivo:
        nome_produto, quantidade, preco_unitario = linha.strip().split(",")
        lista_compras.append([nome_produto, float(quantidade), float(preco_unitario)])

precos_totais = []
for produto in lista_compras:
    preco_total = produto[1] * produto[2]
    precos_totais.append([produto[0], preco_total])

with open("Exercícios - File/total.txt", "w") as arquivo:
    for produto in precos_totais:
        arquivo.write("{},{}\n".format(produto[0], produto[1]))