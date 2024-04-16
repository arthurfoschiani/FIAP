--Arthur Foschiani de Souza - 96525

set serveroutput on
-- Para visualizar os dados

set verify off
-- Para mostrar o resultado direto

DROP TABLE pedido CASCADE CONSTRAINTS;
DROP TABLE musica CASCADE CONSTRAINTS;
DROP TABLE item_ped CASCADE CONSTRAINTS;

CREATE TABLE pedido (
    id_ped number(3),
    dt_ped date,
    total_ped number(8,2)
);

CREATE TABLE musica (
    id_mus number(3),
    tit_mus varchar(20),
    valor_mus number(4,2)
);

CREATE TABLE item_ped (
    id_ped number(3),
    id_mus number(3)
);

INSERT INTO pedido VALUES (1, sysdate, null);
INSERT INTO pedido VALUES (2, sysdate, null);
INSERT INTO pedido VALUES (3, sysdate, null);

INSERT INTO musica VALUES (1, 'aaaaaa', 19.99);
INSERT INTO musica VALUES (2, 'bbbbbb', 5.89);
INSERT INTO musica VALUES (3, 'cccccc', 27.79);
INSERT INTO musica VALUES (4, 'dddddd', 32.40);

INSERT INTO item_ped VALUES (1, 4);
INSERT INTO item_ped VALUES (2, 1);
INSERT INTO item_ped VALUES (2, 2);
INSERT INTO item_ped VALUES (2, 3);
INSERT INTO item_ped VALUES (2, 4);
INSERT INTO item_ped VALUES (3, 3);
INSERT INTO item_ped VALUES (3, 2);

--Função para calcular o total do pedido
CREATE OR REPLACE FUNCTION CalcularTotalPedido (id_ped_solic NUMBER) 
    RETURN NUMBER IS
    v_total_ped NUMBER(8,2);
BEGIN
    SELECT SUM(valor_mus) INTO v_total_ped FROM item_ped ip 
    INNER JOIN pedido p ON ip.id_ped = p.id_ped
    INNER JOIN musica m ON ip.id_mus = m.id_mus
    WHERE ip.id_ped = id_ped_solic;

    UPDATE pedido
    SET total_ped = v_total_ped
    WHERE id_ped = id_ped_solic;

    COMMIT;

    RETURN v_total_ped;
END;

DECLARE
    id_ped_solic NUMBER(3) := &id_pedido;
BEGIN
    dbms_output.put_line(CalcularTotalPedido(id_ped_solic));
END;


--Procedimento para exibir os dados do pedido e suas músicas
CREATE OR REPLACE PROCEDURE ExibirDadosPedido (id_ped_solic NUMBER) 
IS
    CURSOR c_exibe IS SELECT * 
                        FROM item_ped ip
                        INNER JOIN pedido p ON ip.id_ped = p.id_ped 
                        INNER JOIN musica m ON ip.id_mus = m.id_mus 
                        WHERE ip.id_ped = id_ped_solic;
    v_exibe c_exibe%rowtype;
    v_id_ped number(3);
    v_dt_ped date;
    v_total_ped number(8,2);
BEGIN
    SELECT id_ped, dt_ped, total_ped INTO v_id_ped, v_dt_ped, v_total_ped FROM pedido WHERE id_ped = id_ped_solic;
    dbms_output.put_line('Número do pedido: ' || v_id_ped);
    dbms_output.put_line('Data: ' || v_dt_ped);
    dbms_output.put_line('Total: ' || v_total_ped);
    dbms_output.put_line('Musicas:');
    FOR v_exibe IN c_exibe LOOP
        dbms_output.put_line('    Titulo música: ' || v_exibe.TIT_MUS || ' - Valor: ' || v_exibe.VALOR_MUS);
    END LOOP;    
END;

EXEC ExibirDadosPedido(2);


--Tabela para alimentar o gatilho
DROP TABLE controle_preco_musica CASCADE CONSTRAINTS;
CREATE TABLE controle_preco_musica (
    cod_mus NUMBER(3),
    valor_anterior NUMBER(4,2),
    valor_novo NUMBER(4,2)
);

--Gatilho para atualização de preço da música
CREATE OR REPLACE TRIGGER verifica_valor
BEFORE UPDATE OF valor_mus ON musica FOR EACH ROW
BEGIN
    INSERT INTO controle_preco_musica
    VALUES(:OLD.id_mus, :OLD.valor_mus, :NEW.valor_mus);
END;

UPDATE musica SET valor_mus = 19.10 WHERE id_mus = 1;
UPDATE musica SET valor_mus = 41.25 WHERE id_mus = 3;

SELECT * FROM controle_preco_musica;