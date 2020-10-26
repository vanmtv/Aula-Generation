-- create database db_ecommerce;
use db_ecommerce;
-- criar tabela produtos com 5 atributos
create table tb_ecomprodutos(
	id bigint auto_increment,
    nome varchar(50) not null,
    preco decimal(10,2),
    marca varchar(30) not null,
    disponivel boolean,
    primary key(id)
);

insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("Pocophone F1", 1500.00, "Xiaomi", true);
    
insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("Iphone 10", 15000.00, "Iphone", true);

insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("S10", 10000.00, "Samsung", true);

insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("Capa Iphone 10", 100.00, "Iphone cases", true);

insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("Capa Iphone 8", 70.00, "Iphone China", false);

insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("Mi9", 3000.00, "Xiaomi", false);
    
insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("Red Mi", 2000.00, "Xiaomi", true);

insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("Ipad", 6000.00, "Iphone", true);

insert into tb_ecomprodutos(nome, preco, marca, disponivel)
	values("M7S", 299.00, "Multilaser", false);
    
select * from tb_ecomprodutos where preco>500.00;

select * from tb_ecomprodutos where preco<500.00;

update tb_ecomprodutos set disponivel = false where id = 3;