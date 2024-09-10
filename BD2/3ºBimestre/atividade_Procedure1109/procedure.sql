USE bdProdutos
GO

--------------------------------PROCEDURE---------------------------------

-- a) Criar uma Stored Procedure para inserir as categorias de produto conforme abaixo:

CREATE PROCEDURE spInserir_Categoria_Produto
	@nomeCategoriaProduto VARCHAR (100)

AS 
	BEGIN
		IF EXISTS (SELECT nomeCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto LIKE @nomeCategoriaProduto)
		BEGIN

			PRINT ('A categoria '+@nomeCategoriaProduto+' j� existe no sistema!')

		END
		ELSE
		BEGIN 
			INSERT INTO tbCategoriaProduto (nomeCategoriaProduto)
				VALUES (@nomeCategoriaProduto)
			PRINT('A categoria '+@nomeCategoriaProduto+', foi inserida com sucesso!')
		END
	END
--**Inserindo categorias dos produtos**
EXEC spInserir_Categoria_Produto 'Bolo Festa'
EXEC spInserir_Categoria_Produto 'Bolo Simples'
EXEC spInserir_Categoria_Produto 'Torta'
EXEC spInserir_Categoria_Produto 'Salgado'

--SELECT
SELECT * FROM tbCategoriaProduto

--DROP
DROP PROCEDURE spInserir_Categoria_Produto


-- b) Criar uma Stored Procedure para inserir os produtos abaixo, sendo que, a procedure dever� antes 
--de inserir verificar se o nome do produto j� existe, evitando assim que um produto seja duplicado:

CREATE PROCEDURE spInserir_Verificar_Produtos
	@nomeProduto VARCHAR (100) 
	,@precoKiloProduto MONEY 
	,@codCategoriaProduto INT 

AS
	BEGIN 
		IF EXISTS (SELECT nomeProduto FROM tbProduto WHERE nomeProduto LIKE @nomeProduto)
		BEGIN 
			PRINT('N�o � poss�vel inserir o produto '+@nomeProduto+'. Ele j� est� inserido no sistema!')
		END
		ELSE
		BEGIN
			INSERT INTO tbProduto (nomeProduto, precoKiloProduto, codCategoriaProduto)
				VALUES (@nomeProduto, @precoKiloProduto, @codCategoriaProduto)
			PRINT('O produto '+@nomeProduto+', foi inserido com sucesso no sistema!')
		END
	END

--**Inserindo produtos**
EXEC spInserir_Verificar_Produtos 'Bolo Floresta Negra', '42.00', '1'
EXEC spInserir_Verificar_Produtos 'Bolo Prest�gio', '43.00', '1'
EXEC spInserir_Verificar_Produtos 'Bolo Nutella', '44.00', '1'
EXEC spInserir_Verificar_Produtos 'Bolo Formigueiro', '17.00', '2'
EXEC spInserir_Verificar_Produtos 'Bolo de cenoura', '19.00', '2'
EXEC spInserir_Verificar_Produtos 'Torta de palmito', '45.00', '3'
EXEC spInserir_Verificar_Produtos 'Torta de frango e catupiry', '47.00', '3'
EXEC spInserir_Verificar_Produtos 'Torta de escarola', '44.00', '3'
EXEC spInserir_Verificar_Produtos 'Coxinha frango', '25.00', '4'
EXEC spInserir_Verificar_Produtos 'Esfiha carne', '27.00', '4'
EXEC spInserir_Verificar_Produtos 'Folhado queijo', '31.00', '4'
EXEC spInserir_Verificar_Produtos 'Risoles misto', '29.00', '4'

--SELECT
SELECT * FROM tbProduto

--DROP
DROP PROCEDURE spInserir_Verificar_Produtos

--c) Criar uma stored procedure para cadastrar os clientes abaixo relacionados, sendo que dever�o ser feitas duas valida��es:

