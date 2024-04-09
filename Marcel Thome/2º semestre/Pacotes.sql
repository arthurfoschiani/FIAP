set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto

CREATE OR REPLACE PACKAGE teste1
AS
disciplina VARCHAR(20) := 'DB Application';
unidade VARCHAR(30) := 'FIAP - Paulista _ Manhã';
END teste1;

DECLARE
concatena VARCHAR(100);
BEGIN
concatena := teste1.disciplina || ', on FIAP';
DBMS_OUTPUT.PUT_LINE(concatena);
END;




DROP TABLE emp cascade constraints;
CREATE TABLE emp (
    empno number(3),
    sal number(8,2)
);
INSERT INTO emp VALUES (1, 1000);

CREATE OR REPLACE PACKAGE rh
AS
FUNCTION descobrir_salario (p_id IN emp.empno%TYPE)
RETURN NUMBER;
PROCEDURE reajuste(v_codigo_emp IN emp.empno%TYPE,
                    v_porcentagem IN NUMBER DEFAULT 25);
END rh;

CREATE OR REPLACE PACKAGE BODY rh
AS
FUNCTION descobrir_salario(p_id IN emp.empno%TYPE)
RETURN NUMBER
IS
v_salario emp.sal%TYPE := 0;
BEGIN
SELECT sal INTO v_salario FROM emp WHERE empno = p_id;
RETURN v_salario;
END descobrir_salario;
PROCEDURE reajuste(v_codigo_emp IN emp.empno%TYPE,
                    v_porcentagem IN NUMBER DEFAULT 25)
IS
BEGIN
UPDATE emp SET sal = sal + (sal * (v_porcentagem / 100))
WHERE empno = v_codigo_emp;
COMMIT;
END reajuste;
END rh;

DECLARE
v_sal NUMBER(8,2);
BEGIN
v_sal := rh.descobrir_salario(1);
DBMS_OUTPUT.PUT_LINE(v_sal);
END;

DECLARE
v_sal NUMBER(8,2);
BEGIN
v_sal := rh.descobrir_salario(1);
DBMS_OUTPUT.PUT_LINE('Salario atual - ' || v_sal);
rh.reajuste(1);
v_sal := rh.descobrir_salario(1);
DBMS_OUTPUT.PUT_LINE('Salario reajustado - ' || v_sal);
END;


-- Exercício 1
 
CREATE OR REPLACE PACKAGE pct_media 
AS 
nota1 number(3,1) := 10;
nota2 number(3,1) := 3;
nota3 number(3,1) := 10;
END pct_media;
 
DECLARE
    cal_media number(3,1);
BEGIN
    cal_media := (pct_media.nota1 + pct_media.nota2 + pct_media.nota3) / 3;
dbms_output.put_line(cal_media);
END;
  
-- Exercício 2
 
CREATE OR REPLACE PACKAGE pct_media1 
as
FUNCTION calcular_media (n1 IN number, n2 in number, n3 in number) 
RETURN NUMBER;
END pct_media1;
 
CREATE OR REPLACE PACKAGE BODY pct_media1
AS
FUNCTION calcular_media (n1 IN number, n2 in number, n3 in number) 
RETURN NUMBER
IS
v_media number:= 0;
BEGIN
v_media := (n1 + n2 + n3) / 3;
RETURN v_media;
END calcular_media;
END pct_media1;
 
SELECT round(pct_media1.calcular_media(10,3,10),1) FROM dual;
 
 
-- Exercício 3
 
create or replace package notas
as
function calcularMedia(nota1 number, nota2 number, nota3 number)
return number;
procedure mostrarResultado(media number);
end notas;
 
 
create or replace package body notas
as
function calcularMedia(nota1 number, nota2 number, nota3 number)
return number
is
v_media number(3,1);
begin
v_media := (nota1+nota2+nota3)/3;
return v_media;
end calcularMedia;
procedure mostrarResultado(media number)
is
begin
    if (media >= 6) then
        dbms_output.put_line('Aprovado');
    else
        dbms_output.put_line('Reprovado');
    end if;
end mostrarResultado;
end notas;
 
 
DECLARE
    media number(3,1);
BEGIN
    media := notas.calcularmedia(&nota1, &nota2, &nota3);
    dbms_output.put_line('Média: '|| media);
    notas.mostrarresultado(media);
END;