const http = require('http')
const fs = require('fs')
const porta = 5000

http.createServer((req, res) => {

    var beleza = [ {
        codigo: 1,
        nome: "esmalte",
        publicoAlvo: "mulher",
        quantEstoque: 19,
        descricao: "Frasco de esmalte azul, com 10ml",
        marca: "Colorama",
        preco: 4.99,
    },
    
    {
        codigo: 2,
        nome: "esmalte",
        publicoAlvo: "mulher",
        quantEstoque: 32,
        descricao: "Frasco de esmalte vermelho, com 8ml",
        marca: "Risque",
        preco: 6.20,
    },
    
    {
        codigo: 3,
        nome: "batom",
        publicoAlvo: "mulher",
        quantEstoque: 128,
        descricao: "Frasco de batom vermelho, com 5ml",
        marca: "Eudora",
        preco: 5.50,
    },
    
    {
        codigo: 4,
        nome: "Óleo para cabelo",
        publicoAlvo: "mulher",
        quantEstoque: 16,
        descricao: "Frasco de óleo de flores preciosas para cabelo, com 100ml",
        marca: "Elséve",
        preco: 32.99,
    },
    
    {
        codigo: 5,
        nome: "Finalizador para cabelo",
        publicoAlvo: "mulher",
        quantEstoque: 9,
        descricao: "Fluído reparador essential para cabelo, com 250ml",
        marca: "Braé",
        preco: 81.20,
    },
    
    {
        codigo: 6,
        nome: "Sabonete Puro Vegetal Alecrim",
        publicoAlvo: "mulher",
        quantEstoque: 40,
        descricao: "Barra de sabonete que promove agradável sensação enquanto limpa e deixa a pele macia e sedosa, com 90g cada.",
        marca: "Natura Tododia",
        preco: 29.90,
    },
    
    {
        codigo: 7,
        nome: "Hidratante Corporal",
        publicoAlvo: "mulher",
        quantEstoque: 32,
        descricao: "Recipiente que restaura a barreira protetora da pele, especialmente de peles secas e extrassecas, com 562ml.",
        marca: "CeraVe",
        preco: 107.90,
    },
    
    {
        codigo: 8,
        nome: "Máscara Nutritiva",
        publicoAlvo: "mulher",
        quantEstoque: 20,
        descricao: "Produto em pote que ajuda a estabelecer a reposição dos nutrientes primordiais para um cabelo saudável, com 500ml",
        marca: "CeraVe",
        preco: 107.90,
    },
    
    {
        codigo: 9,
        nome: "Gel de limpeza facial",
        publicoAlvo: "mulher",
        quantEstoque: 5,
        descricao: "Gel de Limpeza Facial Micelar Ácido Mandélico + Salicílico Botik 50g",
        marca: "Botik",
        preco: 24.20,
    },
    
    {
        codigo: 10,
        nome: "Creme multiprotetor",
        publicoAlvo: "mulher",
        quantEstoque: 29,
        descricao: "Creme Multiprotetor FPS40 25g",
        marca: "Make B.",
        preco: 71.90,
    },
    
    ]

    let belezaJson = JSON.stringify(beleza, null, 4);

    fs.writeFile('beleza.txt', belezaJson, (err) => {
        if (err) {
            console.error('Erro ao escrever o arquivo', err)
            res.writeHead(500, {'Content-Type': 'text/plain'})
            res.end('Erro ao escrever o arquivo')
        } else {
            console.log('Sucesso ao criar o arquivo')
            res.writeHead(200, {'Content-Type': 'text/plain'})
            res.end('Sucesso ao criar o arquivo')
        }

    })

}).listen(porta, () => {
    console.log(`Servidor rodando na porta: ${porta}.`)
})


