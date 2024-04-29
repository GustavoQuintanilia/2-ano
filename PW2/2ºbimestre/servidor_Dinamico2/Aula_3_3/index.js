//For 
const http = require("http")
const fs = require("fs")
const url = require("url")

const porta = 5000

const server = http.createServer((req, res) => {
    res.setHeader("Content-Type", "text/html");
    res.writeHead(200, {"Contenty-Type":"text/html"})



    // Realizar a Leitura
    let inicio = fs.readFileSync('inicio.html', (err, data)=> { 
        return data
    })

    let fim = fs.readFileSync('fim.html', (err, data)=> {   
        return data
    })

    res.write(`
        <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        </head>
    `);

    const urlInfo = url.parse(req.url, true)
    const base = parseInt(urlInfo.query.base)
    const expoente = parseInt(urlInfo.query.expoente)

    res.statusCode = 200

    if(isNaN(base) || isNaN(expoente)){

        res.write(inicio)
        res.write(fim)
        res.end()

    } else {
        let poten = 1;

        for(let i = 1; i <= expoente; i++ ){
            poten *=base 
        }

        res.end(`<h2> A ${expoente}º potência do número ${base} é: ${poten}.<h2>`)
        console.log(`A ${expoente}º potência do número ${base} é: ${poten}.`)

        
    }

})

server.listen(porta, () => {
    console.log(`Servidor rodando na porta: ${porta}`)
})
