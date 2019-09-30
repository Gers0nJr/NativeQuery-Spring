select * from nativequery.pessoa;
select * from nativequery.curso;
select * from nativequery.mensalidade;

-----------------------------------------------------------------------------------------------

select p.nome,
       p.cpf,
       c.nome as curso,
       m.valor as mensalidade
    from nativequery.pessoa p, nativequery.curso c, nativequery.mensalidade m
where 
    p.id_curso = c.id_curso 
and c.id_mensalidade = m.id_mensalidade
and p.id_curso = 1
and p.data_nasc = "1980-04-06";

-----------------------------------------------------------------------------------------------

SELECT * FROM nativequery.pessoa WHERE DAY(data_nasc) = '06';
SELECT * FROM nativequery.pessoa WHERE MONTH(data_nasc) = '04';
SELECT * FROM nativequery.pessoa WHERE YEAR(data_nasc) = '1980';

-----------------------------------------------------------------------------------------------
Primeiro e ultimo dia do mês em mysql

SELECT
    ADDDATE(LAST_DAY(SUBDATE(CURDATE(), INTERVAL 1 MONTH)), 1) AS primeiro_dia,
    last_day(sysdate()) as ultimo_di
FROM 
	nativequery.pessoa;

-----------------------------------------------------------------------------------------------
Usando o between em mysql

p.data_nasc BETWEEN "1980-04-06" and last_day(sysdate());
    