--- Verificar pelo CPF se o cliente j� existe. Caso j� exista emitir a mensagem: �Cliente cpf XXXXX
--j� cadastrado� (Acrescentar a coluna CPF)

--- Verificar se o cliente � morador de Itaquera ou Guaianases, pois a confeitaria n�o realiza
--entregas para clientes que residam fora desses bairros. Caso o cliente n�o seja morador desses
--bairros enviar a mensagem �N�o foi poss�vel cadastrar o cliente XXXX pois o bairro XXXX n�o �
--atendido pela confeitaria�


CREATE PROCEDURE spCastrar_Validar_Cliente
	@nomeCliente VARCHAR (100) 
	,@dataNascimentoCliente DATE 
	,@ruaCliente VARCHAR (250) 
	,@numCasaCliente INT 
	,@cepCliente VARCHAR (20) 
	,@bairroCliente VARCHAR (250) 
	,@cidadeCliente VARCHAR (250) 
	,@estadoCliente VARCHAR (250) 
	,@cpfCliente VARCHAR (15) 
	,@sexoCliente VARCHAR (2) 

AS 
	BEGIN 
		IF EXISTS (SELECT cpfCliente FROM tbCliente WHERE cpfCliente LIKE @cpfCliente)
		BEGIN 
			PRINT('O cliente do CPF '+@cpfCliente+' j� est� castrado no sistema!')
		END
		ELSE IF (@bairroCliente NOT IN('Guaianases','Itaquera'))
		BEGIN
			PRINT('N�o foi poss�vel realizar o cadastro do cliente '+@nomeCliente+', pois o bairro '+@bairroCliente+' n�o � atendido pela confeitaria')
		END
		ELSE 
		BEGIN
			INSERT INTO tbCliente (nomeCliente, dataNascimentoCliente, ruaCliente, numCasaCliente, 
			cepCliente, bairroCliente, cidadeCliente, estadoCliente, cpfCliente, sexoCliente)

				VALUES (@nomeCliente, @dataNascimentoCliente, @ruaCliente, @numCasaCliente, 
				@cepCliente, @bairroCliente, @cidadeCliente, @estadoCliente, @cpfCliente, @sexoCliente)
			PRINT('Cliente '+@nomeCliente+' foi cadastrado com sucesso!')
		END
	END

--**Inserindo produtos**
EXEC spCastrar_Validar_Cliente 'Samira Fatah', '1990-05-05', 'Rua Aguape�', 1000, '08.090-000', 'Guaianases', 'S�o Paulo', 'SP', '11122244400', 'F'
EXEC spCastrar_Validar_Cliente 'Celia Nogueira', '1992-06-06', 'Rua Andes', 234, '08.456-090', 'Guaianases', 'S�o Paulo', 'SP', '22244466688', 'F'
EXEC spCastrar_Validar_Cliente 'Paulo Cesar Siqueira', '1984-04-04', 'Rua Castelo do Piau�', 232, '08.109-000', 'Itaquera', 'S�o Paulo', 'SP', '33366699912', 'M'
EXEC spCastrar_Validar_Cliente'Rodrigo Favaroni', '1991-04-09', 'Rua Sans�o Castelo Branco', 10, '08.431-090', 'Guaianases', 'S�o Paulo', 'SP', '55566688813', 'M'
EXEC spCastrar_Validar_Cliente 'Fl�via Regina Brito', '1992-04-22', 'Rua Mariano Moro', 300, '08.200-123', 'Itaquera', 'S�o Paulo', 'SP', '00055588899', 'F'

EXEC spCastrar_Validar_Cliente 'Fl�via Regina Brito', '1992-04-22', 'Rua Mariano Moro', 300, '08.200-123', 'RUA JORGE', 'S�o Paulo', 'SP', 'DGBFGBFBG', 'F'

--SELECT
SELECT * FROM tbCliente

--DROP
DROP PROCEDURE spCastrar_Validar_Cliente

--d) Criar via stored procedure as encomendas abaixo relacionadas, fazendo as verifica��es abaixo:

