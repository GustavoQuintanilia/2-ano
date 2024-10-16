CREATE DATABASE bdContaCorrente
USE bdContaCorrente
GO

------------------------------CREATE TABLE--------------------------------------
--------------------------------------------------------------------
CREATE TABLE tbCliente(
	codCliente INT PRIMARY KEY IDENTITY(1,1)
	,nomeCliente VARCHAR(100) NOT NULL
	,cpfCliente VARCHAR(14) NOT NULL

)

--------------------------------------------------------------------
CREATE TABLE tbContaCorrente(
	numConta INT PRIMARY KEY IDENTITY(1,1)
	,saldoConta MONEY NOT NULL
	,codCliente INT FOREIGN KEY (codCliente) REFERENCES tbCliente (codCliente)
)

--------------------------------------------------------------------
CREATE TABLE tbDeposito(
	codDeposito INT PRIMARY KEY IDENTITY(1,1)
	,valorDeposito MONEY NOT NULL
	,numConta INT FOREIGN KEY (numConta) REFERENCES tbContaCorrente (numConta)
	,dataDeposito DATE NOT NULL
	,horaDeposito TIME NOT NULL
)

--------------------------------------------------------------------
CREATE TABLE tbSaque(
	codSaque INT PRIMARY KEY IDENTITY(1,1)
	,valorSaque MONEY NOT NULL
	,numConta INT FOREIGN KEY (numConta) REFERENCES tbContaCorrente (numConta)
	,dataSaque DATE NOT NULL
	,horaSaque TIME NOT NULL
)

----------------------------------DROP----------------------------------
DROP TABLE tbSaque
DROP TABLE tbDeposito
DROP TABLE tbContaCorrente
DROP TABLE tbCliente


