// Objetos

var aluno1 = {
    matricula: 7627364,
    nome: 'Danilo Ferreira',
    curso: 'Bootcamp Front End',
    ativo: true
};

console.log(aluno1.nome);

aluno1.dataNascimento = '03/07/1985';
console.log(aluno1.dataNascimento);

delete aluno1.dataNascimento;

// Underfined e null

var x;
var y = null;

// Arrays

var frutas = ['Banana','Laranja','Maçã'];


// Objeto com os dados do G. Quintanilia
var quintanilia = {
    matricula: 230096,
    nome: 'Gustavo Quintanilia',
    curso: 'Desenvolvimento de Sistemas',
    ativo: true
}

console.log(quintanilia.nome);
console.log(quintanilia.matricula);
console.log(quintanilia.curso);
console.log(quintanilia.ativo);

quintanilia.dataNascimento = '21/12/2007';
console.log(quintanilia.dataNascimento);

delete quintanilia.dataNascimento;

// Objeto com os dados do Vittor
var vittor = {
    matricula: 230043,
    nome: 'Vittor N. Sirqueira',
    curso: 'Desenvolvimento de Sistemas',
    ativo: true
};

console.log(vittor.nome);
console.log(vittor.matricula);
console.log(vittor.curso);
console.log(vittor.ativo);
vittor.dataNascimento = '01/06/2007';
console.log(vittor.dataNascimento);

delete vittor.dataNascimento;

