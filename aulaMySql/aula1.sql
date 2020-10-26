-- criar banco de dados
create database db_estoque;
use db_estoque;
-- criar tabela de marcas
create table tb_marcas(
	id bigint(5) auto_increment,
    nome varchar(20) not null,
    ativo boolean,
    primary key(id)
);
select * from tb_marcas;
-- inserir marcas
insert into tb_marcas(nome, ativo) 
values("Nike", true);
insert into tb_marcas(nome, ativo)
values("Fatal Surf", false);

update tb_marcas set nome = "Adidas", ativo = true where id=3;
update tb_marcas set nome="Fatal Surf", ativo = true where id=2;

select * from tb_marcas where id<>2; -- visualizar id's diferentes de 2

select nome, ativo from tb_marcas where id=2;

delete from tb_marcas where id=1;

select * from tb_marcas where nome like "%Ad%";

-- criar tabela de produtos
create table tb_produtos (
	id bigint auto_increment,
    nome varchar(20) not null,
    preco decimal(10,2),
    marca_id bigint not null,
    primary key(id),
    foreign key(marca_id) references tb_marcas(id)
);

insert into tb_produtos(nome, preco, marca_id)
	values("Camisa", 22.99, 2);
insert into tb_produtos(nome, preco, marca_id)
	values("Tênis", 99.99, 3);    
select * from tb_produtos where nome="camisa";
select * from tb_produtos where preco>60;