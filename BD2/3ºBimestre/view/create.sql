CREATE DATABASE db_EscolaIdiomas
USE db_EscolaIdiomas
GO
 
CREATE TABLE tbl_aluno(
    codAluno INT PRIMARY KEY IDENTITY(1,1),
    nomeAluno VARCHAR(250) NOT NULL,
    dataNascAluno DATE NOT NULL,
    rgAluno CHAR(9) NOT NULL,
    naturalidadeAluno CHAR(2)
)
 
CREATE TABLE tbl_curso(
    codCurso INT PRIMARY KEY IDENTITY(1,1),
    nomeCurso VARCHAR(10) NOT NULL,
    cargaHorariaCurso INT NOT NULL,
    valorCurso MONEY NOT NULL
)
 
CREATE TABLE tbl_turma(
    codTurma INT PRIMARY KEY IDENTITY(1,1),
    nomeTurma VARCHAR (10) NOT NULL,
    horarioTurma TIME NOT NULL,
    codCurso INT FOREIGN KEY REFERENCES tbl_curso(codCurso)
)
 
CREATE TABLE tbl_matricula(
    codMatricula INT PRIMARY KEY IDENTITY(1,1),
    dataMatricula DATE NOT NULL,
    codAluno INT FOREIGN KEY REFERENCES tbl_aluno(codAluno),
    codTurma INT FOREIGN KEY REFERENCES tbl_turma(codTurma)
)
 

-------------------------DROP----------------------------
DROP TABLE tbl_matricula
DROP TABLE tbl_turma
DROP TABLE tbl_curso
DROP TABLE tbl_aluno


