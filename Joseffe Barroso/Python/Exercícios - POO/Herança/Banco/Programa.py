from ContaCorrente import ContaCorrente
from ContaPoupanca import ContaPoupanca
from ContaSalario import ContaSalario

contas = []

def criar_conta_corrente(numConta):
    nome = input("Digite o nome do titular da conta corrente: ")
    saldo = float(input("Digite o saldo inicial da conta corrente: "))
    limite = float(input("Digite o limite da conta corrente: "))
    conta_corrente = ContaCorrente(nome, numConta, saldo, limite)
    contas.append(conta_corrente)
    print("Conta corrente criada com sucesso!")

def criar_conta_poupanca(numConta):
    nome = input("Digite o nome do titular da conta poupança: ")
    saldo = float(input("Digite o saldo inicial da conta poupança: "))
    conta_poupanca = ContaPoupanca(nome, numConta, saldo)
    contas.append(conta_poupanca)
    print("Conta poupança criada com sucesso!")

def criar_conta_salario(numConta):
    nome = input("Digite o nome do titular da conta salário: ")
    saldo = float(input("Digite o saldo inicial da conta salário: "))
    conta_salario = ContaSalario(nome, numConta, saldo)
    contas.append(conta_salario)
    print("Conta salário criada com sucesso!")

def exibir_contas():
    print("Contas cadastradas:\n")
    for conta in contas:
        tipo_conta = type(conta).__name__
        print(f"Conta: {conta.numConta}")
        print(f"Titular: {conta.titular}")
        print(f"Tipo de conta: {tipo_conta}")
        print(f"Saldo: R$ {conta.saldo:.2f}")
        if tipo_conta == "ContaCorrente":
            print(f"Limite: R$ {conta.limite:.2f}")
        print("")

while True:
    print("Bem-vindo ao Sistema de Cadastro de Contas")
    print("Menu:")
    print("1 - Criar Conta")
    print("2 - Exibir Contas")
    print("3 - Sacar")
    print("4 - Depositar")
    print("5 - Extrato")
    print("6 - Sair")

    opcao = input("Digite a opção desejada: ")

    if opcao == "1":
        tipo_conta = int(input("Digite o tipo de conta desejado (1 - Corrente, 2 - Poupança ou 3 - Salário): "))
        numero_conta = int(input("Digite o número da conta: "))
        if len(contas) == 0:
            if tipo_conta == 1:
                criar_conta_corrente(numero_conta)
                continue
            elif tipo_conta == 2:
                criar_conta_poupanca(numero_conta)
                continue
            elif tipo_conta == 3:
                criar_conta_salario(numero_conta)
                continue
            else:
                print("Tipo de conta inválido. Tente novamente.")
                continue
        else:
            for conta in contas:
                if (conta.numConta == numero_conta):
                    print("Número de conta já cadastrado. Tente novamente.")
                    break
                else:
                    if tipo_conta == 1:
                        criar_conta_corrente(numero_conta)
                        break
                    elif tipo_conta == 2:
                        criar_conta_poupanca(numero_conta)
                        break
                    elif tipo_conta == 3:
                        criar_conta_salario(numero_conta)
                        break
                    else:
                        print("Tipo de conta inválido. Tente novamente.")
                        break
    elif opcao == "2":
        exibir_contas()
    elif opcao == "3":
        numero_conta = int(input("Digite o número da conta: "))
        for conta in contas:
            if (conta.numConta == numero_conta):
                valor = float(input("Digite o valor a ser sacado: "))
                conta.sacar(valor)
                print("Saque realizado.")
                break
    elif opcao == "4":
        numero_conta = int(input("Digite o número da conta: "))
        for conta in contas:
            if (conta.numConta == numero_conta):
                valor = float(input("Digite o valor a ser depositado: "))
                conta.depositar(valor)
                print("Depósito realizado.")
                break
    elif opcao == "5":
        numero_conta = int(input("Digite o número da conta: "))
        for conta in contas:
            if (conta.numConta == numero_conta):
                valor = float(input("Digite o valor a ser depositado: "))
                conta.extrato()
                break
    elif opcao == "6":
        print("Obrigado por utilizar o Sistema de Cadastro de Contas")
        break
    else:
        print("Opção inválida. Tente novamente.")