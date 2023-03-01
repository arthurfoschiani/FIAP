clientes = []
while True:
    nome = input("Digite o nome do cliente (ou digite 'sair' para encerrar): ")
    if nome == 'sair':
        break
    email = input("Digite o email do cliente: ")
    idade = int(input("Digite a idade do cliente: "))
    cliente = (nome, email, idade)
    clientes.append(cliente)
    tem_conta = input("O cliente tem conta bancária? (s/n) ")
    if tem_conta == 's':
        agencia = input("Digite a agência bancária: ")
        numero_conta = input("Digite o número da conta: ")
        saldo = float(input("Digite o saldo da conta: "))
        conta = {'agencia': agencia, 'numero_conta': numero_conta, 'saldo': saldo}
        cliente += (conta,)
    print("")

print("\nClientes cadastrados:\n")
for nome, email, idade, *conta in clientes:
    print(f"Nome: {nome}")
    print(f"Email: {email}")
    print(f"Idade: {idade}")
    if conta:
        conta = conta[0]
        print("Dados bancários:")
        print(f"Agência: {conta['agencia']}")
        print(f"Número da conta: {conta['numero_conta']}")
        print(f"Saldo: R${conta['saldo']}")
    print("")
