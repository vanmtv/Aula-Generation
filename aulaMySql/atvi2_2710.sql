create database db_ecommerce;
use db_ecommerce;

-- criar tabela categoria

create table tb_categoria(
	cat_id bigint auto_increment,
    nome_cat varchar(20) not null,
    primary key(cat_id)
);
-- criar tabela produto
create table tb_produto(
	prod_id bigint auto_increment,
    nome_prod varchar(30),
    fabricante varchar(30),
    preco decimal(10,2),
    retirada boolean,
    frete decimal(10,2),
    cat_id bigint not null,
    primary key(prod_id),
    foreign key(cat_id) references tb_categoria(cat_id)
);
-- popular categoria
insert into tb_categoria(nome_cat)
	values("Automotivo");
insert into tb_categoria(nome_cat)
	values("Brinquedos e Jogos");
insert into tb_categoria(nome_cat)
	values("Celulares");
insert into tb_categoria(nome_cat)
	values("Informática");
insert into tb_categoria(nome_cat)
	values("Esportes e Lazer");

select * from tb_produto;

insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Pneu", "Firestone", 599.00, false, 1);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Kit Pneu Quadriciclo", "Arisun", 1166.90, false, 1);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Capacete R8 Tam58", "Pro Tork", 101.90, true, 1);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Blocos Educativos", "Merco Toys", 29.90, false, 2);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Lego Classic Mala", "Lego", 144.42, true, 2);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Jogo War", "Grow", 135.44, true, 2);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("RedMi Note 9", "Xiaomi", 1510.00, false, 3);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Q20", "Positivo", 1049.00, true, 3);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("iPhone 11 64GB", "Apple", 7199.00, false, 3);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Notebook ASPIRE 3", "Acer", 2231.47, true, 4);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Notebook Inspiron", "Dell", 3899.99, true, 4);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Gabinete Gamer", "Razer", 1799.60, false, 4);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Bicicleta GTX", "BMX", 999.00, true, 5);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Patinete Eletrico", "Atrio", 1354.16, true, 5);
insert into tb_produto(nome_prod, fabricante, preco, retirada, cat_id)
	values("Skate Longboard", "Urban Sand", 237.91, false, 5);
    
select * from tb_produto where preco>2000;
select * from tb_produto where preco>1000 and preco<2000;
select * from tb_produto where nome_prod like "c%";