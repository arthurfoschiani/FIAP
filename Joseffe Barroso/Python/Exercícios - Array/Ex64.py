impares = []
pares = []

for i in range(20):
    num = int(input("Digite um número positivo e inteiro: "))
    while num < 0:
        num = int(input("Digite um número positivo e inteiro válido: "))
    
    if num % 2 == 1:
        impares.append(num)
    else:
        pares.append(num)

print("TOTAL IMPARES: ", len(impares))
print("PORCENTAGEM IMPARES: {:.1%}".format(len(impares) / (len(impares) + len(pares)) ))
print("TOTAL PARES: ", len(pares))
print("PORCENTAGEM PARES: {:.1%}".format(len(pares) / (len(impares) + len(pares)) ))