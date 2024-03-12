set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto

drop table produto cascade constraints;
create table produto (
    codigo number(4),
    valor number(7,2)
);

insert into produto values (1001, 2.55);
insert into produto values (1002, 3.25);
insert into produto values (1003, 2.85);
select * from produto;

drop table valor_produto cascade constraints;
create table valor_produto (
    codigo number(4),
    valor_anterior number(7,2),
    valor_novo number(7,2)
);

create or replace trigger verifica_valor
before UPDATE
of valor
on produto
for each row
begin
insert into valor_produto
values(:old.codigo, :old.valor, :new.valor);
end;

update produto set valor = 3 where codigo = 1002;
select * from valor_produto;


--Guardar senha do usuário
drop table usuario cascade constraints;
create table usuario (
    codigo number(4),
    email varchar(30),
    senha varchar(30)
);

insert into usuario values (1001, 'arthur@fiap.com.br', '12345679');
insert into usuario values (1002, 'bruna@fiap.com.br', '12345678');
select * from usuario;

drop table senha_usuario cascade constraints;
create table senha_usuario (
    codigo number(4),
    senha_anterior varchar(30),
    senha_nova varchar(30),
    data_mudanca date default sysdate
);

create or replace trigger verifica_senha
before UPDATE
of senha
on usuario
for each row
begin
insert into senha_usuario
values(:old.codigo, :old.senha, :new.senha, sysdate);
end;

update usuario set senha = '987654321' where codigo = 1002;
select * from senha_usuario;


-- Fazendo extrato da conta
drop table conta cascade constraints;
create table conta (
    codigo number(6),
    nome_cliente varchar(30),
    saldo number(9,2)
);

insert into conta values (1001, 'Arthur F', 2500);
insert into conta values (1002, 'Bruna M', 500);
select * from conta;

drop table extrato_bancario cascade constraints;
create table extrato_bancario (
    codigo number(6),
    info_operacao varchar(10),
    valor_operacao number(9,2),
    saldo_anterior number(9,2),
    saldo_novo number(9,2),
    data_mudanca date default sysdate
);

CREATE OR REPLACE FUNCTION saqueOuDeposito (valorAnterior IN NUMBER, valorNovo IN NUMBER)
    RETURN varchar
IS 
    resultado varchar(10);
BEGIN
    if valorNovo > valorAnterior then
        resultado := 'deposito';
    else
        resultado := 'saque';
    end if;
    RETURN resultado;
END;

CREATE OR REPLACE FUNCTION getValorOperacao (valorAnterior IN NUMBER, valorNovo IN NUMBER)
    RETURN number
IS 
    resultado number(9,2);
BEGIN
    if valorNovo > valorAnterior then
        resultado := valorNovo - valorAnterior;
    else
        resultado := valorAnterior - valorNovo;
    end if;
    RETURN resultado;
END;

create or replace trigger registrar_operacao
before UPDATE
of saldo
on conta
for each row
begin
insert into extrato_bancario
values(:old.codigo, saqueOuDeposito(:old.saldo, :new.saldo), getValorOperacao(:old.saldo, :new.saldo), :old.saldo, :new.saldo, sysdate);
end;

update conta set saldo = 2000 where codigo = 1002;
select * from conta;
select * from extrato_bancario;