USE bdRedeLojas
GO

--------------------MERGE----------------------------
DECLARE @cont1 INT
SET @cont1=1
WHILE @cont1 <= (select count(idProduto)
from tbProdutoLj1)
BEGIN
	INSERT INTO tbProdutos(idProduto, nomeProduto,
	valor, qtde)
	VALUES
	(@cont1, (SELECT nomeProduto FROM tbProdutoLj1
	where idProduto = @cont1)
	,(select precoProduto from tbProdutoLj1 where
	idProduto = @cont1)
	,(select qtde from tbProdutoLj1 where idProduto =
	@cont1)
	)
SET @cont1 = @cont1+1
END

------------------------------------

DECLARE @cont1 INT
SET @cont1=1
WHILE @cont1 <= (SELECT COUNT(idProduto) FROM tbProdutoLj2)
BEGIN
	IF EXISTS (SELECT idProduto from tbProdutos WHERE idProduto = @cont1)
	BEGIN
		UPDATE tbProdutos
		SET qtde = qtde + (SELECT qtde FROM tbProdutoLj2 WHERE idProduto = @cont1)
	END
	ELSE
	BEGIN
		INSERT INTO tbProdutos(idProduto, nomeProduto, valor, qtde)
		VALUES (@cont1, (select nomeProduto from tbProdutoLj2 where idProduto = @cont1)
		,(select precoProduto from tbProdutoLj2 where idProduto = @cont1)
		,(select qtde from tbProdutoLj2 where idProduto = @cont1)
		)
	END
	set @cont1 = @cont1+1
END

------------------------------------
MERGE tbProdutos dest
	USING tbProdutoLj1 ori
	ON ori.idProduto = dest.idProduto
	WHEN NOT MATCHED THEN
	INSERT values (ori.idProduto,
	ori.nomeProduto, ori.precoProduto,
	ori.qtde)
	WHEN MATCHED THEN
	UPDATE SET dest.qtde += ori.qtde;

------------------------------------
MERGE tbProdutos dest
	USING tbProdutoLj2 ori
	ON ori.idProduto = dest.idProduto
	WHEN NOT MATCHED THEN
	INSERT values (ori.idProduto,
	ori.nomeProduto, ori.precoProduto,
	ori.qtde)
	WHEN MATCHED THEN
	UPDATE SET dest.qtde += ori.qtde;