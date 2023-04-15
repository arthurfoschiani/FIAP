baseDados = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00"

dadosList = baseDados.split(';')

clientes = []
produtos = []

for dado in dadosList:
    if dado.startswith('C'):
        clienteInfo = dado[1:].split(',')
        clientes.append({'Nome': clienteInfo[0], 'Idade': clienteInfo[1], 'Cidade': clienteInfo[2]})
    elif dado.startswith('P'):
        produtoInfo = dado[1:].split(',')
        produtos.append({'Nome': produtoInfo[0], 'Qtd em estoque': produtoInfo[1], 'Preço': produtoInfo[2]})

print('Clientes:')
for item in clientes:
    print('Nome:', item['Nome'])
    print('Idade:', item['Idade'])
    print('Cidade:', item['Cidade'])
    print()

print('Produtos:')
for item in produtos:
    print('Nome:', item['Nome'])
    print('Qtd em estoque:', item['Qtd em estoque'])
    print('Preço:', item['Preço'])
    print()