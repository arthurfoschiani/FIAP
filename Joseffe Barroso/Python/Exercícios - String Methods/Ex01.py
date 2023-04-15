alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo;Natan Cruz,10,Sao Paulo"

alunosList = alunosVestibular.split(';')

alunosAprov = []

for aluno in alunosList:
    alunoInfo = aluno.split(',')
    nota = float(alunoInfo[1])
    if nota >= 7:
        alunosAprov.append({'Nome': alunoInfo[0], 'Nota': nota, 'Cidade': alunoInfo[2]})

for item in alunosAprov:
    print('Nome:', item['Nome'])
    print('Nota:', item['Nota'])
    print('Cidade:', item['Cidade'])
    print()