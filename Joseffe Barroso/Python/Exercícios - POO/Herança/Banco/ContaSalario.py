from Conta import Conta

class ContaSalario(Conta):
    def __init__(self, nome, numConta, saldo=0):
        super().__init__(nome, numConta, saldo)