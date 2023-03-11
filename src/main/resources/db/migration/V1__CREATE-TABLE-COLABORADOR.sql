CREATE TABLE colaborador(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null,
    gestor varchar(100) not null,
    setor varchar(100) not null,
    humor varchar(100) not null,

    primary key (id)
);