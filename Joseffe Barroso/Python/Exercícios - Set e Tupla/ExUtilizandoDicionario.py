clientes = {}
while True:
    nome = input("Digite o nome do cliente (ou digite 'sair' para encerrar): ")
    if nome == 'sair':
        break
    email = input("Digite o email do cliente: ")
    idade = int(input("Digite a idade do cliente: "))
    clientes[nome] = (email, idade)
    tem_conta = input("O cliente tem conta bancária? (s/n) ")
    if tem_conta == 's':
        agencia = input("Digite a agência bancária: ")
        numero_conta = input("Digite o número da conta: ")
        saldo = float(input("Digite o saldo da conta: "))
        clientes[nome] += ({'agencia': agencia, 'numero_conta': numero_conta, 'saldo': saldo},)
    print("")

print("\nClientes cadastrados:\n")
for nome, dados in clientes.items():
    print(f"Nome: {nome}")
    print(f"Email: {dados[0]}")
    print(f"Idade: {dados[1]}")
    if len(dados) > 2:
        conta = dados[2]
        print("Dados bancários:")
        print(f"Agência: {conta['agencia']}")
        print(f"Número da conta: {conta['numero_conta']}")
        print(f"Saldo: R${conta['saldo']}")
    print("")
