from Conta import Conta

class ContaCorrente(Conta):
    def __init__(self, nome, numConta, saldo=0, limite=1000):
        super().__init__(nome, numConta, saldo)
        self.__limite = limite

    @property
    def limite(self):
        return self.__limite

    @limite.setter
    def limite(self, limite):
        self.__limite = limite

    def sacar(self, valor):
        if self.saldo + self.__limite < valor:
            print("Saldo insuficiente para realizar a operação.")
        else:
            self.saldo -= valor
            print("Saque de R$ %.2f realizado na conta corrente de %s." % (valor, self.titular))