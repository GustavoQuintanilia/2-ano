USE bdContaCorrente
GO

------------------------------TRIGGERS--------------------------------------
---a)Ao ser feito um depósito atualize o saldo da conta corrente somando a 
--quantia depositada
CREATE TRIGGER tgDepositarSaldo
	ON tbDeposito AFTER INSERT 
	AS
	BEGIN
		DECLARE @valorDeposito MONEY, @numConta INT

		SET @valorDeposito = (SELECT valorDeposito FROM INSERTED)
		SET @numConta = (SELECT numConta FROM INSERTED)

		UPDATE tbContaCorrente SET saldoConta = saldoConta + @valorDeposito
			WHERE numConta = @numConta

		PRINT('Seu depósito foi realizado com sucesso!')
	END

--------INSERT----------
INSERT INTO tbDeposito (valorDeposito, numConta, dataDeposito, horaDeposito)
VALUES
(140, 3, '21/12/2018', '00:00:00')

----------SELECT--------------
SELECT * FROM tbContaCorrente
SELECT * FROM tbDeposito

---b)Ao ser feito um saque atualize o saldo da conta corrente descontando o 
--valor caso tenha saldo suficiente
CREATE TRIGGER tgSaqueSaldo
	ON tbSaque AFTER INSERT 
	AS
	BEGIN
		DECLARE @valorSaque MONEY, @numConta INT

		SET @valorSaque = (SELECT valorSaque FROM INSERTED)
		SET @numConta = (SELECT numConta FROM INSERTED)

		IF (SELECT saldoConta FROM tbContaCorrente WHERE numConta = @numConta) >= @valorSaque
			UPDATE tbContaCorrente SET saldoConta = saldoConta - @valorSaque
			WHERE numConta = @numConta
			

		ELSE
			PRINT ('Não é possível realizar este saque! Usuário não tem saldo o suficiente.')

	END 

--------INSERT----------
INSERT INTO tbSaque (valorSaque, numConta, dataSaque, horaSaque)
VALUES
(890, 3, '15/06/2019', '00:00:00')

--------INSERT----------
INSERT INTO tbSaque (valorSaque, numConta, dataSaque, horaSaque)
VALUES
(5300, 4, '15/06/2019', '00:00:00')

--------INSERT----------
INSERT INTO tbSaque (valorSaque, numConta, dataSaque, horaSaque)
VALUES
(3101, 2, '15/06/2019', '00:00:00')

----------SELECT--------------
SELECT * FROM tbContaCorrente
SELECT * FROM tbSaque