CREATE DATABASE bdEtecTurmas

USE bdEtecTurmas
GO

-------------------------CRATE_DATABASE-------------------------
CREATE TABLE tb2A(
	RM INT PRIMARY KEY
	,nomeAluno VARCHAR(100) NOT NULL
	,statusAluno VARCHAR(10) NOT NULL
)

--------------------------------------------------
CREATE TABLE tb2B(
	RM INT PRIMARY KEY
	,nomeAluno VARCHAR(100) NOT NULL
	,statusAluno VARCHAR(10) NOT NULL
)

-------------------------DROP-------------------------
DROP TABLE tb2A
DROP TABLE tb2B
