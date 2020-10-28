create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
	id_cat bigint auto_increment,
    descricao varchar(255) not null, 
    ativo boolean not null,
    primary key(id_cat)
);

create table tb_produto(
	id_prod bigint auto_increment,
    nome varchar(255) not null,
    preco decimal(5,2) not null,
    quantidade int not null,
	marca varchar(255),
    id_cat bigint not null,
    primary key(id_prod),
    foreign key(id_cat) references tb_categoria(id_cat)
);

-- popular categoria com até 5 dados
insert into tb_categoria(descricao, ativo) 
	values ("Pisos e Revestimentos", true);
insert into tb_categoria(descricao, ativo) 
	values ("Área externa", true);
insert into tb_categoria(descricao, ativo) 
	values ("Portas e janelas", true);
insert into tb_categoria(descricao, ativo) 
	values ("Hidraulica", true);
insert into tb_categoria(descricao, ativo) 
	values ("Materiais de construçao", true);
select * from tb_categoria;

-- popular produto com até 8 dados
insert into tb_produto(nome, quantidade, preco, id_cat) 
	values ("Pastilhas de vidro", 800 , 37.90, 1);
insert into tb_produto(nome, quantidade, preco, id_cat) 
	values ("Piso de Madeira 50x50", 800 , 19.90, 1);
insert into tb_produto(nome, quantidade, preco, id_cat) 
	values ("Piscina 1215L", 30, 369.90, 2);
insert into tb_produto(nome, quantidade, preco, id_cat) 
	values ("Folha de porta de madeira", 90, 149.90, 3);
insert into tb_produto(nome, quantidade, preco, id_cat) 
	values ("Janela de correr 4 fls", 30, 299.90, 3);
insert into tb_produto(nome, quantidade, preco, id_cat) 
	values ("Caixa dagua 500L", 30, 199.90, 4);
insert into tb_produto(nome, quantidade, preco, id_cat) 
	values ("Tijolinho ensacado", 2500, 4.79, 5);
insert into tb_produto(nome, quantidade, preco, id_cat) 
	values ("Bloco de cimento", 2000, 2.09, 5);
    
select *from tb_produto where preco>50;
select *from tb_produto where preco between 3 and 60;
select*from tb_produto where nome like "%ci";

-- Faça um um select com Inner join entre tabela categoria e produto.
select tb_produto.nome, tb_produto.preco, tb_categoria.descricao
	from tb_produto
		inner join tb_categoria 
        on tb_categoria.id_cat = tb_produto.id_cat;
        
-- Faça um select onde traga todos os Produtos de uma categoria específica
select tb_produto.nome, tb_produto.preco, tb_categoria.descricao
	from tb_produto
		inner join tb_categoria 
        on tb_categoria.id_cat = tb_produto.id_cat
			where tb_categoria.descricao = "Pisos e Revestimentos";