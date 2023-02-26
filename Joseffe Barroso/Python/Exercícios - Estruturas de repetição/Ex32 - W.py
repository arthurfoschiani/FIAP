#Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.

num1 = int(input("Digite o primeiro valor: "))

num2 = int(input("Digite o segundo valor: "))

while num1 >=  num2:
    num2 = int(input("Valor inválido. Digite novamente o segundo valor: "))