--- No momento da encomenda o cliente ir� fornecer o seu cpf. Caso ele n�o tenha sido
--cadastrado enviar a mensagem �n�o foi poss�vel efetivar a encomenda pois o cliente xxxx n�o
--est� cadastrado�

--- Verificar se a data de entrega n�o � menor do que a data da encomenda. Caso seja enviar a
--mensagem �n�o � poss�vel entregar uma encomenda antes da encomenda ser realizada�

--- Caso tudo esteja correto, efetuar a encomenda e emitir a mensagem: �Encomenda XXX para
--o cliente YYY efetuada com sucesso� sendo que no lugar de XXX dever� aparecer o n�mero da
--encomenda e no YYY dever� aparecer o nome do cliente;


CREATE PROCEDURE spEncomenda_Verificacao
	@cpfCliente VARCHAR (15)
	,@dataEncomenda DATE 
	,@valorTotalEncomenda MONEY 
	,@dataEntregaEncomenda DATE 
AS

	BEGIN

		DECLARE @nomeCliente VARCHAR (100)
		DECLARE @codCliente INT


		SELECT @codCliente = codCliente, @nomeCliente = nomeCliente FROM tbCliente 
		WHERE @cpfCliente = cpfCliente

		IF (@codCliente IS NULL)
		BEGIN 
			PRINT('N�o foi poss�vel efetivar a encomenda, pois o cliente '+@cpfCliente+' n�o est� castrado!')
			RETURN
		END

		ELSE IF (@dataEntregaEncomenda < @dataEncomenda)
		BEGIN 
			PRINT ('N�o � poss�vel entregar uma encomenda antes da encomenda ser realizada!')
			RETURN
		END
		ELSE
		BEGIN	
			INSERT INTO tbEncomenda ( dataEncomenda, codCliente, valorTotalEncomenda, dataEntregaEncomenda)
				VALUES ( @dataEncomenda, @codCliente ,@valorTotalEncomenda, @dataEntregaEncomenda)

			DECLARE @codEncomenda INT
			SELECT @codEncomenda = SCOPE_IDENTITY()
		
			PRINT ('A encomenda '+CAST(@codEncomenda AS VARCHAR)+' para o cliente '+@nomeCliente+' efetuada com sucesso!')
		END
	END

--**Inserindo produtos**
EXEC spEncomenda_Verificacao '11122244400', '2015-08-08', 450.00, '2015-08-15';
EXEC spEncomenda_Verificacao '22244466688', '2015-10-10', 200.00, '2024-10-15';
EXEC spEncomenda_Verificacao '33366699912', '2015-10-10', 150.00, '2015-12-10';
EXEC spEncomenda_Verificacao '11122244400', '2015-10-06', 250.00, '2015-10-12';
EXEC spEncomenda_Verificacao '55566688813', '2015-10-05', 150.00, '2015-10-12';

EXEC spEncomenda_Verificacao '55566688813', '2015-10-05', 150.00, '2010-10-12';

--SELECT
SELECT * FROM tbEncomenda

--DROP
DROP PROCEDURE spEncomenda_Verificacao

--e) Ao adicionar a encomenda, criar uma Stored procedure, para que sejam inseridos os itens da encomenda conforme tabela a seguir. 

CREATE PROCEDURE spInserir_Itens_Encomenda
	@codEncomenda INT
	,@codProduto INT 
	,@quantidadeKilos FLOAT 
	,@subTotal MONEY
	
AS 
	BEGIN 
		DECLARE @codItens INT 

		IF EXISTS (SELECT codItensEncomenda FROM tbItensEncomenda WHERE codItensEncomenda LIKE @codItens)
		BEGIN
			PRINT('Encomenda j� existente no sistema!')
		END
		ELSE
		BEGIN
		INSERT INTO tbItensEncomenda (codEncomenda, codProduto, quantidadeKilos, subTotal)
			VALUES (@codEncomenda, @codProduto, @quantidadeKilos, @subTotal)
		PRINT('Os itens da encomenda foram inseridos com sucesso!')
		END
	END

