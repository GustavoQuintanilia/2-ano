CREATE DATABASE tbTransito
USE tbTransito
GO

CREATE TABLE tbMotorista(
	idMotorista INT PRIMARY KEY IDENTITY(1,1) NOT NULL
	,nomeMotorista VARCHAR(50) NOT NULL
	,dataNascimentoMotorista DATE NOT NULL
	,cpfMotorista VARCHAR(14) NOT NULL
	,CNHMotorista VARCHAR(14) NOT NULL
	,pontuacaoAcumulada INT
) 

CREATE TABLE tbVeiculo(
	idVeiculo INT PRIMARY KEY IDENTITY(1,1)
	,modeloVeiculo VARCHAR(50) NOT NULL
	,placa VARCHAR(14) NOT NULL
	,renavam INT 
	,anoVeiculo INT
	,idMotorista INT FOREIGN KEY (idMotorista) REFERENCES tbMotorista (idMotorista)
)

CREATE TABLE tbMultas(
	idMulta INT PRIMARY KEY IDENTITY(1,1)
	,dataMulta DATE NOT NULL
	,horaMulta TIME (0) NOT NULL
	,pontosMulta INT 
	,idVeiculo INT FOREIGN KEY (idVeiculo) REFERENCES tbVeiculo (idVeiculo)
)

-------------------------------------

DROP TABLE tbMultas
DROP TABLE tbVeiculo
DROP TABLE tbMotorista
