import requests

class Aluno:
    def __init__(self, nome, idade, ra, curso, cep=None):
        self.__nome = nome
        self.__idade = idade
        self.__ra = ra
        self.__curso = curso
        self.__cep = cep
        self.__endereco = None
        self.__bairro = None
        self.__cidade = None

        if cep is not None:
            self.__atualizar_endereco()

    @property
    def nome(self):
        return self.__nome
    
    @nome.setter
    def nome(self, nome):
        self.__nome = nome

    @property
    def idade(self):
        return self.__idade
    
    @idade.setter
    def idade(self, idade):
        self.__idade = idade

    @property
    def ra(self):
        return self.__ra
    
    @ra.setter
    def ra(self, ra):
        self.__ra = ra

    @property
    def curso(self):
        return self.__curso
    
    @curso.setter
    def curso(self, curso):
        self.__curso = curso

    @property
    def cep(self):
        return self.__cep
    
    @cep.setter
    def cep(self, cep):
        self.__cep = cep

    @property
    def endereco(self):
        return self.__endereco

    @property
    def bairro(self):
        return self.__bairro

    @property
    def cidade(self):
        return self.__cidade

    def __atualizar_endereco(self):
        if self.__cep is not None:
            url = f'https://viacep.com.br/ws/{self.__cep}/json/'
            response = requests.get(url)

            if response.status_code == 200:
                dados = response.json()

                if 'erro' not in dados:
                    self.__endereco = dados['logradouro']
                    self.__bairro = dados['bairro']
                    self.__cidade = dados['localidade']