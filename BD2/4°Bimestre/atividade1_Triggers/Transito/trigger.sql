USE bdTransito
GO

------------------------------TRIGGERS--------------------------------------
---1) Criar um trigger que ao ve�culo tomar uma multa os pontos da multa 
--sejam atualizados na tabela do motorista no campo pontuacaoAcumulada. 
--Caso o motorista alcance 20 pontos informar via mensagem que o mesmo 
--poder� ter sua habilita��o suspensa.
DROP TRIGGER tgAtualizaMulta

CREATE TRIGGER tgAtualizaMulta
	ON tbMulta AFTER INSERT 
	AS 
	BEGIN 
		DECLARE @pontosMulta INT, @idVeiculo INT, @idMotorista INT
		
		SET @pontosMulta = (SELECT pontosMulta FROM INSERTED)
		SET @idVeiculo = (SELECT idVeiculo FROM INSERTED)

		SELECT @idMotorista = idMotorista FROM tbVeiculo
			WHERE idVeiculo = @idVeiculo

		UPDATE tbMotorista SET pontuacaoAcumulada = pontuacaoAcumulada + @pontosMulta
			WHERE idMotorista = @idMotorista

		IF (SELECT pontuacaoAcumulada FROM tbMotorista WHERE idMotorista = @idMotorista) >= 20 
			PRINT('ATEN��O! A pontua��o de sua habilita��o est� atigindo seu limite. Voc� poder� ter sua carteira suspensa.')
		ELSE
			PRINT ('A pontua��o da habilita��o foi registrada!')
	END 
-----------ISERT----------
INSERT INTO tbMulta (dataMulta, horaMulta, pontosMulta, idVeiculo)
VALUES 
('15/06/2019', '00:00:00', 15, 2)

-----------ISERT----------
INSERT INTO tbMulta (dataMulta, horaMulta, pontosMulta, idVeiculo)
VALUES 
('15/06/2019', '00:00:00', 12, 1)

-----------SELECT----------
SELECT * FROM tbMotorista
SELECT * FROM tbMulta





