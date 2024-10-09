USE bdEstoque
GO

------------------------------TRIGGERS--------------------------------------
---Criar um trigger que, ao ser feita uma venda (Insert na tabela tbItensVenda), todos os produtos vendidos tenham sua quantidade
--atualizada na tabela tbProduto. Exemplo, se foi feita uma venda de 5 unidades do produto código 01, na tabela tbProduto a 
--quantidade desse produto será a quantidade atual – 5;
CREATE TRIGGER tgAtualizarVendaProduto 
	ON tbItensVenda AFTER INSERT
	AS
	BEGIN
		DECLARE @quantidadeItensVenda INT, @codProduto INT
		SET @quantidadeItensVenda = (SELECT quantidadeItensVenda FROM inserted)
		SET @codProduto = (SELECT codProduto FROM inserted)

		UPDATE tbProduto SET quantidadeProduto = quantidadeProduto - @quantidadeItensVenda 
		WHERE codProduto = @codProduto
	END

--------INSERT
INSERT INTO tbItensVenda(codVenda,codProduto,quantidadeItensVenda,subTotalItensVenda) 
VALUES
	(1,1,200,1500.00)

--------SELECT
SELECT * FROM tbProduto
SELECT * FROM tbItensVenda
	

---Criar uma trigger que, quando for inserida uma nova entrada de produtos na tbEntradaProduto, a quantidade desse produto 
--seja atualizada e aumentada na tabela tbProduto;
CREATE TRIGGER tgAtualizaAumenta
	ON tbEntradaProduto AFTER INSERT
	AS
	BEGIN
		DECLARE @quantidadeEntradaProduto INT, @codProduto INT 
		SET @quantidadeEntradaProduto = (SELECT quantidadeEntradaProduto FROM inserted)
		SET @codProduto = (SELECT codProduto FROM inserted)

		UPDATE tbProduto SET quantidadeProduto = quantidadeProduto + @quantidadeEntradaProduto
		WHERE codProduto = @codProduto
	END

--------INSERT
INSERT INTO tbEntradaProduto(dataEntradaProduto, codProduto, quantidadeEntradaProduto) 
VALUES
('22/10/2013', 10, 20)

--------SELECT
SELECT * FROM tbProduto
SELECT * FROM tbEntradaProduto

---Criar uma trigger que, quando for feita uma venda de um determinado produto, seja feito um Insert na tbSaidaProduto.
CREATE TRIGGER tgVendaInserir
	ON tbItensVenda AFTER INSERT
	AS
	BEGIN
		DECLARE  @codProduto INT, @quantidadeItensVenda INT
		SET @codProduto = (SELECT codProduto FROM inserted)
		SET @quantidadeItensVenda = (SELECT quantidadeItensVenda FROM inserted)
		
		INSERT INTO tbSaidaProduto(dataSaidaProduto, codProduto, quantidadeSaidaProduto) 
		VALUES (GETDATE(), @codProduto, @quantidadeItensVenda)
	END

--------INSERT
INSERT INTO tbItensVenda(codVenda,codProduto,quantidadeItensVenda,subTotalItensVenda) 
VALUES
	(2,2,200,1000.00)

--------SELECT
SELECT * FROM tbSaidaProduto
SELECT * FROM tbItensVenda

-------------------------------DROP-------------------------------------
DROP TRIGGER tgAtualizarVendaProduto
DROP TRIGGER tgAtualizaAumenta
DROP TRIGGER tgVendaInserir