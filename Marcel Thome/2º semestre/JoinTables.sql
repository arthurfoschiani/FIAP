CREATE TABLE produto1 (
    id INT PRIMARY KEY,
    nome VARCHAR(150)
);

CREATE TABLE produto2 (
    id INT PRIMARY KEY,
    nome VARCHAR(150)
);

INSERT INTO produto1 (id, nome) VALUES (1, 'Pneu');
INSERT INTO produto1 (id, nome) VALUES (2, 'Vidro');
INSERT INTO produto1 (id, nome) VALUES (3, 'Aspirador de pó');
INSERT INTO produto1 (id, nome) VALUES (4, 'Porta');
INSERT INTO produto1 (id, nome) VALUES (5, 'Água');

INSERT INTO produto2 (id, nome) VALUES (1, 'Vassoura');
INSERT INTO produto2 (id, nome) VALUES (2, 'Pneu');
INSERT INTO produto2 (id, nome) VALUES (3, 'Caneta');
INSERT INTO produto2 (id, nome) VALUES (4, 'Porta');
INSERT INTO produto2 (id, nome) VALUES (5, 'Água');

CREATE TABLE produto3 AS
SELECT nome FROM produto1
UNION
SELECT nome FROM produto2;

select * from produto3;

//Feito com função
CREATE TABLE produto4 (
    id INT PRIMARY KEY,
    nome VARCHAR(150)
);

declare
    cursor c_produto1 is select nome from produto1;
    cursor c_produto2 is select nome from produto2;
    v_produto1 c_produto1%rowtype;
    v_produto2 c_produto2%rowtype;
    v_contador NUMBER := 1;
    v_produto_exist number(5);
begin
    for v_produto1 in c_produto1 loop
        insert into produto4 values (v_contador, v_produto1.nome);
        v_contador := v_contador + 1;
    end loop;
    
    for v_produto2 in c_produto2 loop
        SELECT COUNT(*) INTO v_produto_exist FROM produto4 WHERE nome = v_produto2.nome;
        IF v_produto_exist = 0 THEN
            insert into produto4 values (v_contador, v_produto2.nome);
            v_contador := v_contador + 1;
        end if;
    end loop;
end;

select * from produto4;