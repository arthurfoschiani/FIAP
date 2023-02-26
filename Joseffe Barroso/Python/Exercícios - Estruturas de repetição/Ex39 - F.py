ultimo=0
penultimo=1
termo = ultimo + penultimo

for count in range(1, 31, 1):
    termo = ultimo + penultimo
    penultimo = ultimo
    ultimo = termo
    print(termo)