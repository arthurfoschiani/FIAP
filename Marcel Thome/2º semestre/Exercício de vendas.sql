set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto

create table produto (
    id_pro number(3) primary key,
    ds_pro varchar(40) not null unique,
    pr_pro number(8,2) not null,
    estoque number(10,2)
);

SELECT * FROM produto;

INSERT INTO produto (id_pro, ds_pro, pr_pro, estoque) VALUES (1, 'Produto A', 10.00, 100);
INSERT INTO produto (id_pro, ds_pro, pr_pro, estoque) VALUES (2, 'Produto B', 20.00, 200);
INSERT INTO produto (id_pro, ds_pro, pr_pro, estoque) VALUES (3, 'Produto C', 30.00, 300);
INSERT INTO produto (id_pro, ds_pro, pr_pro, estoque) VALUES (4, 'Produto D', 40.00, 400);
INSERT INTO produto (id_pro, ds_pro, pr_pro, estoque) VALUES (5, 'Produto E', 50.00, 500);

DECLARE
    v_id_pro number(3) := &id_produto;
    v_ds_pro varchar(40) := '&descricao_produto';
    v_pr_pro number(8,2) := &preco_produto;
    v_estoque number(10,2) := &estoque_produto;
BEGIN
    INSERT INTO produto (id_pro, ds_pro, pr_pro, estoque)
    VALUES (v_id_pro, v_ds_pro, v_pr_pro, v_estoque);
    
    EXCEPTION
        when DUP_VAL_ON_INDEX then
        dbms_output.put_line('Não é permito ID repetido.');
END;

DECLARE
    v_id_pro number(3) := &id_produto;
    v_ds_pro varchar(40) := '&descricao_produto';
    v_pr_pro number(8,2) := &preco_produto;
    v_estoque number(10,2) := &estoque_produto;
BEGIN
    UPDATE produto
    SET ds_pro = v_ds_pro,
        pr_pro = v_pr_pro,
        estoque = v_estoque
    WHERE id_pro = v_id_pro;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado para o ID fornecido.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de UPDATE.');
END;

DECLARE
    v_id_pro number(3) := &id_produto;
BEGIN
    DELETE FROM produto
    WHERE id_pro = v_id_pro;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado para o ID fornecido.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de DELETE.');
END;




create table vendedor (
    id_vendedor number(3) primary key,
    nm_vendedor varchar(40) not null unique,
    salario number(8,2)
);

SELECT * FROM vendedor;

INSERT INTO vendedor (id_vendedor, nm_vendedor, salario) VALUES (1, 'Vendedor A', 3000.00);
INSERT INTO vendedor (id_vendedor, nm_vendedor, salario) VALUES (2, 'Vendedor B', 3500.00);
INSERT INTO vendedor (id_vendedor, nm_vendedor, salario) VALUES (3, 'Vendedor C', 4000.00);
INSERT INTO vendedor (id_vendedor, nm_vendedor, salario) VALUES (4, 'Vendedor D', 4500.00);
INSERT INTO vendedor (id_vendedor, nm_vendedor, salario) VALUES (5, 'Vendedor E', 5000.00);

DECLARE
    v_id_vendedor number(3) := &id_vendedor;
    v_nm_vendedor varchar(40) := '&nome_vendedor';
    v_salario number(8,2) := &salario_vendedor;
BEGIN
    INSERT INTO vendedor (id_vendedor, nm_vendedor, salario)
    VALUES (v_id_vendedor, v_nm_vendedor, v_salario);
    
    EXCEPTION
        when DUP_VAL_ON_INDEX then
        dbms_output.put_line('Não é permito ID repetido para vendedor.');
END;

DECLARE
    v_id_vendedor number(3) := &id_vendedor;
    v_nm_vendedor varchar(40) := '&nome_vendedor';
    v_salario number(8,2) := &salario_vendedor;
BEGIN
    UPDATE vendedor
    SET nm_vendedor = v_nm_vendedor,
        salario = v_salario
    WHERE id_vendedor = v_id_vendedor;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado para o ID fornecido no vendedor.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de UPDATE no vendedor.');
END;

DECLARE
    v_id_vendedor number(3) := &id_vendedor;
BEGIN
    DELETE FROM vendedor
    WHERE id_vendedor = v_id_vendedor;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado para o ID fornecido no vendedor.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de DELETE no vendedor.');
END;




create table venda (
    id_venda number(3) primary key,
    dt_venda date not null,
    total_venda number(10,2) not null,
    fk_vendedor number(3) references vendedor not null
);

