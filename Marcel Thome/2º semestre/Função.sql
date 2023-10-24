set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto

CREATE OR REPLACE FUNCTION soma (P1 IN NUMBER, P2 IN NUMBER)
    RETURN number
IS 
    total number(4);
BEGIN
    total := p1 + p2;
    RETURN total;
END;

SELECT soma(1,1) from dual;

DECLARE
    nota1 number(3) := &nota1;
    nota2 nota1%type := &nota2;
    resul nota1%type;
BEGIN
    resul := soma(nota1, nota2);
    DBMS_OUTPUT.PUT_LINE('Resultado: ' || resul);
END;




//Exercício
drop table boletim cascade constraints;
create table Boletim (
    Rm number(3) not null,
    Nome_Comp    varchar2(20) not null,
    C_Hora        number(3) not null,
    Nota1        number(4,2) not null,
    Nota2        number(4,2) not null,
    Nota3        number(4,2) not null,
    Media        number(4,2),
    Faltas        number(3) not null,
    Situacao    varchar2(40)
);
 

INSERT INTO boletim VALUES (135, 'DB Application', 200, 10, 10, 10, null, 0, null);
INSERT INTO boletim VALUES (135, 'IA', 180, 7.5, 7.5, 8.0, null, 170, null);
INSERT INTO boletim VALUES (135, 'ChatBot', 180, 1.0, 2.5, 1.5, null, 18, null);
INSERT INTO boletim VALUES (135, 'UX', 200, 2.5, 1.0, 1.5, null, 170, null);
INSERT INTO boletim VALUES (135, 'Mobile', 200, 4.0, 5.0, 4.5, null, 20, null);

commit;

SELECT * FROM boletim;


// Função para calcular a média
CREATE OR REPLACE FUNCTION mediaNotas (N1 IN NUMBER, N2 IN NUMBER, N3 IN NUMBER)
    RETURN number
IS 
    media number(4,2);
BEGIN
    media := (N1 + N2 + N3)/3;
    RETURN media;
END;

//Teste
SELECT media(7,8,9) from dual;

//PL para atualizar a tabela
DECLARE
    cursor c_exibe is select nota1, nota2, nota3, Nome_Comp from boletim;
BEGIN
    for v_exibe in c_exibe loop
        update boletim set media = mediaNotas(v_exibe.nota1, v_exibe.nota2, v_exibe.nota3) where Nome_Comp = v_exibe.Nome_Comp;
    end loop;
END;

SELECT * FROM boletim;