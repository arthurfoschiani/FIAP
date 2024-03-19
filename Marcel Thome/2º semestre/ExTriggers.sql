set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto


-- Exercício 01
DROP TABLE funcionarios CASCADE CONSTRAINTS;
CREATE TABLE funcionarios (
    id NUMBER(4) PRIMARY KEY,
    nome VARCHAR(50),
    salario NUMBER(7,2)
);

DROP TABLE auditoria CASCADE CONSTRAINTS;
CREATE TABLE auditoria (
    id NUMBER(4) PRIMARY KEY,
    id_funcionario NUMBER(4),
    operacao VARCHAR(10),
    data_operacao DATE
);
CREATE SEQUENCE auditoria_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER validar_salario
BEFORE INSERT 
ON funcionarios
FOR EACH ROW
BEGIN
    IF :NEW.salario < 1000 OR :NEW.salario > 10000 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Salário fora do intervalo permitido.');
    END IF;
END;

INSERT INTO funcionarios VALUES (1, 'Arthur', 100);


-- Exercício 02
CREATE OR REPLACE TRIGGER auditoria_funcionarios_trigger
AFTER INSERT OR UPDATE OR DELETE 
ON funcionarios
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO auditoria
        VALUES (auditoria_seq.NEXTVAL, :NEW.id, 'INSERT', SYSDATE);
    ELSIF UPDATING THEN
        INSERT INTO auditoria
        VALUES (auditoria_seq.NEXTVAL, :NEW.id, 'UPDATE', SYSDATE);
    ELSIF DELETING THEN
        INSERT INTO auditoria
        VALUES (auditoria_seq.NEXTVAL, :OLD.id, 'DELETE', SYSDATE);
    END IF;
END;

INSERT INTO funcionarios VALUES (1, 'Arthur', 1000);
SELECT * FROM funcionarios;
UPDATE funcionarios SET salario = 5000 WHERE id = 1;
SELECT * FROM auditoria;


-- Exercício 03
ALTER TABLE funcionarios ADD salario_anual NUMBER(10,2);

CREATE OR REPLACE TRIGGER calcular_salario_anual
BEFORE INSERT OR UPDATE 
ON funcionarios
FOR EACH ROW
BEGIN
    :NEW.salario_anual := :NEW.salario * 12;
END;

UPDATE funcionarios SET salario = 7000 WHERE id = 1;
SELECT * FROM funcionarios;


-- Exercício 04
DROP TABLE departamentos CASCADE CONSTRAINTS;
CREATE TABLE departamentos (
    id NUMBER(4) PRIMARY KEY,
    nome VARCHAR(100)
);

ALTER TABLE funcionarios ADD departamento_id NUMBER(4) REFERENCES departamentos;

CREATE OR REPLACE TRIGGER verificar_funcionarios_departamento
BEFORE DELETE ON departamentos
FOR EACH ROW
BEGIN
    DECLARE
        v_contador NUMBER;
    BEGIN
        SELECT COUNT(*) INTO v_contador FROM funcionarios WHERE departamento_id = :OLD.id;

        IF v_contador > 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Não é possível excluir o departamento pois existem funcionários associados.');
        END IF;
    END;
END;

INSERT INTO departamentos VALUES (1, 'Tecnologia');
UPDATE funcionarios SET departamento_id = 1 WHERE id = 1;
DELETE departamentos WHERE id = 1;


-- Exercício 05
DROP TABLE produtos CASCADE CONSTRAINTS;
CREATE TABLE produtos (
    id NUMBER(4) PRIMARY KEY,
    nome VARCHAR(100),
    contador_pedidos NUMBER(4) DEFAULT 0
);

DROP TABLE pedidos CASCADE CONSTRAINTS;
CREATE TABLE pedidos (
    id NUMBER(4) PRIMARY KEY,
    quantidade NUMBER(4),
    produto_id NUMBER(4) REFERENCES produtos
);

CREATE OR REPLACE TRIGGER atualizar_contador_pedidos
AFTER INSERT 
ON pedidos
FOR EACH ROW
BEGIN
    UPDATE produtos
    SET contador_pedidos = contador_pedidos + 1
    WHERE id = :NEW.produto_id;
END;

INSERT INTO produtos(id, nome) VALUES (1, 'Abacate');
INSERT INTO pedidos VALUES (1, 5, 1);
SELECT * FROM produtos;
