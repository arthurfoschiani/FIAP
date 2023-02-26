#Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”.

base = float(input("Digite o valor da base: "))

altura = float(input("Digite o valor da altura: "))

area = base * altura

if base > 100:
    print("Terreno grande")