CREATE DATABASE bdTransito
USE bdTransito
GO

------------------------------CREATE TABLE--------------------------------------
--------------------------------------------------------------------
CREATE TABLE tbMotorista(
	idMotorista INT PRIMARY KEY IDENTITY(1,1)
	,nomeMotorista VARCHAR(100) NOT NULL
	,dataNascimentoMotorista DATE NOT NULL
	,cpfMotorista VARCHAR(14) NOT NULL
	,cnhMotorista VARCHAR(9) NOT NULL
	,pontuacaoAcumulada INT
)

--------------------------------------------------------------------
CREATE TABLE tbVeiculo(
	idVeiculo INT PRIMARY KEY IDENTITY(1,1)
	,modeloVeiculo VARCHAR(100) NOT NULL
	,placa VARCHAR(10) NOT NULL
	,renavam VARCHAR(11) NOT NULL
	,anoVeiculo DATE NOT NULL
	,idMotorista INT FOREIGN KEY (idMotorista) REFERENCES tbMotorista (idMotorista)
)

--------------------------------------------------------------------
CREATE TABLE tbMulta(
	idMulta INT PRIMARY KEY IDENTITY(1,1)
	,dataMulta DATE NOT NULL
	,horaMulta TIME NOT NULL
	,pontosMulta INT 
	,idVeiculo INT FOREIGN KEY (idVeiculo) REFERENCES tbVeiculo (idVeiculo)
)

---------------------------------DROP-----------------------------------
DROP TABLE tbMulta
DROP TABLE tbVeiculo
DROP TABLE tbMotorista