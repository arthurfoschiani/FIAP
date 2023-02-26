#Verificar se formam ou não um triângulo retangulo

l1 = float(input("Digite o primeiro lado do triangulo: "))

l2 = float(input("Digite o segundo lado do triangulo: "))

l3 = float(input("Digite o terceiro lado do triangulo: "))

if (l1 + l2) > l3 and (l1 + l3) > l2 and (l2 + l3) > l1:
    if ((l1 * l1) == (l2 * l2) + (l3 * l3)) or ((l2 * l2) == (l1 * l1) + (l3 * l3)) or ((l3 * l3) == (l2 * l2) + (l1 * l1)):
        print("É um triangulo retângulo")
    else:
        print("Não é um triangulo retangulo")
else:
    print("As medidas não formam um trinagulo")