#Calcular a velocidade final de um automóvel

acelereacao = float(input("Insira a acelereação do automóvel (m/s2): "))

velocidadeInicial = float(input("Insira a velocidade inicial do automóvel (m/s): "))

tempo = float(input("Insira o tempo de percurso do automóvel (s): "))

velocidade = velocidadeInicial + acelereacao * tempo

print(velocidade)

if velocidade <= 40:
    print("Veículo muito lento")
elif velocidade <= 60:
    print("Velocidade permitida")
elif velocidade <= 80:
    print("Velocidade de cruzeiro")
elif velocidade <= 120:
    print("Veículo rápido")
else:
    print("Veículo muito alto")