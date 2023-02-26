#Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.

sexo = input("Digite seu sexo (M/F): ").upper()

while sexo != "F" and sexo != "M":
    sexo = input("Valor inválido. Digite um sexo válido: ").upper()