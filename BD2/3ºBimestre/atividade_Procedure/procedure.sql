USE db_EscolaIdiomas
GO

-----------------PROCEDURE----------------

--1) Criar uma stored procedure “Busca_Aluno” que receba o código do aluno e retorne seu
--nome e data de nascimento.

CREATE PROCEDURE spBusca_Aluno

	@codAluno INT

AS
	SELECT nomeAluno, dataNascAluno FROM tbl_aluno WHERE codAluno LIKE @codAluno  

--Mostrando Alunos
EXEC spBusca_Aluno '1'
EXEC spBusca_Aluno '5'
EXEC spBusca_Aluno '7'


--DROP-- 
DROP PROCEDURE spBusca_Aluno
		
--2) Criar uma stored procedure “Insere_Aluno” que insira um registro na tabela de Alunos.

CREATE PROCEDURE spInsere_Aluno

    @nomeAluno VARCHAR(250) 
    ,@dataNascAluno DATE
    ,@rgAluno CHAR(9)
    ,@naturalidadeAluno CHAR(2)

AS
	BEGIN
		INSERT INTO tbl_aluno (nomeAluno, dataNascAluno, rgAluno, naturalidadeAluno)
			VALUES(@nomeAluno, @dataNascAluno, @rgAluno, @naturalidadeAluno) 
		PRINT ('O aluno: '+@nomeAluno+' foi cadastrado com sucesso!')
	END

--SELECT
SELECT * FROM tbl_aluno

--INSERINDO ALUNOS

EXEC spInsere_Aluno 'Renan Augusto', '2005/10/15', '999555111', 'MG'
EXEC spInsere_Aluno 'Gustavo Lopez', '2004/03/01', '333999444', 'SP'
EXEC spInsere_Aluno 'Mouro da Silva', '2006/05/08', '111000555', 'RJ'

--
DROP PROCEDURE spInsere_Aluno 


--3) Criar uma stored procedure “Aumenta_Preco” que, dados o nome do curso e um percentual, 
--aumente o valor do curso com a porcentagem informada.
CREATE PROCEDURE spAumenta_Preco

	@nomeCurso VARCHAR(10)
	,@porcentAdicionado DECIMAL (5,2)

AS
	BEGIN 
		IF EXISTS(SELECT nomeCurso FROM tbl_curso WHERE nomeCurso = @nomeCurso)
		BEGIN	
				UPDATE[tbl_curso]
				SET valorCurso = valorCurso + (valorCurso * @porcentAdicionado/100)
				WHERE nomeCurso = @nomeCurso
				PRINT ('Porcentual  já foi somado ao preço selecionado.')
			
		END
		ELSE
		BEGIN

			PRINT ('Não é possível somar o valor a este curso! Este curso não existe.')
	    END
	END

--SELECT 
SELECT * FROM tbl_curso

--Adcionando ao preço

EXEC spAumenta_Preco 'Inglês', '5'
EXEC spAumenta_Preco 'Frances', '6'

--DROP 
DROP PROCEDURE spAumenta_Preco

--4) Criar uma stored procedure “Exibe_Turma” que, dado o nome da turma exiba todas as informações dela. (CONFERIR)
CREATE PROCEDURE spExibe_Turma

	@nomeTurma VARCHAR (10)

AS
	SELECT * FROM tbl_turma WHERE nomeTurma LIKE @nomeTurma  

--Mostrando informações da turma
EXEC spExibe_Turma '1IA'
EXEC spExibe_Turma '1IB'
EXEC spExibe_Turma '1AA'

--
DROP PROCEDURE spExibe_Turma

--5) Criar uma stored procedure “Exibe_AlunosdaTurma” que, dado o nome da turma exiba os seus alunos.
CREATE PROCEDURE spExibe_AlunosdaTurma

	@nomeTurma VARCHAR (10)

AS 

	SELECT nomeAluno FROM tbl_turma 
		INNER JOIN tbl_matricula ON tbl_turma.codTurma = tbl_matricula.codTurma 
			INNER JOIN tbl_aluno ON tbl_matricula.codAluno = tbl_aluno.codAluno
	WHERE nomeTurma LIKE @nomeTurma  

