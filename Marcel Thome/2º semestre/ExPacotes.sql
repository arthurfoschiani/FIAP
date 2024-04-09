set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto

DROP TABLE aluno CASCADE CONSTRAINTS;
DROP TABLE historico CASCADE CONSTRAINTS;
DROP TABLE disciplina CASCADE CONSTRAINTS;
DROP TABLE historico_discplina CASCADE CONSTRAINTS;

CREATE TABLE aluno (
    rm varchar(5) primary key,
    nome varchar(30)
);

CREATE TABLE historico (
    id_historico number(4) primary key,
    situacao varchar(20),
    falta number(4),
    nota1 number(4,2),
    nota2 number(4,2),
    nota3 number(4,2),
    media number(4,2),
    rm_aluno varchar(5) references aluno
);

CREATE TABLE disciplina (
    id_disc number(4) primary key,
    nome_disc varchar(20),
    carga_hora varchar(6)
);

CREATE TABLE historico_discplina (
    id_historico number(5) references historico,
    id_disc number(5) references disciplina
);

INSERT INTO aluno (rm, nome) VALUES ('12345', 'João Silva');
INSERT INTO aluno (rm, nome) VALUES ('54321', 'Maria Oliveira');
INSERT INTO aluno (rm, nome) VALUES ('67890', 'Carlos Santos');
INSERT INTO aluno (rm, nome) VALUES ('98765', 'Ana Costa');
INSERT INTO aluno (rm, nome) VALUES ('45678', 'Pedro Lima');

INSERT INTO disciplina (id_disc, nome_disc, carga_hora) VALUES (1, 'Matemática', '60');
INSERT INTO disciplina (id_disc, nome_disc, carga_hora) VALUES (2, 'Português', '45');
INSERT INTO disciplina (id_disc, nome_disc, carga_hora) VALUES (3, 'História', '30');
INSERT INTO disciplina (id_disc, nome_disc, carga_hora) VALUES (4, 'Geografia', '30');
INSERT INTO disciplina (id_disc, nome_disc, carga_hora) VALUES (5, 'Ciências', '50');

INSERT INTO historico (id_historico, situacao, falta, nota1, nota2, nota3, media, rm_aluno)
VALUES (1, 'Em avaliação', 10, 8, 7, 9, NULL, '12345');
INSERT INTO historico (id_historico, situacao, falta, nota1, nota2, nota3, media, rm_aluno)
VALUES (2, 'Em avaliação', 12, 6, 5, 7, NULL, '54321');
INSERT INTO historico (id_historico, situacao, falta, nota1, nota2, nota3, media, rm_aluno)
VALUES (3, 'Em avaliação', 5, 9, 8, 10, NULL, '67890');
INSERT INTO historico (id_historico, situacao, falta, nota1, nota2, nota3, media, rm_aluno)
VALUES (4, 'Em avaliação', 15, 7, 6, 8, NULL, '98765');
INSERT INTO historico (id_historico, situacao, falta, nota1, nota2, nota3, media, rm_aluno)
VALUES (5, 'Em avaliação', 20, 5, 4, 6, NULL, '45678');

INSERT INTO historico_discplina (id_historico, id_disc) VALUES (1, 1);
INSERT INTO historico_discplina (id_historico, id_disc) VALUES (2, 2);
INSERT INTO historico_discplina (id_historico, id_disc) VALUES (3, 3);
INSERT INTO historico_discplina (id_historico, id_disc) VALUES (4, 1);
INSERT INTO historico_discplina (id_historico, id_disc) VALUES (5, 2);
COMMIT;

CREATE OR REPLACE PACKAGE pkg_aluno AS
    FUNCTION calcular_media(nota1 NUMBER, nota2 NUMBER, nota3 NUMBER) RETURN NUMBER;
    PROCEDURE mostrar_situacao(p_rm_aluno VARCHAR2);
END pkg_aluno;

CREATE OR REPLACE PACKAGE BODY pkg_aluno AS
    FUNCTION calcular_media(nota1 NUMBER, nota2 NUMBER, nota3 NUMBER) RETURN NUMBER IS
    BEGIN
        RETURN (nota1 + nota2 + nota3) / 3;
    END calcular_media;
    
    PROCEDURE mostrar_situacao(p_rm_aluno VARCHAR2) IS
        v_media NUMBER;
        v_situacao VARCHAR2(10);
        v_faltas NUMBER;
        v_carga_horaria NUMBER;
        v_limite_faltas NUMBER;
    BEGIN
        FOR r IN (SELECT h.id_historico, h.nota1, h.nota2, h.nota3, h.falta, d.carga_hora, hd.id_disc
                  FROM historico h
                  JOIN historico_discplina hd ON h.id_historico = hd.id_historico
                  JOIN disciplina d ON hd.id_disc = d.id_disc
                  WHERE h.rm_aluno = p_rm_aluno)
        LOOP
            v_media := calcular_media(r.nota1, r.nota2, r.nota3);
            v_carga_horaria := TO_NUMBER(r.carga_hora);
            v_limite_faltas := v_carga_horaria * 0.25;
            IF v_media >= 7 AND r.falta <= v_limite_faltas THEN
                v_situacao := 'Aprovado';
            ELSE
                v_situacao := 'Reprovado';
            END IF;
            
            UPDATE historico SET media = v_media, situacao = v_situacao
            WHERE id_historico = r.id_historico;
            
            DBMS_OUTPUT.PUT_LINE('RM: ' || p_rm_aluno || ' - Disciplina: ' || r.id_disc || ' - Média: ' || v_media || ' - Situação: ' || v_situacao);
        END LOOP;
        COMMIT;
    END mostrar_situacao;
END pkg_aluno;

BEGIN
    pkg_aluno.mostrar_situacao('12345');
END;
