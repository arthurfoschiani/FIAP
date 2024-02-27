set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto

-- Tabela produto: insert, update, delete e select
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




-- Tabela vendedor: insert, update, delete e select
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




-- Tabela venda: insert, update, delete e select
create table venda (
    id_venda number(3) primary key,
    dt_venda date not null,
    total_venda number(10,2) not null,
    fk_vendedor number(3) references vendedor not null
);

SELECT * FROM venda;

INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (1, '01/01/23', 1000.00, 1);
INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (2, '01/02/23', 2000.00, 2);
INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (3, '01/03/23', 3000.00, 3);
INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (4, '01/04/23', 4000.00, 4);
INSERT INTO venda (id_venda, dt_venda, total_venda, fk_vendedor) VALUES (5, '01/05/23', 5000.00, 5);

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




-- Tabela item_venda: insert, update, delete e select
create table item_venda (
    fk_pro number(3) references produto not null,
    fk_venda number(3) references venda not null,
    total_pro number(10,2),
    qtd_pro number(5,2) not null
);

SELECT * FROM item_venda;

INSERT INTO item_venda (fk_pro, fk_venda, qtd_pro) VALUES (1, 1, 2);
INSERT INTO item_venda (fk_pro, fk_venda, qtd_pro) VALUES (2, 2, 3);
INSERT INTO item_venda (fk_pro, fk_venda, qtd_pro) VALUES (5, 2, 5);
INSERT INTO item_venda (fk_pro, fk_venda, qtd_pro) VALUES (3, 3, 2);
INSERT INTO item_venda (fk_pro, fk_venda, qtd_pro) VALUES (4, 4, 2);
INSERT INTO item_venda (fk_pro, fk_venda, qtd_pro) VALUES (5, 5, 1);

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




-- Relatório da venda e seus respectivos produtos
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




-- Relatório de venda e seus respectivos vendedores
DECLARE
BEGIN
    dbms_output.put_line('Relatório de Vendas e Vendedores:');
    dbms_output.put_line('ID Venda | Data Venda | Total Venda | ID Vendedor | Nome Vendedor');

    FOR r IN (SELECT v.id_venda, v.dt_venda, v.total_venda, vd.id_vendedor, vd.nm_vendedor
              FROM venda v
              JOIN vendedor vd ON v.fk_vendedor = vd.id_vendedor
              ORDER BY v.id_venda)
    LOOP
        dbms_output.put_line(r.id_venda || ' | ' || 
                             r.dt_venda || ' | ' || 
                             r.total_venda || ' | ' || 
                             r.id_vendedor || ' | ' || 
                             r.nm_vendedor);
    END LOOP;
    
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhuma venda encontrada.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de geração de relatório.');
END;




-- Relatório de vendedor com seu salário acrescido em 10%
DECLARE
    v_salario_bonus NUMBER(10,2);
BEGIN
    dbms_output.put_line('Relatório de Vendedores com Salário + Bônus:');
    dbms_output.put_line('ID Vendedor | Nome Vendedor | Salário Base | Bônus 10% Vendas | Salário Final');
    dbms_output.put_line('--------------------------------------------------------------------------------');

    FOR r IN (
        SELECT vd.id_vendedor,
               vd.nm_vendedor,
               vd.salario,
               SUM(v.total_venda) * 0.10 AS bonus_vendas,
               vd.salario + (SUM(v.total_venda) * 0.10) AS salario_final
        FROM vendedor vd
        LEFT JOIN venda v ON vd.id_vendedor = v.fk_vendedor
        GROUP BY vd.id_vendedor, vd.nm_vendedor, vd.salario
        ORDER BY vd.id_vendedor
    )
    LOOP
        dbms_output.put_line(r.id_vendedor || ' | ' || 
                             r.nm_vendedor || ' | ' || 
                             r.salario || ' | ' || 
                             r.bonus_vendas || ' | ' || 
                             r.salario_final);
    END LOOP;
    
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('Nenhum registro encontrado.');
    WHEN OTHERS THEN
        dbms_output.put_line('Erro ao executar a operação de geração de relatório.');
END;




--Preencher coluna total_pro na tabela produto
DECLARE
  v_fk_pro NUMBER(3);
  v_fk_venda NUMBER(3);
  v_total_pro NUMBER(10,2);
BEGIN
  FOR iv IN (SELECT * FROM item_venda) LOOP
    v_fk_pro := iv.fk_pro;
    v_fk_venda := iv.fk_venda;

    SELECT pr_pro INTO v_total_pro FROM produto WHERE id_pro = v_fk_pro;

    UPDATE item_venda
      SET total_pro = v_total_pro * iv.qtd_pro
      WHERE fk_pro = v_fk_pro AND fk_venda = v_fk_venda;
  END LOOP;
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Erro ao calcular o total do item.');
END;

select * from item_venda;

