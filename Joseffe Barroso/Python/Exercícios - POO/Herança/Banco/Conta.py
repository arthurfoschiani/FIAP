class Conta:
    def __init__(self, titular, numConta, saldo):
        self.__titular = titular
        self.__numConta = numConta
        self.__saldo = saldo
        self.__historico = []

    @property
    def titular(self):
        return self.__titular

    @titular.setter
    def titular(self, titular):
        self.__titular = titular

    @property
    def numConta(self):
        return self.__numConta

    @numConta.setter
    def numConta(self, numConta):
        self.__numConta = numConta

    @property
    def saldo(self):
        return self.__saldo

    @saldo.setter
    def saldo(self, valor):
        self.__saldo = valor

    def sacar(self, valor):
        if self.__saldo < valor:
            print("Saldo insuficiente.")
            return
        self.__saldo -= valor
        self.__historico.append(f"Saque de R$ {valor:.2f}")

    def depositar(self, valor):
        self.__saldo += valor
        self.__historico.append(f"Depósito de R$ {valor:.2f}")

    def extrato(self):
        print(f"Extrato da conta de {self.__titular}:")
        for transacao in self.__historico:
            print("-", transacao)
        print(f"Saldo atual: R$ {self.__saldo:.2f}")