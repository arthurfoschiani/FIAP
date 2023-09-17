set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto

create table aluno (
    ra char(9) constraint aluno_pk primary key,
    nome varchar2(50)
);

select * from aluno

//Executa linha por linha
insert into aluno (ra, nome) values ('111222333', 'Antonio Alves');
insert into aluno (ra, nome) values ('222333444', 'Beatriz Bernardes');
insert into aluno (ra, nome) values ('333444555', 'Cláudio Cardoso');

//Executa tudo de uma vez
begin
    insert into aluno (ra, nome) values ('111222333', 'Antonio Alves');
    insert into aluno (ra, nome) values ('222333444', 'Beatriz Bernardes');
    insert into aluno (ra, nome) values ('333444555', 'Cláudio Cardoso');
end;

// Da tabela para o blobo de dados
declare
    v_ra char(9) := '333444555';
    v_nome varchar2(50);
begin
    select nome into v_nome from aluno where ra = v_ra;
    dbms_output.put_line('O nome do aluno é: ' || v_nome);
end;

// Do bloco para a tabela
declare
    v_ra char(9) := '444555666';
    v_nome varchar2(50) := 'Daniela Dornelles';
begin
    insert into aluno (ra, nome) values (v_ra, v_nome);
end;

// Update do bloco
declare
    v_ra char(9) := '111222333';
    v_nome varchar2(50) := 'Antonio Rodrigues';
begin
    update aluno set nome = v_nome where ra = v_ra;
end;

// Delete do bloco
declare
    v_ra char(9) := '444555666';
begin
    delete from aluno where ra = v_ra;
end;


//Loop
declare 
    v_contador number(2):= 1;
begin
    loop
        DBMS_OUTPUT.PUT_LINE(v_contador);
        v_contador := v_contador + 1;
        exit when v_contador > 20;
    end loop;
end;

//While
declare 
    v_contador number(2):= 1;
begin
    while v_contador <= 20 loop
        DBMS_OUTPUT.PUT_LINE(v_contador);
        v_contador := v_contador + 1;
    end loop;
end;

//for
begin
    for v_contador in 1..20 loop
        DBMS_OUTPUT.PUT_LINE(v_contador);
    end loop;
end;

//for - reverse
begin
    for v_contador in reverse 1..20 loop
        DBMS_OUTPUT.PUT_LINE(v_contador);
    end loop;
end;