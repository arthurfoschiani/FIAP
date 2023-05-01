def connection():
    try:
        import cx_Oracle
        dsn = cx_Oracle.makedsn(host='oracle.fiap.com.br', port=1521, sid='ORCL')
        conn = cx_Oracle.connect(user='rm96525', password='211203', dsn=dsn)
        return conn.cursor(), conn
    except Exception as e:
        return print("Problema com a conexão do banco")


def execute (commandLine):
    try:
        cursor, conn = connection()

        cursor.execute(commandLine)
        conn.commit()
        
        return True, 200
    except Exception as e:
        return False, e
    finally:
        cursor.close()
        conn.close()

def executeSelect(commandLine):
    try:
        cursor, conn = connection()

        cursor.execute(commandLine)

        rows = cursor.fetchall()

        return True, rows
    
    except Exception as e:
        return False, e
    finally:
        cursor.close()
        conn.close()
