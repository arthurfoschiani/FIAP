drop table aluno cascade constraints;
create table aluno ( ra char(2) primary key,
                     nome varchar(20));
insert into aluno values('1','Marcel');
insert into aluno values('2','Silmara');
commit;
select * from aluno;

set serveroutput on

CREATE OR REPLACE PROCEDURE PROC_NOME_ALUNO (P_RA IN CHAR) 
IS
V_NOME VARCHAR2(50);
BEGIN
SELECT NOME INTO V_NOME
FROM ALUNO
WHERE RA = P_RA;
DBMS_OUTPUT.PUT_LINE (V_NOME);
END PROC_NOME_ALUNO;

EXEC PROC_NOME_ALUNO(1);