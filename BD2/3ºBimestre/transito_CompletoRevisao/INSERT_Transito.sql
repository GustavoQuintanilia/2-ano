USE tbTransito
GO

INSERT INTO tbMotorista 
(nomeMotorista, dataNascimentoMotorista, cpfMotorista, CNHMotorista, pontuacaoAcumulada) 
VALUES 
('Ana Mendes', '12/07/1985', '22233344455', '45678901234', 12)
,('Lucas Ferreira', '02/11/1978', '33344455566', '56789012345', 7)
,('Beatriz Santos', '18/09/1992', '44455566677', '67890123456', 9)

INSERT INTO tbVeiculo 
(modeloVeiculo, placa, renavam, anoVeiculo, idMotorista) 
VALUES 
('Hyundai Tucson', 'ABC5678', 123987456, 2011, 1)
,('Kia Sportage', 'DEF1234', 987321654, 2014, 1)
,('Mitsubishi ASX', 'GHI5678', 135975357, 2018, 1)
,('Peugeot 208', 'JKL8901', 246803579, 2017, 2)
,('Fiat Argo', 'MNO2345', 357902468, 2019, 2)
,('Chevrolet Tracker', 'PQR6789', 468120579, 2021, 2)
,('Volkswagen Polo', 'STU3456', 579238691, 2016, 3)
,('Honda Fit', 'VWX7890', 680357802, 2018, 3)
,('Nissan Kicks', 'YZA1234', 791486913, 2022, 3)

INSERT INTO tbMultas 
(dataMulta, horaMulta, pontosMulta, idVeiculo) 
VALUES 
('01/02/2023', '10:00:00', 3, 1)
,('15/03/2023', '14:30:00', 4, 1)
,('20/04/2023', '09:45:00', 5, 2)
,('05/05/2023', '16:00:00', 2, 2)
,('10/06/2023', '11:15:00', 6, 3)
,('25/07/2023', '08:30:00', 1, 3)
,('05/08/2023', '13:45:00', 3, 4)
,('20/09/2023', '15:15:00', 2, 4)
,('30/10/2023', '17:00:00', 4, 5)
,('10/11/2023', '09:00:00', 5, 5)
,('15/12/2023', '12:45:00', 6, 6)
,('05/01/2024', '11:30:00', 1, 6)
,('20/01/2024', '10:15:00', 2, 7)
,('25/02/2024', '13:30:00', 3, 7)
,('05/03/2024', '08:00:00', 4, 8)
,('20/04/2024', '14:00:00', 5, 8)
,('30/05/2024', '09:45:00', 6, 9)
,('15/06/2024', '16:15:00', 1, 9)
