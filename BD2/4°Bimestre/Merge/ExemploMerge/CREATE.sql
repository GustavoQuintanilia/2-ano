CREATE DATABASE bdRedeLojas

USE bdRedeLojas
GO

--------------------CREATE_TABLE----------------------------

CREATE TABLE tbProdutoLj1(
	idProduto INT PRIMARY KEY
	,nomeProduto VARCHAR(100) NOT NULL
	,precoProduto MONEY NOT NULL
	,qtde VARCHAR (100) NOT NULL
)

--------------------CREATE_TABLE----------------------------

CREATE TABLE tbProdutoLj2(
	idProduto INT PRIMARY KEY
	,nomeProduto VARCHAR(100) NOT NULL
	,precoProduto MONEY NOT NULL
	,qtde VARCHAR (100) NOT NULL
)

--------------------CREATE_TABLE----------------------------

CREATE TABLE tbProduto(
	idProduto INT PRIMARY KEY
	,nomeProduto VARCHAR(100) NOT NULL
	,precoProduto MONEY NOT NULL
	,qtde VARCHAR (100) NOT NULL
)