--**Inserindo produtos**
EXEC spInserir_Itens_Encomenda 1, 1, 2.5, 105.00
EXEC spInserir_Itens_Encomenda 1, 10, 2.6, 70.00
EXEC spInserir_Itens_Encomenda 1, 9, 6, 150.00
EXEC spInserir_Itens_Encomenda 1, 12, 4.3, 125.00
EXEC spInserir_Itens_Encomenda 2, 9, 8, 200.00
EXEC spInserir_Itens_Encomenda 3, 11, 3.2, 100.00
EXEC spInserir_Itens_Encomenda 3, 9, 2, 50.00
EXEC spInserir_Itens_Encomenda 4, 2, 3.5, 150.00
EXEC spInserir_Itens_Encomenda 4, 3, 2.2, 100.00
EXEC spInserir_Itens_Encomenda 5, 6, 3.4, 150.00

EXEC spInserir_Itens_Encomenda 0, 6, 3.4, 150.00
EXEC spInserir_Itens_Encomenda 5, 6, 3.4, 150

--SELECT 
SELECT * FROM tbItensEncomenda

--DROP
DROP PROCEDURE spInserir_Itens_Encomenda

--f) Ap�s todos os cadastros, criar Stored procedures para alterar o que se pede:
--1- O pre�o dos produtos da categoria �Bolo festa� sofreram um aumento de 10%
--2- O pre�o dos produtos categoria �Bolo simples� est�o em promo��o e ter�o um desconto de 20%;
--3- O pre�o dos produtos categoria �Torta� aumentaram 25%
--4- O pre�o dos produtos categoria �Salgado�, com exce��o da esfiha de carne, sofreram um aumento de 20%

CREATE PROCEDURE spMudar_Precos
	@percentual DECIMAL(5,2),
	@categoriaProduto VARCHAR(100),
	@alteracao NVARCHAR(10)
AS
	BEGIN
		DECLARE @codCategoriaProduto INT

		SELECT @codCategoriaProduto = codCategoriaProduto FROM tbCategoriaProduto
		WHERE nomeCategoriaProduto = @categoriaProduto

		IF @codCategoriaProduto IS NULL
		BEGIN
			PRINT('A categoria digitada n�o foi encontrada!')
			RETURN
		END

		IF @alteracao LIKE 'aumento'
		BEGIN
			UPDATE tbProduto
			SET precoKiloProduto = precoKiloProduto + (precoKiloProduto * @percentual / 100)
			WHERE codCategoriaProduto = @codCategoriaProduto
			AND nomeProduto != 'Esfiha carne'

			PRINT 'Pre�os dos produtos da categoria '+ @categoriaProduto + ' foram aumentados em '+
			CAST(@percentual AS NVARCHAR)+ '%';
		END
		ELSE IF @alteracao LIKE 'desconto'
		BEGIN
			UPDATE tbProduto 
			SET precoKiloProduto = precoKiloProduto - (precoKiloProduto * @percentual / 100)
			WHERE codCategoriaProduto = @codCategoriaProduto

			PRINT 'Precos dos produtos '+ @categoriaProduto +' foram reduzidos em '+
			CAST (@percentual AS NVARCHAR) + '%';
		END
	END

----------** Alterando os pre�os **----------------------------

EXEC spMudar_Precos '10', 'Bolo festa', 'aumento'
EXEC spMudar_Precos '20', 'Bolo Simples', 'desconto'
EXEC spMudar_Precos '25', 'Torta', 'aumento'
EXEC spMudar_Precos '20',  'salgado', 'aumento'

EXEC spMudar_Precos '20',  'ARROZ', 'aumento'

--SELECT

SELECT * FROM tbProduto

--DROP 
DROP PROCEDURE spMudar_Precos


