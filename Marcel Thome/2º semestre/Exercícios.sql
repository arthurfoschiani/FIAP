set serveroutput on
--Serve para visualizar os dados

set verify off
--Serve para mostrar o resultado direto

/*
EXERCICIO 01 – Criar um bloco PL-SQL para calcular o valor do novo
salário mínimo que deverá ser de 25% em cima do atual, que é de R$
???.
*/
declare
    v_salario number(8,2) := &valor;
    novo_sal v_salario%type := v_salario * 1.25;
begin
    dbms_output.put_line('Novo salário mínimo: '||novo_sal);
end;

/*
EXERCÍCIO 02 – Criar um bloco PL-SQL para calcular o valor em
REAIS de 45 dólares, sendo que o valor do câmbio a ser considerado
é de R$ ??? no qual estes valores deverão ser constantes dentro do
bloco.
*/
declare
    valor_dolar number(2) := 45;
    cotação_dolar number(4,2) := &cotacao;
    valor_real number(5,2) := valor_dolar * cotação_dolar;
begin
    dbms_output.put_line('O valor em real é de R$'||valor_real);
end;

/*
EXERCÍCIO 03 – Criar um bloco PL-SQL para converter em REAIS os
dólares informados, sendo que o valor do Câmbio a ser considerado é
de ????.
*/
declare
    valor_dolar number(7,2) := &valor_dolar;
    cotação_dolar number(4,2) := &cotacao;
    valor_real valor_dolar%type := valor_dolar * cotação_dolar;
begin
    dbms_output.put_line('O valor em real é de R$'||valor_real);
end;

/*
EXERCÍCIO 04 – Criar um bloco PL-SQL para calcular o valor das
parcelas de uma compra de um carro, nas seguintes condições:
OBSERVAÇÃO:
1 - Parcelas para aquisição em 10 pagamentos.
2 - O valor total dos juros é de 3% e deverá ser aplicado sobre o
montante financiado
3 – No final informar o valor de cada parcela.
*/
declare
    carro number(10,2) := &valor_carro;
    juros carro%type := carro * 1.03; 
    parcela carro%type := juros / 10;
begin
    dbms_output.put_line('VALOR PARCELAS  R$'||parcela);
end;

/*
EXERCÍCIO 05 – Criar um bloco PL-SQL para calcular o valor de cada
parcela de uma compra de um carro, nas seguintes condições:
- Parcelas para aquisição em 6 pagamentos.
- Parcelas para aquisição em 12 pagamentos.
- Parcelas para aquisição em 18 pagamentos.
OBSERVAÇÃO:
1 – Deverá ser dada uma entrada de 20% do valor da compra.
2 – Deverá ser aplicada uma taxa juros, no saldo restante, nas
seguintes condições:
3 – No final informar o valor das parcelas para as 3 formas de
pagamento, com o Valor de aquisição de 10.000.
A – Pagamento em 6 parcelas: 10%.
B – Pagamento em 12 parcelas: 15%.
C – Pagamento em 18 parcelas: 20%. 
*/
DECLARE
    valor_aquisicao NUMBER(10,2) := 10000;
    entrada NUMBER(10,2) := valor_aquisicao * 0.20;
    saldo NUMBER(10,2) := valor_aquisicao - entrada;
    
    juros_6   NUMBER(10,2) := saldo * 1.10;
    juros_12  NUMBER(10,2) := saldo * 1.15;
    juros_18  NUMBER(10,2) := saldo * 1.20;
    
    parcela_6  NUMBER(10,2) := juros_6 / 6;
    parcela_12 NUMBER(10,2) := juros_12 / 12;
    parcela_18 NUMBER(10,2) := juros_18 / 18;
    
    numero_parcelas number(3) := &num_parcelaS;
BEGIN
    DBMS_OUTPUT.PUT_LINE('VALOR DAS PARCELAS PARA AQUISIÇÃO DE ' || valor_aquisicao);
    IF numero_parcelas = 6 THEN
        DBMS_OUTPUT.PUT_LINE('6 Pagamentos:  ' || parcela_6);
    ELSIF numero_parcelas = 12 THEN
        DBMS_OUTPUT.PUT_LINE('12 Pagamentos: ' || parcela_12);
    ELSIF numero_parcelas = 18 THEN
        DBMS_OUTPUT.PUT_LINE('18 Pagamentos: ' || parcela_18);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Financiamento sem oferta.');
    END IF;
END;

/*
Execicio de If
*/
declare
    sexo char(1) := UPPER('&informe_seu_sexo');
begin
    if sexo = 'M' then
        dbms_output.put_line('Masculino');
    elsif sexo = 'F' then
        dbms_output.put_line('Feminino');
    else
        dbms_output.put_line('Outros');
    end if;
end;

/*
Execicio de Loop
*/
declare
    v_tabu number(3) := &tabuada;
    v_count number(2) := 0;
begin
    loop
        DBMS_OUTPUT.PUT_LINE(v_tabu || ' X ' || v_count || ' = ' || (v_tabu * v_count));
        v_count := v_count + 1;
        exit when v_count > 11;
    end loop;
end;

/*
Execicio de while
*/
declare
    v_tabu number(3) := &tabuada;
    v_count number(2) := 0;
begin
    while v_count <= 10 loop
        DBMS_OUTPUT.PUT_LINE(v_tabu || ' X ' || v_count || ' = ' || (v_tabu * v_count));
        v_count := v_count + 1;
    end loop;
end;

/*
Execicio de for
*/
declare
    v_tabu number(3) := &tabuada;
begin
    for v_count in 0..10 loop
        DBMS_OUTPUT.PUT_LINE(v_tabu || ' X ' || v_count || ' = ' || (v_tabu * v_count));
    end loop;
end;

declare
    v_inicio number(3) := &inicio;
    v_fim number(3) := &fim;
    v_pares number(3) := 0;
    v_impares number(3) := 0;
begin
    for v_count in v_inicio..v_fim loop
        if mod(v_count, 2) = 0 then
            v_pares := v_pares + 1;
        else
            v_impares := v_impares + 1;
        end if;
    end loop;
    
    DBMS_OUTPUT.PUT_LINE('Quantidade de números pares: ' || v_pares);
    DBMS_OUTPUT.PUT_LINE('Quantidade de números ímpares: ' || v_impares);
end;

declare
    v_inicio number(3) := &inicio;
    v_fim number(3) := &fim;
    v_pares number(3) := 0;
    v_soma_impares number(5) := 0;
    v_quantidade_pares number(3) := 0;
    
    v_media_pares number(5, 2) := 0;
begin
    for v_count in v_inicio..v_fim loop
        if mod(v_count, 2) = 0 then
            v_pares := v_pares + v_count;
            v_quantidade_pares := v_quantidade_pares + 1;
        else
            v_soma_impares := v_soma_impares + v_count;
        end if;
    end loop;
    
    if v_quantidade_pares > 0 then
        v_media_pares := v_pares / v_quantidade_pares;
    end if;
    
    DBMS_OUTPUT.PUT_LINE('Média dos valores pares: ' || v_media_pares);
    DBMS_OUTPUT.PUT_LINE('Soma dos valores ímpares: ' || v_soma_impares);
end;

/*
Execicio de for-reverse
*/
declare
    v_tabu number(3) := &tabuada;
begin
    for v_count in reverse 0..10 loop
        DBMS_OUTPUT.PUT_LINE(v_tabu || ' X ' || v_count || ' = ' || (v_tabu * v_count));
    end loop;
end;