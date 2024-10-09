CREATE DATABASE bdEstoque
USE bdEstoque
GO

------------------------------CREATE TABLE--------------------------------------
--------------------------------------------------------------------
CREATE TABLE tbFornecedor(
	codFornecedor INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,nomeFornecedor VARCHAR (1000) NOT NULL
	,contatoFornecedor VARCHAR (13) NOT NULL

)

--------------------------------------------------------------------
CREATE TABLE tbFabricante(
	codFabricante INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,nomeFabricante Varchar (1000) NOT NULL

)

--------------------------------------------------------------------
CREATE TABLE tbCliente(
	codCliente INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,nomeCliente VARCHAR (1000) NOT NULL
	,cpfCliente VARCHAR (15) NOT NULL
	,emailCliente VARCHAR (1000) NOT NULL
	,sexoCliente VARCHAR (1) NOT NULL
	,dataNascCliente DATE NOT NULL

)

--------------------------------------------------------------------
CREATE TABLE tbVenda(
	codVenda INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,dataVenda DATE NOT NULL
	,valorTotalVenda FLOAT NOT NULL
	,codCliente INT NOT NULL

)

--------------------------------------------------------------------
CREATE TABLE tbProduto(
	codProduto INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,descricaoProduto VARCHAR (1000) NOT NULL
	,valorProduto FLOAT NOT NULL
	,quantidadeProduto INT NOT NULL
	,codFabricante INT FOREIGN KEY (codFabricante) REFERENCES tbFabricante (codFabricante)
	,codFornecedor INT FOREIGN KEY (codFornecedor) REFERENCES tbFornecedor (codFornecedor)

)
--------------------------------------------------------------------
CREATE TABLE tbItensVenda(
	codItensVenda INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,codVenda INT FOREIGN KEY (codVenda) REFERENCES tbVenda (codVenda)
	,codProduto INT FOREIGN KEY (codProduto) REFERENCES tbProduto (codProduto)
	,quantidadeItensVenda INT 
	,subTotalItensVenda VARCHAR (100) NOT NULL

)
--------------------------------------------------------------------
CREATE TABLE tbSaidaProduto(
	codSaidaProduto INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,dataSaidaProduto DATE NOT NULL
	,codProduto INT FOREIGN KEY (codProduto) REFERENCES tbProduto (codProduto)
	,quantidadeSaidaProduto INT 	

)

--------------------------------------------------------------------
CREATE TABLE tbEntradaProduto(
	codEntrada INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,dataEntradaProduto DATE NOT NULL
	,codProduto INT FOREIGN KEY (codProduto) REFERENCES tbProduto (codProduto)
	,quantidadeEntradaProduto INT 	

)

-------------------------------DROP-------------------------------------
DROP TABLE tbEntradaProduto
DROP TABLE tbSaidaProduto
DROP TABLE tbItensVenda
DROP TABLE tbProduto
DROP TABLE tbVenda
DROP TABLE tbCliente
DROP TABLE tbFabricante
DROP TABLE tbFornecedor