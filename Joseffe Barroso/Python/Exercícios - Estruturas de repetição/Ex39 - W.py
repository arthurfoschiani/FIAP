n = 30
ultimo=0
penultimo=1
termo = ultimo + penultimo

count=1
while count <= n:
    termo = ultimo + penultimo
    penultimo = ultimo
    ultimo = termo
    count += 1
    print(termo)