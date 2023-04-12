baseDados = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00"

dadosList = baseDados.split(';')

clientesDict = {}
produtosDict = {}

for dado in dadosList:
    if dado.startswith('C'):
        clienteInfo = dado[1:].split(',')
        clientesDict[clienteInfo[0]] = {'Idade': clienteInfo[1], 'Cidade': clienteInfo[2]}
    elif dado.startswith('P'):
        produtoInfo = dado[1:].split(',')
        produtosDict[produtoInfo[0]] = {'Qtd em estoque': produtoInfo[1], 'Preço': produtoInfo[2]}

print('Clientes:')
for nome, info in clientesDict.items():
    print('Nome:', nome)
    print('Idade:', info['Idade'])
    print('Cidade:', info['Cidade'])
    print()

print('Produtos:')
for nome, info in produtosDict.items():
    print('Nome:', nome)
    print('Qtd em estoque:', info['Qtd em estoque'])
    print('Preço:', info['Preço'])
    print()