--Emitir NF e total venda
DECLARE
  v_id_venda NUMBER(3) := &cod_venda;
  v_total_venda NUMBER(10,2) := 0;
  v_nome_vendedor VARCHAR2(40);
  v_data_venda DATE;
  v_itens_venda VARCHAR2(2000);
  v_fk_vendedor NUMBER;
  v_descricao_produto VARCHAR2(100);
  v_preco_produto NUMBER(10,2);
  v_qtd_pro NUMBER(5,2);
  CURSOR c_item_venda IS SELECT fk_pro, qtd_pro FROM item_venda WHERE fk_venda = v_id_venda;

BEGIN
  SELECT fk_vendedor, dt_venda INTO v_fk_vendedor, v_data_venda FROM venda WHERE id_venda = v_id_venda;

  SELECT nm_vendedor INTO v_nome_vendedor FROM vendedor WHERE id_vendedor = v_fk_vendedor;

  FOR iv IN c_item_venda LOOP
    SELECT ds_pro, pr_pro INTO v_descricao_produto, v_preco_produto FROM produto WHERE id_pro = iv.fk_pro;

    v_qtd_pro := iv.qtd_pro;
    v_total_venda := v_total_venda + (v_preco_produto * v_qtd_pro);

    v_itens_venda := v_itens_venda || v_descricao_produto || ' - R$' || v_preco_produto || ' - Qtd: ' || v_qtd_pro || chr(10);
  END LOOP;

  UPDATE venda
  SET total_venda = v_total_venda
  WHERE id_venda = v_id_venda;

  DBMS_OUTPUT.PUT_LINE('---------------------------------------');
  DBMS_OUTPUT.PUT_LINE('**NOTA FISCAL**');
  DBMS_OUTPUT.PUT_LINE('---------------------------------------');
  DBMS_OUTPUT.PUT_LINE('Número: NF-' || TO_CHAR(v_id_venda));
  DBMS_OUTPUT.PUT_LINE('Data: ' || TO_CHAR(v_data_venda, 'DD/MM/YYYY'));
  DBMS_OUTPUT.PUT_LINE('Vendedor: ' || v_nome_vendedor);
  DBMS_OUTPUT.PUT_LINE('---------------------------------------');
  DBMS_OUTPUT.PUT_LINE(v_itens_venda);
  DBMS_OUTPUT.PUT_LINE('---------------------------------------');
  DBMS_OUTPUT.PUT_LINE('Total: R$' || v_total_venda);
  DBMS_OUTPUT.PUT_LINE('---------------------------------------');
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Venda não encontrada.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Erro ao gerar a NF.');
END;


--Função para reajusta o salário em 25%
CREATE OR REPLACE FUNCTION aumentoSalario (salario IN NUMBER)
    RETURN number
IS 
    salarioReajustado number(8,2);
BEGIN
    salarioReajustado := salario * 1.25;
    RETURN salarioReajustado;
END;

select aumentoSalario(1500) from dual;


--Bloco para reajusta salário dos vendedores
declare
    cursor c_vendedor is select id_vendedor, nm_vendedor, salario from vendedor;
    resul number(10,2);
begin
    for vd in c_vendedor
    loop
        resul := aumentoSalario(vd.salario);
        DBMS_OUTPUT.PUT_LINE('O salario do vendedor ' || vd.nm_vendedor || ' foi de ' || vd.salario || ' para ' || resul);
        update vendedor
        set salario = resul
        where id_vendedor = vd.id_vendedor;
    end loop;
end;


--Procedure para mostrar detalhes do produto
CREATE OR REPLACE PROCEDURE PROC_DADOS_PROD (C_PRO IN NUMBER) 
IS
    v_id_pro number(3);
    v_ds_pro varchar(40);
    v_pr_pro number(8,2);
    v_estoque number(10,2);
BEGIN
    SELECT id_pro, ds_pro, pr_pro, estoque INTO v_id_pro, v_ds_pro, v_pr_pro, v_estoque FROM produto WHERE id_pro = c_pro;
    DBMS_OUTPUT.PUT_LINE ('Id produto: ' || v_id_pro);
    DBMS_OUTPUT.PUT_LINE ('Descrição produto: ' || v_ds_pro);
    DBMS_OUTPUT.PUT_LINE ('Preço produto: ' || v_pr_pro);
    DBMS_OUTPUT.PUT_LINE ('Estoque produto: ' || v_estoque);
END PROC_DADOS_PROD;

EXEC PROC_DADOS_PROD(1);


--Procedure para mostrar descrição do produto com mais de 5 de estoque
CREATE OR REPLACE PROCEDURE PROC_PRODUTOS_ESTOQUE_CHEIO (comeca in boolean) 
IS
    CURSOR C_PRODUTOS IS SELECT ds_pro FROM produto WHERE estoque > 5;
BEGIN
    DBMS_OUTPUT.PUT_LINE ('Produtos com estoque maior que 5: ');
    FOR prod IN C_PRODUTOS
    LOOP
        DBMS_OUTPUT.PUT_LINE (prod.ds_pro);
    END LOOP;
END PROC_PRODUTOS_ESTOQUE_CHEIO;

EXEC PROC_PRODUTOS_ESTOQUE_CHEIO(false);