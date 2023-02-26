ultimo = -1
penultimo = 1
anti = 1
termo = ultimo + penultimo + anti

# print("0")
# print("1")
# print("1")
# print("1")
for count in range(1, 21, 1):
    print(termo)
    anti = penultimo
    penultimo = ultimo
    ultimo = termo
    termo = ultimo + penultimo + anti
    # print(count)