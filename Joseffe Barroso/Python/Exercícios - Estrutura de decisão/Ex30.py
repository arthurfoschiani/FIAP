preco = float(input("Qual o preço de etiqueta do produto? "))

print("Qual a forma de pagamento? ")
print("1 – À vista em dinheiro ou cheque")
print("2 – À vista no cartão de crédito")
print("3 – Em duas vezes no cartão de crédito")
print("4 – Mais de duas vezes no cartão de crédito")
opcao = int(input())

if opcao == 1:
    preco = preco * 0.9
    print(preco)
elif opcao == 2:
    preco = preco * 0.85
    print(preco)
elif opcao == 3:
    print(preco)
elif opcao == 4:
    preco = preco * 1.1
    print(preco)
else:
    print("Valor inválido")