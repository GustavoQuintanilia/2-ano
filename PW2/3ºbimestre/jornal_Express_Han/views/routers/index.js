import express from 'express'

import path from 'path'

// importando o array de detalhes
import { dados } from '../../public/js/footerNot.js'


const router = express.Router();


  
  // Rotas para cada notícia
  router.get('/noticia1', (req, res) => {
    res.render('noticia1', {dados, currentPageId: 1})
  })
  
  router.get('/noticia2', (req, res) => {
    res.render('noticia2', {dados, currentPageId: 2})
  })
  
  router.get('/noticia3', (req, res) => {
    res.render('noticia3', {dados, currentPageId: 3})
  })
  
  router.get('/noticia4', (req, res) => {
    res.render('noticia4', {dados, currentPageId: 4})
  })
  
  router.get('/noticia5', (req, res) => {
    res.render('noticia5', {dados, currentPageId: 5})
  })

  export default router