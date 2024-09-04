USE bdProdutos
GO

--------------------------------PROCEDURE---------------------------------

-- a) Criar uma Stored Procedure para inserir as categorias de produto conforme abaixo:

CREATE PROCEDURE spInserir_Categoria_Produto
	@nomeCategoriaProduto VARCHAR (100)

AS 
	BEGIN 
		INSERT INTO tbCategoriaProduto (nomeCategoriaProduto)
			VALUES (@nomeCategoriaProduto)
		PRINT('A categoria '+@nomeCategoriaProduto+', foi inserida com sucesso!')
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


-- b) Criar uma Stored Procedure para inserir os produtos abaixo, sendo que, a procedure deverá antes 
--de inserir verificar se o nome do produto já existe, evitando assim que um produto seja duplicado:

CREATE PROCEDURE spInserir_Verificar_Produtos
	@nomeProduto VARCHAR (100) 
	,@precoKiloProduto MONEY 
	,@codCategoriaProduto INT 

AS
	BEGIN 
		IF EXISTS (SELECT nomeProduto FROM tbProduto WHERE nomeProduto LIKE @nomeProduto)
		BEGIN 
			PRINT('Não é possível inserir o produto '+@nomeProduto+'. Ele já está inserido no sistema!')
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
EXEC spInserir_Verificar_Produtos 'Bolo Prestigio', '43.00', '1'
EXEC spInserir_Verificar_Produtos 'Bolo Nutella', '44.00', '1'
EXEC spInserir_Verificar_Produtos 'Bolo Formigueiro', '17.00', '2'
EXEC spInserir_Verificar_Produtos 'Bolo de cenoura', '19.00', '2'
EXEC spInserir_Verificar_Produtos 'Torta de palmito', '45.00', '3'
EXEC spInserir_Verificar_Produtos 'Torta de frango e catupiry', '47.00', '3'
EXEC spInserir_Verificar_Produtos 'Torta de escarola', '44.00', '3'
EXEC spInserir_Verificar_Produtos 'Coxinha frango', '25.00', '4'
EXEC spInserir_Verificar_Produtos 'Esfiha came', '27.00', '4'
EXEC spInserir_Verificar_Produtos 'Folhado queijo', '31.00', '4'
EXEC spInserir_Verificar_Produtos 'Risoles misto', '29.00', '4'

--SELECT
SELECT * FROM tbProduto

--DROP
DROP PROCEDURE spInserir_Verificar_Produtos

--c) Criar uma stored procedure para cadastrar os clientes abaixo relacionados, sendo que deverão ser feitas duas validações:
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
			PRINT('O cliente do CPF '+@cpfCliente+' já está castrado no sistema!')
		END
		ELSE IF (@bairroCliente NOT IN('Guaianases','Itaquera'))
		BEGIN
			PRINT('Não foi possível realizar o cadastro do cliente '+@nomeCliente+', pois o bairro '+@bairroCliente+' não é atendido pela confeitaria')
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
EXEC spCastrar_Validar_Cliente 'Samira Fatah', '1990-05-05', 'Rua Aguapeí', 1000, '08.090-000', 'Guaianases', 'São Paulo', 'SP', '11122244400', 'F'
EXEC spCastrar_Validar_Cliente 'Celia Nogueira', '1992-06-06', 'Rua Andes', 234, '08.456-090', 'Guaianases', 'São Paulo', 'SP', '22244466688', 'F'
EXEC spCastrar_Validar_Cliente 'Paulo Cesar Siqueira', '1984-04-04', 'Rua Castelo do Piauí', 232, '08.109-000', 'Itaquera', 'São Paulo', 'SP', '33366699912', 'M'
EXEC spCastrar_Validar_Cliente'Rodrigo Favaroni', '1991-04-09', 'Rua Sansão Castelo Branco', 10, '08.431-090', 'Guaianases', 'São Paulo', 'SP', '55566688813', 'M'
EXEC spCastrar_Validar_Cliente 'Flávia Regina Brito', '1992-04-22', 'Rua Mariano Moro', 300, '08.200-123', 'Itaquera', 'São Paulo', 'SP', '00055588899', 'F'

