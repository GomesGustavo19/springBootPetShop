-- populando o banco de dados para categoria
insert into categoria (categoria) values('ração');
insert into categoria (categoria) values('acessorio');
insert into categoria (categoria) values('remedio');
insert into categoria (categoria) values('roupas');

-- populando o banco de dados para produtos
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Ração para gatos', '16.0', '100','1');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Ração para gatos castrados', '15.0','100','1');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Ração para cães', '10.0', '150','1');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Ração para cães castrados','12.0','200','1');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Ração para cães filhotes','14.0','180','1');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Ração para gatos filhotes','14.0','150','1');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Ração para hamster', '16.50','50','1');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Peitoral para cães', '25.0','30','2');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Pote para água unitário','7.0','25','2');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Pote para ração unitário', '5.0','50','2');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Pote para ração e água','10.0', '15','2');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Peitoral para gatos', '27.0','15','2');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Coleira cães', '12.0','50','2');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Coleira gatos', '13.00','50','2');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Vermífugo cães e gatos', '16.50','50','3');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Rémedio de pulga','18.0','5','3');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Roupas para gatos P','22.0','10','4');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Roupas para gatos M','24.0','10','4');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Roupas para gatos G','26.0','10','4');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Roupas para cães porte pequeno','22.0','10','4');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Roupas para cães porte médio','30.0','10','4');
insert into produtos (nomeDoProduto,valor,quantidade,categoria_id) values('Roupas para cães porte grande','35.0','10','4');