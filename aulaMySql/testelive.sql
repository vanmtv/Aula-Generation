create database db_servicos_rh;
use db_servicos_rh;
-- criar tabela funcionarios
create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(50) not null,
    cargo varchar(20) not null,
    ativo boolean,
    salario double not null,
    primary key(id)
);
-- popular tabela com 5 dados
insert into tb_funcionarios (nome, cargo, salario) 
	values("Vanessa", "desenvolvedora java", 2500.00);
insert into tb_funcionarios (nome, cargo, salario) 
	values("Estela", "dev python", 3400.00);
insert into tb_funcionarios(nome, cargo, salario)
	values("Maria", "desenvolvedora js", 4020.00);
insert into tb_funcionarios(nome, cargo, salario)
	values("Romulo", "estagiario em dev", 1500.00);
insert into tb_funcionarios(nome, cargo, salario)
	values("Cerberus", "assistente em dev", 1780.00);

-- select retorne funcionarios com salario > 2000
	select * from tb_funcionarios where salario>2000;
-- select retorne funcionarios com salario < 2000   
	select * from tb_funcionarios where salario < 2000;
    
-- atualize um dado desta tabela
update tb_funcionarios set cargo = "dev java", salario = 2500.00 where id=5;