EXEC spCastrar_Validar_Cliente 'Flávia Regina Brito', '1992-04-22', 'Rua Mariano Moro', 300, '08.200-123', 'RUA JORGE', 'São Paulo', 'SP', 'DGBFGBFBG', 'F'

--SELECT
SELECT * FROM tbCliente

--DROP
DROP PROCEDURE spCastrar_Validar_Cliente

--d) Criar via stored procedure as encomendas abaixo relacionadas, fazendo as verificações abaixo: **VERIFICAR
CREATE PROCEDURE spEncomenda_Verificacao
	@cpfCliente VARCHAR (15)
	,@dataEncomenda DATE 
	,@valorTotalEncomenda MONEY 
	,@dataEntregaEncomenda DATE 
AS

	BEGIN
		DECLARE  @codCliente INT
		DECLARE @nomeCliente VARCHAR (100)

		SELECT @codCliente = codCliente, @nomeCliente = nomeCliente FROM tbCliente 
		WHERE @cpfCliente = cpfCliente

		IF (@codCliente IS NULL)
		BEGIN 
			PRINT('Não foi possível efetivar a encomenda, pois o cliente '+@cpfCliente+' não está castrado!')
			RETURN
		END

		IF (@dataEntregaEncomenda < @dataEncomenda)
		BEGIN 
			PRINT ('Não é possível entregar uma encomenda antes da encomenda ser realizada!')
			RETURN
		END

		INSERT INTO tbEncomenda (dataEncomenda, codCliente, valorTotalEncomenda, dataEntregaEncomenda)
			VALUES (@dataEncomenda, @codCliente ,@valorTotalEncomenda, @dataEntregaEncomenda)

		DECLARE @codEncomenda INT
		SELECT @codEncomenda = SCOPE_IDENTITY()

		PRINT ('A encomenda '+CAST(@codEncomenda AS VARCHAR)+' para o cliente '+@nomeCliente+' efetuada com sucesso!')
	END

--**Inserindo produtos**
EXEC spEncomenda_Verificacao '12345678900', '2015-08-08', 450.00, '2015-08-15';
EXEC spEncomenda_Verificacao '12345678901', '2015-10-10', 200.00, '2015-10-15';
EXEC spEncomenda_Verificacao '12345678902', '2015-10-10', 150.00, '2015-12-10';
EXEC spEncomenda_Verificacao '12345678900', '2015-10-06', 250.00, '2015-10-12';
EXEC spEncomenda_Verificacao '12345678903', '2015-10-05', 150.00, '2015-10-12';


--SELECT
SELECT * FROM tbEncomenda

--DROP
DROP PROCEDURE spEncomenda_Verificacao

--e) Ao adicionar a encomenda, criar uma Stored procedure, para que sejam inseridos os itens da encomenda conforme tabela a seguir. **AVISO: ESTÁ CERTO, SÓ QUE NÃO NÃO TEM CÓDIGO ENCOMENDA PARA ELE LIGAR

CREATE PROCEDURE spInserir_Itens_Encomenda
	@codEncomenda INT
	,@codProduto INT 
	,@quantidadeKilos FLOAT 
	,@subTotal MONEY
	
AS 
	BEGIN 
		INSERT INTO tbItensEncomenda (codEncomenda, codProduto, quantidadeKilos, subTotal)
			VALUES (@codEncomenda, @codProduto, @quantidadeKilos, @subTotal)
		PRINT('Os itens da encomenda foram inseridos com sucesso!')
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

--SELECT 
SELECT * FROM tbItensEncomenda

--f) Após todos os cadastros, criar Stored procedures para alterar o que se pede:

