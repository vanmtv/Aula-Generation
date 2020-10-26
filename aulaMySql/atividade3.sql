create database db_alunos_reg;
use db_alunos_reg;
-- criar tabela com 5 atributos
create table tb_alunos(
	id bigint auto_increment,
    nome_completo varchar(50) not null,
    matricula varchar(8) not null,
    nota decimal(10,2),
	curso varchar(30) not null,
    primary key(id)
);

insert into tb_alunos(nome_completo, matricula, nota, curso)
	values("Vanessa Silva", 19100191, 8.00, "ADS");
insert into tb_alunos(nome_completo, matricula, nota, curso)
	values("Leonardo Zuniga", 18100910, 9.90, "Educacao Fisica");
insert into tb_alunos(nome_completo, matricula, nota, curso)
	values("Beatriz Limeira", 20202110, 9.00, "Administracao");
insert into tb_alunos(nome_completo, matricula, nota, curso)
	values("Paulo Reis", 14106231, 7.00, "Logistica");
insert into tb_alunos(nome_completo, matricula, nota, curso)
	values("Paula Fernandes", 18401331, 4.00, "Letras");
insert into tb_alunos(nome_completo, matricula, nota, curso)
	values("Fernanda Goncalves", 19705421, 10.00, "ADS");
insert into tb_alunos(nome_completo, matricula, nota, curso)
	values("Roberto Luis", 17301451, 5.00, "Física");
insert into tb_alunos(nome_completo, matricula, nota, curso)
	values("Anne Rice", 12958200, 7.50, "Estudos Literarios");
    
select * from tb_alunos where nota>7.00;
select * from tb_alunos where nota<7.00;

update tb_alunos set nota = 6.50 where id = 4;

    