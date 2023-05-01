from ConnectionBD import execute, executeSelect

print(execute("INSERT INTO TB_USUARIO (ID, NOME) VALUES ({}, '{}')".format(1, 'Joseffe')))
print(execute("UPDATE TB_USUARIO SET NOME='{}' WHERE ID={}".format('Arthur', 1)))
print(execute("DELETE FROM TB_USUARIO WHERE ID={}".format(1)))
print(executeSelect('SELECT * FROM TB_USUARIO'))