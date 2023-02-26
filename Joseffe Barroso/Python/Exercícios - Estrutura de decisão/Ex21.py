#Calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente 

valor1 = float(input("Insira o primeiro valor: "))

valor2 = float(input("Insira o segundo valor: "))

print("Ecolha uma das opções: ")
print("1 – Multiplicação")
print("2 – Adição")
print("3 – Divisão")
print("4 – Subtração")
print("5 – Fim de processo (sair do programa)")

opcao = int(input())

resultado = ""

if opcao == 1:
    resultado = valor1 * valor2
elif opcao == 2:
    resultado = valor1 + valor2
elif opcao == 3:
    resultado = valor1 / valor2
elif opcao == 4:
    resultado = valor1 - valor2
elif opcao == 5:
    print("Você saiu do programa")
else:
    print("Valor inválido. Essa opção não existe no seletor")

print(resultado)