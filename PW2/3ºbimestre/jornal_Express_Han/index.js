// import modulo externo 
import express from 'express'

// import modulo interno
import path from 'path'

// iniciei o express
const app = express()

// import modulo express-handlebars
import exphbs from 'express-handlebars'

import router from "./views/routers/index.js"

// importando o array de detalhes
import { detalhes } from './public/js/detalhes1.js'

// -------------------------------------
const hbs = exphbs.create({
  helpers: {
    eq: function (a, b) {
      return a == b;
    }
  }
})
//-------------------------------------------------
app.engine('handlebars', hbs.engine)
app.set('view engine', 'handlebars')
app.use(express.static('public'))

  app.get('/', (req, res) => {
    res.render('index', { detalhes })
  })

  app.use('/', router)

// Inicia o servidor
app.listen(5000, () => console.log('Rodando na porta 5000'))