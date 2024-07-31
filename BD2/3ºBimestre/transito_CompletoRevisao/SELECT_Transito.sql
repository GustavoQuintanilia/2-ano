USE tbTransito
GO

--A)------------------------------------------------------------------------
	SELECT COUNT(idMotorista) AS 'Quantidade de Motoristas' FROM tbMotorista

--B)------------------------------------------------------------------------
	SELECT COUNT(idMotorista) AS 'Quant. Motoristas com o sobrenome de Silva' FROM tbMotorista
		WHERE nomeMotorista LIKE '%Silva%'

--C)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quant. de Motoristas que nasceram em 2000' FROM tbMotorista
		WHERE YEAR (dataNascimentoMotorista) = 2000

--D)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quant. de Motoristas com mais de 10 pontos' FROM tbMotorista
		WHERE (pontuacaoAcumulada) >= 10

--E)------------------------------------------------------------------------
	SELECT SUM(pontuacaoAcumulada) AS 'Soma dos pontos de todos os motorista' FROM tbMotorista

--F)------------------------------------------------------------------------
	SELECT AVG(pontuacaoAcumulada) AS 'Média dos pontos de todos os motorista' FROM tbMotorista

--G)------------------------------------------------------------------------
	SELECT COUNT(idVeiculo) AS 'Quantidade de veiculos do motorista 1' FROM tbVeiculo
		WHERE (idMotorista) = 1

--H)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos com a placa que comça com A' FROM tbVeiculo
		WHERE placa LIKE 'A%'

--I)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos fabricados antes de 2010' FROM tbVeiculo
		WHERE anoVeiculo < 2010

--J)------------------------------------------------------------------------
	SELECT AVG(anoVeiculo) AS 'Média dos anos de fabricação de veículo' FROM tbVeiculo

--k)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos com Sedan em seu modelo' FROM tbVeiculo
		WHERE modeloVeiculo LIKE 'Sedan%'

--L)------------------------------------------------------------------------
	SELECT SUM(pontosMulta) AS 'Soma dos pontos de multa do veículo 2' FROM tbMultas
		WHERE (idVeiculo) = 2

--M)------------------------------------------------------------------------
	SELECT AVG(pontosMulta) AS 'Média dos pontos de multa' FROM tbMultas

--N)------------------------------------------------------------------------
	SELECT COUNT (*) AS 'Quantidade de multas da data de Abril de 2018' FROM tbMultas
		WHERE MONTH (dataMulta) = 04
			AND YEAR (dataMulta) = 2018 

--O)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos que a placa termine com 1 ou 2' FROM tbVeiculo
		WHERE placa LIKE '%1'
			OR placa LIKE '%2'
--P)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos que a placa termine com 3 ou 4' FROM tbVeiculo
		WHERE placa LIKE '%3'
			OR placa LIKE '%4'

--Q)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos que a placa termine com 5 ou 6' FROM tbVeiculo
		WHERE placa LIKE '%5'
			OR placa LIKE '%6'

--R)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos que a placa termine com 7 ou 8' FROM tbVeiculo
		WHERE placa LIKE '%7'
			OR placa LIKE '%8'

--S)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos que a placa termine com 9 ou 0' FROM tbVeiculo
		WHERE placa LIKE '%9'
			OR placa LIKE '%0'

--T)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos por ano de fabricação', anoVeiculo AS 'Ano de Fabricação' FROM tbVeiculo
		GROUP BY anoVeiculo

--U)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de motoristas por pontuação acumulada', pontuacaoAcumulada AS 'Pontuação acumulada' FROM tbMotorista 
		GROUP BY pontuacaoAcumulada

--V)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quant. de Motoristas com mais de 20 pontos' FROM tbMotorista
		WHERE (pontuacaoAcumulada) >= 20

--W)------------------------------------------------------------------------
	SELECT AVG(pontuacaoAcumulada) AS 'Média de pontos dos motoristas nascidos em 2000' FROM tbMotorista 
		WHERE YEAR (dataNascimentoMotorista) = 2000

--X)------------------------------------------------------------------------
	SELECT AVG(pontosMulta) AS 'Média dos pontos de multas de Julho de 2017' FROM tbMultas
		WHERE MONTH (dataMulta) = 07 
			AND YEAR (dataMulta) = 2017

--Y)------------------------------------------------------------------------
	SELECT COUNT(*) AS 'Quantidade de veículos que não andam na segunda-feira' FROM tbVeiculo
		WHERE placa LIKE '%1'
			OR placa LIKE '%2'