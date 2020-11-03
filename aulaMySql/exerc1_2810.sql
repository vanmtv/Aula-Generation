-- criar bd
create database db_cidade_das_carnes_veg;

use db_cidade_das_carnes_veg;

create table tb_categoria(
	id bigint auto_increment,
    descricao varchar(255) not null, 
    fabrica varchar(255),
    ativo boolean not null,
    primary key(id)
);
-- adicionar categorias
insert into tb_categoria(descricao, ativo) 
	values ("Proteina de ervilha", true);
insert into tb_categoria(descricao, ativo) 
	values ("Proteina de soja", true);
insert into tb_categoria(descricao, ativo) 
	values ("Proteina de plantas", true);
insert into tb_categoria(descricao, ativo) 
	values ("Proteina de arroz", true);
insert into tb_categoria(descricao, ativo) 
	values ("Embutidos", true);
insert into tb_categoria(descricao, ativo) 
	values ("Outros", true);

-- criar tabela produtos
create table tb_produto(
	prod_id bigint auto_increment,
    nome varchar(255) not null,
    preco decimal(10,2) not null,
    quantidade int not null,
    id bigint not null, -- id foreign key
    primary key(prod_id),
    foreign key(id) references tb_categoria(id)
);

insert into tb_produto(nome, quantidade, preco, id) 
	values ("Hamburguer de ervilha", 40, 1.99, 1);
insert into tb_produto(nome, quantidade, preco, id)
	values("Vrango de ervilha", 50, 3.99, 1);
insert into tb_produto(nome, quantidade, preco, id)
	values("Fatias de soja", 90, 1.99, 2);
insert into tb_produto(nome, quantidade, preco, id)
	values("Hamburguer de soja",70, 4.99, 2);
insert into tb_produto(nome, quantidade, preco, id)
	values("The new chicken 2.0", 40, 19.99, 3);
insert into tb_produto(nome, quantidade, preco, id)
	values("Hamburguer do futuro", 100, 14.99, 3);
insert into tb_produto(nome, quantidade, preco, id)
	values ("Calabresa", 80, 5.00, 5);
insert into tb_produto(nome, quantidade, preco, id)
	values("Maionese NotMayo",30, 6.79, 6);

select *from tb_produto where preco>50;
select *from tb_produto where preco>3 and preco<60;
select*from tb_produto where nome like "%co";

-- Faça um um select com Inner join entre tabela categoria e produto.
select tb_produto.nome, tb_produto.preco, tb_categoria.descricao
	from tb_produto
		inner join tb_categoria 
        on tb_categoria.id = tb_produto.id;
        
-- Faça um select onde traga todos os Produtos de uma categoria específica
select tb_produto.nome, tb_produto.preco, tb_categoria.descricao
	from tb_produto
		inner join tb_categoria 	
        on tb_categoria.id = tb_produto.id
			where tb_categoria.descricao = "Proteina de plantas";