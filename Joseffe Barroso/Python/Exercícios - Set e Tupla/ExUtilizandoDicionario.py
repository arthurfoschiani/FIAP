clientes = {}
email_cadastrados = set()

while True:
    nome = input("Digite o nome do cliente (ou digite 'sair' para encerrar): ")
    if nome == 'sair':
        break
    email = input("Digite o email do cliente: ")
    while email in email_cadastrados:
        email = input("Este e-mail já foi cadastrado. Por favor, digite outro e-mail: ")
    idade = int(input("Digite a idade do cliente: "))
    clientes[nome] = (email, idade)
    tem_conta = input("O cliente tem conta bancária? (s/n) ").upper()
    if tem_conta[0] == 'S':
        agencia = input("Digite a agência bancária: ")
        numero_conta = input("Digite o número da conta: ")
        saldo = float(input("Digite o saldo da conta: "))
        clientes[nome] += ({'agencia': agencia, 'numero_conta': numero_conta, 'saldo': saldo},)
    email_cadastrados.add(email)
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