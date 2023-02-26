
print("Escolha um das opções: ")
print("1 – Triângulo")
print("2 – Quadrado")
print("3 – Retângulo")
print("4 – Círculo")
print("5 – Fim de processo")

opcao = int(input())

if opcao == 1:
    base = float(input("Digite a base do triangulo: "))
    altura = float(input("Digite a altura do triangulo: "))

    area = base * altura / 2

    print("A area do trinagulo é {}".format(area))
elif opcao == 2:
    lado = float(input("Digite o lado do quadrado: "))

    area = lado * lado

    print("A area do quadrado é {}".format(area))
elif opcao == 3:
    base = float(input("Digite a base do retangulo: "))
    altura = float(input("Digite a altura do retangulo: "))

    area = base * altura

    print("A area do retangulo é {}".format(area))
elif opcao == 4:
    raio = float(input("Digite o raio do círculo: "))

    area = 3.14 * raio

    print("A area do circulo é {}".format(area))
elif opcao == 5:
    print("Você saiu do programa")
else:
    print("Valor inválido. Essa opção não existe no seletor")