clientes = []

while True:
    nome = input("Digite o nome do cliente (ou 'sair' para sair): ")
    if nome == 'sair':
        break
    idade = int(input("Digite a idade do cliente: "))
    profissao = input("Digite a profissão do cliente: ")
    salario = float(input("Digite o salário do cliente: "))

    cliente = {'nome': nome, 'idade': idade, 'profissao': profissao, 'salario': salario, 'contas_bancarias': []}
    tem_conta_bancaria = input("O cliente tem conta bancária? (s/n): ").upper()[0]
    while tem_conta_bancaria == 'S':
        conta_bancaria = {}
        conta_bancaria['numero'] = input("Digite o número da conta: ")
        conta_bancaria['banco'] = input("Digite o nome do banco: ")
        conta_bancaria['saldo'] = float(input("Digite o saldo da conta: "))
        cliente['contas_bancarias'].append(conta_bancaria)
        tem_conta_bancaria = input("O cliente tem mais alguma conta bancária? (s/n): ").upper()[0]

    clientes.append(cliente)

for cliente in clientes:
    print("Cliente")
    print("Nome:", cliente['nome'])
    print("Idade:", cliente['idade'])
    print("Profissão:", cliente['profissao'])
    print("Salário:", cliente['salario'])
    for conta_bancaria in cliente['contas_bancarias']:
        print("  ------------------------------")
        print("  Conta bancária:", conta_bancaria['numero'])
        print("  Banco:", conta_bancaria['banco'])
        print("  Saldo:", conta_bancaria['saldo'])
        print("  ------------------------------")
