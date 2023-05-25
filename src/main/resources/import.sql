-- populando o banco de dados para categoria
insert into categoria (categoria) values('ração');
insert into categoria (categoria) values('acessorio');
insert into categoria (categoria) values('remedio');
insert into categoria (categoria) values('roupas');

-- populando o banco de dados para produtos
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('0','Ração para gatos', '16.0', '100','1');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('1','Ração para gatos castrados', '15.0','100','1');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('2','Ração para cães', '10.0', '150','1');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('3','Ração para cães castrados','12.0','200','1');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('4','Ração para cães filhotes','14.0','180','1');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('5','Ração para gatos filhotes','14.0','150','1');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('6','Ração para hamster', '16.50','50','1');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('7','Peitoral para cães', '25.0','30','2');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('8','Pote para água unitário','7.0','25','2');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('9','Pote para ração unitário', '5.0','50','2');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('10','Pote para ração e água','10.0', '15','2');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('11','Peitoral para gatos', '27.0','15','2');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('12','Coleira cães', '12.0','50','2');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('13','Coleira gatos', '13.00','50','2');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('14','Vermífugo cães e gatos', '16.50','50','3');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('15','Rémedio de pulga','18.0','5','3');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('16','Roupas para gatos P','22.0','10','4');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('17','Roupas para gatos M','24.0','10','4');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('18','Roupas para gatos G','26.0','10','4');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('19','Roupas para cães porte pequeno','22.0','10','4');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('20','Roupas para cães porte médio','30.0','10','4');
insert into produtos (codigoDoProduto, nomeDoProduto,valor,quantidade,categoria_id) values('21','Roupas para cães porte grande','35.0','10','4');