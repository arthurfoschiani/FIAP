from ConnectionBD import execute, executeSelect
from Model.Categoria import Categoria

class categoriaRepository:
    def incluirCategoria(nome: str):
        request = execute("INSERT INTO tb_categoria (nome) VALUES ('{}')".format(nome))
        if(request[0]):
            print("Categoria adicionada com sucesso!")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")

    def atualizarCategoria(c: Categoria, id: int):
        request = executeSelect('SELECT * FROM tb_categoria WHERE ID={}'.format(id))
        if (request[0]):
            if (request[1]):
                request = execute("update tb_categoria set nome = '{}' where id = {}".format(c.nome, id))
                if(request[0]):
                    print("Categoria atualizada com sucesso!")
                else:
                    print(f"Ocorreu um problema durante a execução: {str(request[1])}")
            else:
                print("Categoria não encontrada.")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")

    def excluirCategoria(id: int):
        request = executeSelect('SELECT * FROM tb_categoria WHERE ID={}'.format(id))
        if (request[0]):
            if (request[1]):
                request = execute("delete from tb_categoria where id = {}".format(id))
                if(request):
                    print("Categoria deletada com sucesso!")
                else:
                    print(f"Ocorreu um problema durante a execução: {str(request[1])}")
            else:
                print("Categoria não encontrada.")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")

    def listarCategorias():
        request = executeSelect('SELECT * FROM tb_categoria order by 1')
        print(request)
        if (request[0]):
            if (request[1]):
                listaCategorias = []
                for categoria in request[1]:
                    c = Categoria(id=categoria[0], nome=categoria[1])
                    listaCategorias.append(c)
                return listaCategorias
            else:
                print("Categoria não encontrada.")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")

    def buscarCategoriaPorId(id: int):
        request = executeSelect('SELECT * FROM tb_categoria WHERE ID={}'.format(id))
        if (request[0]):
            if (request[1]):
                c = Categoria(id=request[1][0][0], nome=request[1][0][1])

                return c
            else:
                print("Categoria não encontrada.")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")