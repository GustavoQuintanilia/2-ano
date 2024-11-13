USE bdEtecTurmas
GO

-------------------------MERGE-------------------------
CREATE TABLE tb3(
	RM INT PRIMARY KEY
	,nomeAluno VARCHAR(100) NOT NULL
	,statusAluno VARCHAR(10) NOT NULL
)

----------------MERGE----------------
---------------------------------
MERGE tb3 AS dest 
	USING(SELECT RM, nomeAluno, statusAluno FROM tb2A 
			WHERE statusAluno = 'Aprovado') ori ON ori.RM = dest.RM
	WHEN NOT MATCHED THEN 
			INSERT(RM, nomeAluno, statusAluno)
			VALUES(ori.RM, ori.nomeAluno, ori.statusAluno)
	WHEN MATCHED THEN
			UPDATE SET dest.nomeAluno = ori.nomeAluno, dest.statusAluno = ori.statusAluno;

---------------------------------
MERGE tb3 AS dest 
	USING(SELECT RM, nomeAluno, statusAluno FROM tb2B
			WHERE statusAluno = 'Aprovado') ori ON ori.RM = dest.RM
	WHEN NOT MATCHED THEN 
			INSERT(RM, nomeAluno, statusAluno)
			VALUES(ori.RM, ori.nomeAluno, ori.statusAluno)
	WHEN MATCHED THEN
			UPDATE SET dest.nomeAluno = ori.nomeAluno, dest.statusAluno = ori.statusAluno;


----------------SELECT----------------
SELECT * FROM tb3

--------------------------------
SELECT * FROM tb2A 
SELECT * FROM tb2B 

----------------DROP----------------
DROP TABLE tb3