--Mostrando os nomes dos alunos 
EXEC spExibe_AlunosdaTurma '1EC'
EXEC spExibe_AlunosdaTurma '1IA'
EXEC spExibe_AlunosdaTurma '1AA'


--
DROP PROCEDURE spExibe_AlunosdaTurma

--6) Criar uma stored procedure para inserir alunos, verificando pelo cpf se o aluno 
--existe ou não, e informar essa condição via mensagem

CREATE PROCEDURE spVerificar_Alunos

	 @nomeAluno VARCHAR(250) 
    ,@dataNascAluno DATE
    ,@rgAluno CHAR(9)
    ,@naturalidadeAluno CHAR(2)
AS
	BEGIN
		IF EXISTS(SELECT rgAluno FROM tbl_aluno WHERE rgAluno LIKE @rgAluno)
		BEGIN 
			PRINT ('Não é possível cadastrar esse aluno! RG '+@rgAluno+' já existente.')
		END 
		ELSE
		BEGIN
				INSERT INTO tbl_aluno (nomeAluno, dataNascAluno, rgAluno, naturalidadeAluno)
					VALUES(@nomeAluno, @dataNascAluno, @rgAluno, @naturalidadeAluno) 
				PRINT ('O aluno: '+@nomeAluno+' não existia no sistema! Agora, foi cadastrado com sucesso!')
		END
	END

--SELECT 

SELECT * FROM tbl_aluno

--INSERINDO ALUNOS
EXEC spVerificar_Alunos 'Almeida Renato', '2003/12/10', '888777222', 'MG'
EXEC spVerificar_Alunos 'Vittor Sirqueira', '2002/02/02', '888777222', 'SP'


--
DROP PROCEDURE spVerificar_Alunos
	
--7) Criar uma stored procedure que receba o nome do curso e o nome do aluno e 
--matricule o mesmo no curso pretendido
CREATE PROCEDURE spAluno_Matricule
	@nomeAluno VARCHAR(250)
	,@nomeCurso VARCHAR(10)
AS
	BEGIN

		DECLARE @codAluno INT
		DECLARE @codCurso INT
		DECLARE @codTurma INT

		BEGIN 
			IF EXISTS(SELECT codAluno FROM tbl_aluno WHERE codAluno LIKE @codAluno)
			BEGIN 
					PRINT ('O aluno: '+@codAluno+' já existi no sistema!')
			END 
			ELSE
			BEGIN
					INSERT INTO tbl_aluno (nomeAluno, dataNascAluno, rgAluno, naturalidadeAluno) VALUES 
							  (@nomeAluno, '2000/05/17','899788566', 'ES')
					SELECT @codAluno = SCOPE_IDENTITY()
			END

				SELECT @codCurso = codCurso FROM tbl_curso WHERE nomeCurso = @nomeCurso
				PRINT ('O curso existe no sistema! Sua matrícula será realizada nele.')
				IF(@codCurso IS NULL)
				BEGIN
						PRINT ('Não foi possível realizar a matrícula! O curso não existe no sistema!')
				END
	
					SELECT TOP 1 @codTurma = codTurma FROM tbl_turma WHERE codCurso = @codCurso
					PRINT ('Este curso tem uma turma disponível no sistema! Sua matrícula será realizada nela.')
					IF (@codTurma IS NULL)
					BEGIN
						PRINT ('Não foi possível realizar a matrícula! Não foi encontradauma turma para este curso no sistema!')
					END

		END

		INSERT INTO tbl_matricula (dataMatricula, codAluno, codTurma) VALUES 
								(GETDATE(), @codAluno, @codTurma)
		PRINT ('A Matrícula foi realizada com sucesso! Se prepare para começar os estudos!')

	END

---------
	SELECT * FROM tbl_aluno
	SELECT * FROM tbl_matricula

--------
EXEC spAluno_Matricule 'Gustavo Brayan', 'Espanhol'


-------------
DROP PROCEDURE spAluno_Matricule


