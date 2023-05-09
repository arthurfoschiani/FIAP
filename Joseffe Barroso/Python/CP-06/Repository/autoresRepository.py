from ConnectionBD import execute, executeSelect
from Model.Autor import Autor

class Autores:
    def incluirAutor(autor: Autor):
        request = execute("INSERT INTO TB_autor VALUES ({}, '{}', {}, '{}')".format(autor.id, autor.nome, autor.email, autor.telefone, autor.bio))
        if(request[0]):
            print("Autor adicionado com sucesso!")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")

    def atualizarAutor(id: int, autor: Autor):
        request = executeSelect('SELECT * FROM TB_autor WHERE ID={}'.format(id))
        if (request[0]):
            if (request[1]):
                request = execute("update tb_autor set nome = '{}', email = '{}', telefone = '{}', bio = '{}' where id = {}".format(autor.nome, autor.email, autor.telefone, autor.bio, id))
                if(request[0]):
                    print("Autor atualizado com sucesso!")
                else:
                    print(f"Ocorreu um problema durante a execução: {str(request[1])}")
            else:
                print("Autor não encontrado.")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")

    def excluirAutor(id: int):
        request = executeSelect('SELECT * FROM TB_autor WHERE ID={}'.format(id))
        if (request[0]):
            if (request[1]):
                request = execute("delete from tb_autor where id = {}".format(id))
                if(request):
                    print("Autor deletado com sucesso!")
                else:
                    print(f"Ocorreu um problema durante a execução: {str(request[1])}")
            else:
                print("Autor não encontrado.")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")

    def listarAutores():
        request = executeSelect('SELECT * FROM tb_autor order by 1')
        if (request[0]):
            if (request[1]):
                listaAutores = []
                for autor in request[1]:
                    a = Autor()
                    a.id = autor[0]
                    a.nome = autor[1]
                    a.email = autor[2]
                    a.telefone = autor[3]
                    a.bio = autor[4]
                    listaAutores.append(a)
                
                return listaAutores;
            else:
                print("Autor não encontrado.")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")

    def buscarAutorPorId():
        id = int(input("Digite o ID do autor a ser listado: "))
        request = executeSelect('SELECT * FROM TB_autor WHERE ID={}'.format(id))
        if (request[0]):
            if (request[1]):
                a = Autor()
                a.id = request[1][0][0]
                a.nome = request[1][0][1]
                a.email = request[1][0][2]
                a.telefone = request[1][0][3]
                a.bio = request[1][0][4]

                return a;
            else:
                print("autor não encontrado.")
        else:
            print(f"Ocorreu um problema durante a execução: {str(request[1])}")