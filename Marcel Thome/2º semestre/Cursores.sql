select sysdate from dual;

create table funcionario (
    cd_fun number(2) primary key,
    nm_fun varchar(30) not null,
    salario number(7,2),
    dt_adm date
);

alter table funcionario add tempo number(5);

begin
    insert into funcionario values(1, 'Marcel', 10000, '17-apr-2000', null);
    insert into funcionario values(2, 'Claudia', 16000, '02-oct-1998', null);
    insert into funcionario values(3, 'Joaquim', 5500, '10-jul-2010', null);
    insert into funcionario values(4, 'Valéria', 7300, '08-jun-2015', null);
    commit;
end;

select * from funcionario;

set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto


//Feito com loop
declare
    cursor c_exibe is select nm_fun, salario from funcionario;
    v_exibe c_exibe%rowtype;
begin
    open c_exibe;
        loop
            fetch c_exibe into v_exibe;
            exit when c_exibe%notfound;
            dbms_output.put_line('O salário do '|| v_exibe.nm_fun ||' é de R$' || v_exibe.salario);
        end loop;
    close c_exibe;
end;

//Feito com for
declare
    cursor c_exibe is select nm_fun, salario from funcionario;
    v_exibe c_exibe%rowtype;
begin
    for v_exibe in c_exibe loop
        dbms_output.put_line('O salário do '|| v_exibe.nm_fun ||' é de R$' || v_exibe.salario);
    end loop;
end;

//Adicionar o tempo de trabalho em dias dos funcionários
declare
    cursor c_exibe is select cd_fun, dt_adm from funcionario;
    v_exibe c_exibe%rowtype;
begin
    for v_exibe in c_exibe loop
        update funcionario set tempo = sysdate - v_exibe.dt_adm where cd_fun = v_exibe.cd_fun;
    end loop;
end;

//Adicionar aumento para os funcionarios
declare
    cursor c_exibe is select cd_fun, dt_adm, tempo from funcionario;
    v_exibe c_exibe%rowtype;
begin
    for v_exibe in c_exibe loop
        if MONTHS_BETWEEN(sysdate, v_exibe.dt_adm) >= 150 then
            update funcionario set salario = salario * 1.10 where cd_fun = v_exibe.cd_fun;
        else
            update funcionario set salario = salario * 1.05 where cd_fun = v_exibe.cd_fun;
        end if;
    end loop;
end;

select * from funcionario;