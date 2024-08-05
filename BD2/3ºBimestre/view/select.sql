USE db_EscolaIdiomas
GO


-----NOTA: O MOTIVO DO VALOR DA COLUNA 'VALOR DO CURSO' DA QUESTÃO 1 E 2, APARECER MUITO GRANDE, 
--É PORQUE QUANDO ELE APRESENTA ELE VEM SEM A ",".

---4)SELECT MAX ([Quantidade de alunos]) AS 'Quantidade de alunos' FROM vwAlunos_Turma

-----------VIEW---------


---1)-------------------------------------------
CREATE VIEW vwPrecoBaixo AS
	SELECT tbl_curso.codCurso AS 'Código'
	,nomeCurso AS 'Nome'
	,cargaHorariaCurso AS 'Carga Horária'
	,valorCurso AS 'Valor do Curso'
	FROM tbl_curso
			WHERE valorCurso < (SELECT AVG(valorCurso) FROM tbl_curso) 

---2)-------------------------------------------
	SELECT * FROM vwPrecoBaixo
		ORDER BY [Carga Horária]

---3)-------------------------------------------
	CREATE VIEW vwAlunos_Turma AS
		SELECT tbl_curso.nomeCurso AS 'Curso'
		,tbl_turma.nomeTurma AS 'Nome da Turma'
		,COUNT (tbl_aluno.codAluno) AS 'Quantidade de alunos'
	FROM tbl_curso

		INNER JOIN tbl_turma ON  tbl_curso.codCurso = tbl_turma.codCurso
			INNER JOIN tbl_matricula ON tbl_turma.codTurma = tbl_matricula.codTurma
				INNER JOIN tbl_aluno ON tbl_matricula.codAluno = tbl_aluno.codAluno
	
	GROUP BY nomeCurso, nomeTurma
	
---4)-------------------------------------------
	
	SELECT * FROM vwAlunos_Turma
		WHERE [Quantidade de alunos] IN (SELECT MAX ([Quantidade de alunos]) AS 'Quantidade de alunos' FROM vwAlunos_Turma)
---5)-------------------------------------------
	CREATE VIEW vwTurma_Curso AS
		SELECT tbl_curso.nomeCurso AS 'Curso'
		,COUNT (tbl_turma.codTurma) AS 'Quantidade de turmas'
	FROM tbl_curso

		INNER JOIN tbl_turma ON  tbl_curso.codCurso = tbl_turma.codCurso

	GROUP BY nomeCurso

---6)-------------------------------------------

	SELECT * FROM vwTurma_Curso
		WHERE [Quantidade de turmas] IN (SELECT MIN ([Quantidade de turmas]) AS 'Quantidade de turmas' FROM vwTurma_Curso)


-------------DROP-------------------------------
DROP VIEW vwPrecoBaixo
DROP VIEW vwAlunos_Turma
DROP VIEW vwTurma_Curso
