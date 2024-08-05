USE db_EscolaIdiomas
GO

INSERT INTO tbl_aluno (nomeAluno, dataNascAluno, rgAluno, naturalidadeAluno)VALUES
('Paulo Santos', '2000/03/10', '822821220', 'SP'),
('Maria da Gloria', '1999/10/03', '452331230', 'SP'),
('Pedro Nogueira da silva', '1998/04/04', '235332119', 'SP'),
('Gilson Barros Silva', '1995/09/09', '34221111x', 'PE'),
('Mariana Barbosa Santos', '2001/10/10', '542221229', 'RJ'),
('Alessandro Pereira', '2003/10/11', '244022549', 'ES'),
('Aline Melo', '2001/10/08', '883650123', 'RJ')
 
INSERT INTO tbl_curso(nomeCurso, cargaHorariaCurso, valorCurso)VALUES
('Inglês', '2000', '356'),
('Alemão', '3000', '478'),
('Espanhol', '4000', '500')
 
INSERT INTO tbl_turma(nomeTurma, codCurso, horarioTurma)VALUES
('1IA', '1', '12:00:00'),
('1EC', '3', '18:00:00'),
('1IB', '1', '18:00:00'),
('1AA', '2', '19:00:00')
 
INSERT INTO tbl_matricula(dataMatricula, codAluno, codTurma)VALUES
('2015/10/03', '1', '1'),
('2014/05/04', '2', '1'),
('2015/05/04', '2', '4'),
('2012/05/03', '3', '1'),
('2016/03/03', '1', '3'),
('2015/05/07', '4', '2'),
('2015/07/05', '4', '3')