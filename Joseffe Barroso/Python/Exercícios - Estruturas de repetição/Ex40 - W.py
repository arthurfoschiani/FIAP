n = 20
ultimo = -1
penultimo = 1
anti = 1
termo = ultimo + penultimo + anti

count=1
while count <= n:
    print(termo)
    anti = penultimo
    penultimo = ultimo
    ultimo = termo
    count += 1
    termo = ultimo + penultimo + anti