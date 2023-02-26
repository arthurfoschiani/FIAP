#Exibir a soma dos números inteiros positivos do intervalo de um a cem.

ultimo=0

for count in range(1, 101, 1):
    soma = count + ultimo
    ultimo = soma

print(soma)