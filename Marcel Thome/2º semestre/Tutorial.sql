set serveroutput on
--Serve para visualizar os dados

--Primeiro programa
begin 
    dbms_output.put_line('Bloco Ok!');
end;

--Trabalhando com vari�veis
declare
    v1 number(2) := 10;
    v2 v1%type := 10;
    re number(3) := v1 + v2;
begin
    dbms_output.put_line('Resultado: '||re);
end;

--Entrada de dados via teclado
declare
-- uso de variaveis de substitui��o
    v1 number(2) := &valor_1;
    v2 v1%type := &valor_2;
-- processamento
    re number(3) := v1 + v2;
begin
-- sa�da de dados
    dbms_output.put_line('Resultado: '||re);
end;

--Estrutura do if
declare
    valor number(2) := 15;
begin
    if mod(valor, 2) = 0 then
        dbms_output.put_line('O n�mero '||valor|| ' � par');
    else 
        dbms_output.put_line('O n�mero '||valor|| ' � impar');
    end if;
end;