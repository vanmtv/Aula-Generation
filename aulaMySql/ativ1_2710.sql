create database db_RH2;
use db_RH2;
-- criar tabela cargo
create table tb_cargo(
	cargo_id bigint auto_increment,
	nomeCargo varchar(20) not null,
    departamento varchar(20) not null,
    primary key(cargo_id)
);

-- criar table funcionario
create table tb_funcionario(
	func_id bigint auto_increment,
    nome varchar(30),
    matricula bigint,
    salario decimal(10,2),
    cargo_id bigint not null, -- referencia da foreign key
    idade bigint,
    primary key(func_id),
    foreign key(cargo_id) references tb_cargo(cargo_id)
);

-- popular 5 dados em tb_cargo
insert into tb_cargo(nomeCargo, departamento) 
	values("Analista Java Jr","TI");
insert into tb_cargo(nomeCargo, departamento) 
	values("Analista QA Sr","TI");
insert into tb_cargo(nomeCargo, departamento) 
	values("Gerente","Vendas");
insert into tb_cargo(nomeCargo, departamento)
	values("Atendente","Vendas");
insert into tb_cargo(nomeCargo, departamento)
	values("Diretor", "TI");

-- popular 15 dados em tb_funcionario
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("João da Silva", 1010, 2500.00, 4);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Maria Pereira", 1910, 4000.00, 3);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Luis Pereira", 1920, 3000.00, 2);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Victor Emanuel", 1821, 3500.00, 4);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Manuel Barraca", 8980, 4500.00, 3);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Estelar Vulcan", 2120, 9000.00, 5);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Rachel Green", 5689, 3000.00, 4);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Chandler", 4040, 7800.00, 2);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Ross Geller", 2727, 4852.75, 3);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Jose Caputti", 2412, 3500.00, 1);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Josefina Caputti", 2422, 4500.00, 2);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Josiel Oliveira", 3512, 2800.00, 4);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Maria Salvatori", 3714, 9000.00, 5);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Hello World", 4687, 5020.00, 1);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Vanessa Hudgens", 1906, 4500.00,1);
    
-- filtrar funcionario com salario > 2000
select * from tb_funcionario where salario>2000.00;

-- filtrar funcionarios com salario entre 1000 e 2000
select * from tb_funcionario where salario>1000 and salario<2000;

-- buscar funcionario que iniciem com a letra C 
select * from tb_funcionario where nome like "c%";