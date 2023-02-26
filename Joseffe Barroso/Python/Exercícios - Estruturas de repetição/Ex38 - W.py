#Exibir a soma dos números inteiros positivos do intervalo de um a cem.

n = 100
count=1
ultimo=0
while count <= n:
    soma = count + ultimo
    ultimo = soma
    count += 1

print(soma)