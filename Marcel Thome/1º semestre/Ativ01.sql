create table CIDADE
(codigo number(4) constraint cidade_cd_pk primary key,
nome varchar(30) constraint cidade_nm_nn not null)

create table SOCIO
(CPF char(11) constraint socio_cpf_pk primary key,
nome varchar(20) constraint socio_nm_nn not null,
data_nasc date constraint socio_dt_nn not null,
rg varchar(15) constraint socio_rg_nn not null,
cidade number(4) constraint socio_cdd_fk references cidade
                constraint socio_cdd_nn not null)
                
alter table CIDADE 
add uf char(2)constraint cidade_uf_nn not null;

alter table SOCIO
add (fone varchar(10), 
sexo char(1) constraint socio_sx_nn not null);

alter table SOCIO
modify nome varchar(35);

create table SETOR
(codigo number(3) constraint setor_cd_pk primary key,
nome varchar(30) constraint setor_nm_nn not null)

alter table SOCIO
add (setor number(3) constraint socio_st_fk references setor 
                    constraint socio_st_nn not null);
                    
CREATE TABLE DEPENDENTE (
Socio CHAR(11) constraint dp_sc_nn NOT NULL constraint dp_sc_fk references socio,
Numero NUMERIC(4) constraint dp_sc_pk PRIMARY KEY,
Nome VARCHAR(30) constraint dp_nm_nn NOT NULL,
DataNasc DATE constraint dp_dt_nn NOT NULL
);

INSERT INTO CIDADE
VALUES (1, 'São Paulo', 'SP');

INSERT INTO CIDADE
VALUES (2, 'Rio de Janeiro', 'RJ');

INSERT INTO SOCIO
VALUES ('11111111111', 'João', '1990-01-01', '111111111', 1, '1111111111', 'M', 1);

INSERT INTO SOCIO
VALUES ('22222222222', 'Maria', '1995-05-05', '222222222', 2, '2222222222', 'F', 2);

INSERT INTO SETOR 
VALUES (1, 'Vendas');

INSERT INTO SETOR 
VALUES (2, 'Financeiro');

INSERT INTO DEPENDENTE 
VALUES ('11111111111', 1, 'Pedro', '2010-01-01');

INSERT INTO DEPENDENTE 
VALUES ('11111111111', 2, 'Ana', '2012-05-05');

INSERT INTO DEPENDENTE 
VALUES ('22222222222', 1, 'Lucas', '2011-02-01');
