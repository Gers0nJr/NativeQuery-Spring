CREATE TABLE nativequery.PESSOA (
  id_pessoa   integer,
  nome        varchar(20),
  cpf         varchar(14),
  data_nasc   date,
  id_curso    integer
);

CREATE TABLE nativequery.CURSO
(
  id_curso   integer,
  nome       varchar(20),
  id_mensalidade integer
);

CREATE TABLE nativequery.MENSALIDADE
(
  id_mensalidade integer,
  valor          double 
);