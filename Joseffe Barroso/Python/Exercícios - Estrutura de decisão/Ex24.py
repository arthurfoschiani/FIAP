#Algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

nome = input("Qual seu nome? ")
sexo = input("Qual seu sexo? (M/F) ").upper()

while sexo != "F" and sexo != "M":
    sexo = input("Valor inválido. Digite 'M' ou 'F': ").upper()

estadoCivil = input("Qual seu estado civil? (SOLTEIRA/CASADA) ").upper()

while estadoCivil != "SOLTEIRA" and estadoCivil != "CASADA":
    estadoCivil = input("Valor inválido. Digite 'SOLTEIRA' ou 'CASADA': ").upper()

if sexo == "F" and estadoCivil == "CASADA":
    input("Há quanto tempo você é casada? ")