produtos = []

while True:
    nome_produto = input("Digite o nome do produto (ou 'sair' para parar): ")
    if nome_produto == "sair":
        break
    preco = float(input("Digite o preço do produto: "))
    quantidade = int(input("Digite a quantidade do produto: "))

    produto = {
        "nome": nome_produto,
        "preco": preco,
        "quantidade": quantidade,
        "lojas": []
    }
    produtos.append(produto)

    while True:
        nome_loja = input("Digite o nome da loja (ou 'sair' para parar): ")
        if nome_loja == "sair":
            break
        cidade = input("Digite a cidade da loja: ")
        loja = {
            "nome": nome_loja,
            "cidade": cidade
        }
        produto["lojas"].append(loja)

for p in produtos:
    print(f"Produto: {p['nome']}")
    print(f"Preço: {p['preco']}")
    print(f"Quantidade: {p['quantidade']}")
    if p["lojas"]:
        print("Lojas:")
        for l in p["lojas"]:
            print(f" - {l['nome']} ({l['cidade']})")
    print("")