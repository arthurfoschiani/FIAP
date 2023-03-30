from Conta import Conta

class ContaPoupanca(Conta):
    def __init__(self, nome, numConta, saldo=0, rentabilidade=0.1):
        super().__init__(nome, numConta, saldo)
        self.__rentabilidade = rentabilidade

    @property
    def rentabilidade(self):
        return self.__rentabilidade

    @rentabilidade.setter
    def limite(self, rentabilidade):
        self.__rentabilidade = rentabilidade

    def depositar(self, valor):
        valor = valor * (1 + self.__rentabilidade)
        super().depositar(valor)