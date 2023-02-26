onibus=[]
retornar="s"
lotacao=0
 
# Cria as linhas na Matriz
for i in range(0, 10, 1):
    onibus.append([])
 
# Cria para cada linha, cria as colunas na Matriz já gravando o valor digitado
for l in range(0, 3, 1):
    for c in range(0, 2, 1):    
        onibus[l].append("-----")
 
while(retornar=="s"):
    nome = input("Digite o nome do viajante (com até 5 letras): ")
    fileira = int(input("Digite a fileira que você deseja sentar (1 a 3): ")) - 1
    cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 2): ")) - 1
 
    while (onibus[fileira][cadeira] != "-----"):
        print("Esse assento já está reservado!")
        fileira = int(input("Digite a fileira que você deseja sentar (1 a 3): ")) - 1
        cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 2): ")) - 1
 
    onibus[fileira][cadeira] = nome
    print("Reserva realizada com sucesso!")
    lotacao = lotacao + 1
   
    if (lotacao != 6):
        retornar = input("Deseja realizar mais alguma reserva? (S/N)")
    else:
        print("O ônibus acabou de lotar! Bora!")
        break
 
print("Mapa das reservas do Ônibus:")
 
for i in range(0, 3, 1):
    print(onibus[i])