SELECT * FROM venda;

INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (1, '01-JAN-23', 1000.00, 1);
INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (2, '01-FEB-23', 2000.00, 2);
INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (3, '01-MAR-23', 3000.00, 3);
INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (4, '01-APR-23', 4000.00, 4);
INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (5, '01-MAY-23', 5000.00, 5);

DECLARE
    v_id_venda number(3) := &id_venda;
    v_dt_venda date := TO_DATE('&data_venda', 'DD/MM/YYYY');
    v_total_venda number(10,2) := &total_venda;
    v_fk_vendedor number(3) := &fk_vendedor;
BEGIN
    INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor)
    VALUES (v_id_venda, v_dt_venda, v_total_venda, v_fk_vendedor);
    
    EXCEPTION
        when DUP_VAL_ON_INDEX then
        dbms_output.put_line('Não é permito ID repetido para venda.');
END;

DECLARE
    v_id_venda number(3) := &id_venda;
    v_dt_venda date := TO_DATE('&data_venda', 'DD/MM/YYYY');
    v_total_venda number(10,2) := &total_venda;
    v_fk_vendedor number(3) := &fk_vendedor;
BEGIN
    UPDATE venda
    SET dt_venda = v_dt_venda,
        total_venda = v_total_venda,
        fk_vendedor = v_fk_vendedor
    WHERE id_venda = v_id_venda;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado para o ID fornecido na venda.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de UPDATE na venda.');
END;

DECLARE
    v_id_venda number(3) := &id_venda;
BEGIN
    DELETE FROM venda
    WHERE id_venda = v_id_venda;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado para o ID fornecido na venda.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de DELETE na venda.');
END;




create table item_venda (
    fk_pro number(3) references produto not null,
    fk_venda number(3) references venda not null,
    total_pro number(10,2)
);

SELECT * FROM item_venda;

INSERT INTO item_venda (fk_pro, fk_venda, total_pro) VALUES (1, 1, 100.00);
INSERT INTO item_venda (fk_pro, fk_venda, total_pro) VALUES (2, 2, 200.00);
INSERT INTO item_venda (fk_pro, fk_venda, total_pro) VALUES (3, 3, 300.00);
INSERT INTO item_venda (fk_pro, fk_venda, total_pro) VALUES (4, 4, 400.00);
INSERT INTO item_venda (fk_pro, fk_venda, total_pro) VALUES (5, 5, 500.00);

DECLARE
    v_fk_pro number(3) := &fk_produto;
    v_fk_venda number(3) := &fk_venda;
    v_total_pro number(10,2) := &total_produto;
BEGIN
    INSERT INTO item_venda (fk_pro, fk_venda, total_pro)
    VALUES (v_fk_pro, v_fk_venda, v_total_pro);
    
    EXCEPTION
        when DUP_VAL_ON_INDEX then
        dbms_output.put_line('Conflito de chave ao inserir em item_venda.');
END;

DECLARE
    v_fk_pro number(3) := &fk_produto;
    v_fk_venda number(3) := &fk_venda;
    v_total_pro number(10,2) := &total_produto;
BEGIN
    UPDATE item_venda
    SET total_pro = v_total_pro
    WHERE fk_pro = v_fk_pro AND fk_venda = v_fk_venda;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado para a combinação de FK fornecida em item_venda.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de UPDATE em item_venda.');
END;

DECLARE
    v_fk_pro number(3) := &fk_produto;
    v_fk_venda number(3) := &fk_venda;
BEGIN
    DELETE FROM item_venda
    WHERE fk_pro = v_fk_pro AND fk_venda = v_fk_venda;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado para a combinação de FK fornecida em item_venda.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de DELETE em item_venda.');
END;




DECLARE
    v_id_venda number(3) := &codigo_venda;
BEGIN
    FOR v_produto IN (SELECT p.id_pro, p.ds_pro, p.pr_pro, iv.total_pro
                      FROM produto p INNER JOIN item_venda iv ON iv.fk_pro = p.id_pro
                      WHERE iv.fk_venda = v_id_venda)
    LOOP
        dbms_output.put_line('ID Produto: ' || v_produto.id_pro || ', Descrição: ' || v_produto.ds_pro ||
                             ', Preço: ' || v_produto.pr_pro || ', Total Produto: ' || v_produto.total_pro);
    END LOOP;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhuma venda encontrada com o código fornecido.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação.');
END;
