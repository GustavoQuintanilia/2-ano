USE bdTransito
GO

------------------------------INSERT--------------------------------------
--------------------------------------------------------------------
INSERT INTO tbMotorista (nomeMotorista, dataNascimentoMotorista, cpfMotorista, cnhMotorista, pontuacaoAcumulada)
VALUES
('Pedro Castro Paulo', '10/06/2000', '777.777.777-88', '000444888', 10)
,('Maria Carvalho', '05/05/1980', '333.333.333-66', '218298345', 5)
,('Guilherme Silva', '04/03/1994', '999.999.999-00', '010101010', 15)
,('João Tavares', '08/09/2000', '954.954.954-95', '203203203', 13)
,('Carol Pereira', '09/09/1999', '999.999.999-99', '99999999', 8)

--------------------------------------------------------------------
INSERT INTO tbVeiculo (modeloVeiculo, placa, renavam, anoVeiculo, idMotorista)
VALUES 
('Volkswagen Gol', 'NJN-1616', '56V43434679', '01/11/2018', 5)
,('Hyundai HB20', 'JNF-2929', '12A74743898', '16/01/2018', 2)
,('Chevrolet Onix', 'DND-2828', '78J99990003', '29/04/2018', 1)
,('Fiat Mobi', 'NVH-1919', '64G98232388', '01/09/2018', 4)
,('Fiat Argo', 'NCD-9192', '99H09099909', '21/12/2018', 3)

--------------------------------------------------------------------
INSERT INTO tbMulta (dataMulta, horaMulta, pontosMulta, idVeiculo)
VALUES 
('15/06/2019', '00:00:00', 5, 2)
,('05/02/2019', '00:00:00', 10, 3)
,('19/03/2019', '00:00:00', 15, 5)
,('03/10/2019', '00:00:00', 13, 4)
,('12/08/2019', '00:00:00', 8, 1)
