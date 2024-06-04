//import modulo externo 
import express from'express'

//import modulo interno
import path from 'path'

// iniciei o express
const app = express()

app.use(express.static('public'))


// Acessar o index.html 
app.get('/', function (req, res) {
    let end = path.resolve('./view/index.html')
    res.sendFile(end)
})

// Acessar o noticia1.html
app.get('/noticia1', function (req, res) {
    let not1 = path.resolve('./view/noticia1.html')
    res.sendFile(not1)
})

// Acessar o noticia2.html
app.get('/noticia2', function (req, res) {
    let not2 = path.resolve('./view/noticia2.html')
    res.sendFile(not2)
})

// Acessar o noticia3.html
app.get('/noticia3', function (req, res) {
    let not3 = path.resolve('./view/noticia3.html')
    res.sendFile(not3)
})

// Acessar o noticia4.html
app.get('/noticia4', function (req, res) {
    let not4 = path.resolve('./view/noticia4.html')
    res.sendFile(not4)
})

// Acessar o noticia5.html
app.get('/noticia5', function (req, res) {
    let not5 = path.resolve('./view/noticia5.html')
    res.sendFile(not5)
})




app.listen(5000, ()=>console.log("Rodando na porta 5000"))

