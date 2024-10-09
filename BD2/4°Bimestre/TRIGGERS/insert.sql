USE bdEstoque
GO

------------------------------INSERT--------------------------------------

---------INSERT - tbFornecedor---------
INSERT INTO tbFornecedor(nomeFornecedor,contatoFornecedor) 
VALUES
	('Atacadão','Carlos Santos')
	,('Assai','Maria Stella')
	,('Roldão','Paulo César')

---------INSERT - tbFabricante---------
INSERT INTO tbFabricante(nomeFabricante) 
VALUES
	('Unilever')
	,('P&G')
	,('Bunge')

---------INSERT - tbCliente---------
INSERT INTO tbCliente(nomeCliente, cpfCliente, emailCliente, sexoCliente, dataNascCliente) 
VALUES
	('Amando José Santana','12345678900','armandojsantana@outlook.com','m','1961-02-21')
	,('Sheila Carvalho Leal','45678909823','scarvalho@ig.com.br','f','1978-09-13')
	,('Carlos Henrique Souza','76598278299','chenrique@ig.com.br','m','1981-09-08')
	,('Maria Aparecida Souza','87365309388','mapdasouza@outlook.com','f','1962-07-07')
	,('Adriana Nogueira Silva','7635430988','drica1977@ig.com.br','f','1977-04-09')
	,('Paulo Henrique Silva', '87390123111','phsilva@hotmail,com','m','1987-02-02')

---------INSERT - tbVenda---------
INSERT INTO tbVenda(dataVenda, valorTotalVenda, codCliente)
VALUES
	('01/02/2014',4500.00, 1)
	,('03/02/2014',3400.00,1)
	,('10/02/2014',2100.00,2)
	,('15/02/2014',2700.00,3)
	,('17/03/2014',560.00,3)
	,('09/04/2014',1200.00,4)
	,('15/08/2014',100.00,3)
	,('07/05/2014',3500.00,5)
	,('07/05/2014',3400.00,1)
	,('05/05/2014',4000.00,2)

---------INSERT - tbProduto---------
INSERT INTO tbProduto(descricaoProduto,valorProduto,quantidadeProduto,codFabricante,codFornecedor) 
VALUES
	('Amaciante Downy',5.76,1500,2,1)
	,('Amaciante Comfort',5.45,2300,1,1)
	,('Sabão em pó OMO',5.99,1280,1,2)
	,('Margarina Qually',4.76,2500,3,1)
	,('Salsicha Hot Dog Sadia',6.78,2900,3,2)
	,('Mortadela Perdigão', 2.50, 1200, 3,3)
	,('Hamburger Sadia',9.89,1600,3,1)
	,('Fralda Pampers',36.00,340,2,3)
	,('Xampu Seda',5.89,800,1,2)
	,('Condicionador',6.50,700,1,3)

---------INSERT - tbItensVenda---------
INSERT INTO tbItensVenda(codVenda,codProduto,quantidadeItensVenda,subTotalItensVenda) 
VALUES
	(1,1,200,1500.00)
	,(1,2,300,3000.00)
	,(2,4,120,1400.00)
	,(2,2,200,1000.00)
	,(2,3,130,1000.00)
	,(3,5,200,2100.00)
	,(4,4,120,1000.00)
	,(4,5,450,700.00)
	,(5,5,200,560.00)
	,(6,7,200,600.00)
	,(6,6,300,600.00)
	,(8,1,300,2500.00)
	,(8,2,200,1000.00)
	,(9,6,250,1700.00)
	,(9,5,200,1700.00)
	,(10,4,1000,4000.00)


---------INSERT - tbSaidaProduto---------
INSERT INTO tbSaidaProduto(dataSaidaProduto, codProduto, quantidadeSaidaProduto) 
VALUES
('11/11/2015', 10, 7)
,('04/09/2015', 4, 3)
,('01/05/2015', 6, 4)
,('21/12/2015', 5, 5)	
,('01/06/2015', 8, 2)
,('02/03/2015', 1, 3)

---------INSERT - tbEntradaProduto---------
INSERT INTO tbEntradaProduto(dataEntradaProduto, codProduto, quantidadeEntradaProduto) 
VALUES
('22/10/2013', 10, 20)
,('21/12/2013', 4, 15)
,('03/06/2013', 6, 10)
,('13/08/2013', 5, 15)	
,('11/02/2013', 8, 20)
,('15/04/2013', 1, 13)