--g) Criar uma procedure para excluir clientes pelo CPF sendo que:
--1- Caso o cliente possua encomendas emitir a mensagem �Impossivel remover esse cliente pois o cliente XXXXX possui encomendas; onde XXXXX � o nome do cliente.
--2- Caso o cliente n�o possua encomendas realizar a remo��o e emitir a mensagem �Cliente XXXX removido com sucesso�, onde XXXX � o nome do cliente;
CREATE PROCEDURE spDeleta_Cliente

	@cpfCliente VARCHAR (15)

AS

	BEGIN 

		DECLARE @nomeCliente VARCHAR (100)
		DECLARE @codCliente INT 

		SELECT @nomeCliente = nomeCliente, @codCliente = codCliente FROM tbCliente 
		WHERE @cpfCliente = cpfCliente

		IF @codCliente IS NULL
		BEGIN
			PRINT('N�o existe nenhum cliente com esse CPF no sistema!')
			RETURN
		END

		IF EXISTS (SELECT codCliente FROM tbEncomenda WHERE codCliente = @codCliente)
		BEGIN
		
			PRINT ('Impossivel remover esse cliente, pois o cliente '+@nomeCliente+' possui encomendas!')

		END
		ELSE
		BEGIN
			
			DELETE FROM tbCliente WHERE cpfCliente = @cpfCliente
			PRINT ('Cliente '+@nomeCliente+' removido com sucesso!')

		END
	END

----*Deletando dados*

EXEC spDeleta_Cliente '00055588899'
EXEC spDeleta_Cliente '11122244400'


----SELECT
SELECT * FROM tbCliente
SELECT * FROM tbEncomenda

--DROP
DROP PROCEDURE spDeleta_Cliente

--h) Criar uma procedure que permita excluir qualquer item de uma encomenda cuja data de entrega seja maior que a data atual. Para tal o cliente 
--dever� fornecer o c�digo da encomenda e o c�digo do produto que ser� exclu�do da encomenda. A procedure dever� remover o item e atualizar 
--o valor total da encomenda, do qual dever� ser subtra�do o valor do item a ser removido. A procedure poder� remover apenas um item da 
--encomenda de cada vez.
CREATE PROCEDURE spDelete_Encomenda
	@codEncomenda INT
	,@codProduto INT
AS
	BEGIN
	
		DECLARE @subTotal MONEY

		SELECT @subTotal = subTotal FROM tbItensEncomenda
			WHERE codEncomenda = @codEncomenda AND codProduto = @codProduto
			
		IF @subTotal IS NULL
		BEGIN
			PRINT ('O item procurado n�o existe nesta encomenda!')
		END
		ELSE IF EXISTS (SELECT 1 FROM tbEncomenda WHERE codEncomenda = @codEncomenda AND 
			dataEntregaEncomenda <= GETDATE())
		BEGIN
			PRINT('N�o � poss�vel excluir esta encomenda, pois ela possu� a data de entrega igual ou menor que a data atual!')
		END
		ELSE 
		BEGIN 
			DELETE FROM tbItensEncomenda WHERE codEncomenda = @codEncomenda AND codProduto = @codProduto

			UPDATE tbEncomenda
			SET valorTotalEncomenda = valorTotalEncomenda - @subTotal WHERE codEncomenda = @codEncomenda

			PRINT('O item selecionado foi removido com sucesso! E o valor total da encomenda foi atualizado!')
		END
	END

----*Deletando dados*
EXEC spDelete_Encomenda '1', '1'
EXEC spDelete_Encomenda '2', '9'

----SELECT
SELECT * FROM tbItensEncomenda
SELECT * FROM tbEncomenda

---DROP 
DROP PROCEDURE spDelete_Encomenda




--------------------SELECT_TABLE--------------------------
SELECT * FROM tbItensEncomenda
SELECT * FROM tbEncomenda
SELECT * FROM tbProduto
SELECT * FROM tbCliente
SELECT * FROM tbCategoriaProduto