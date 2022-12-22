const express = require('express');
const app = express();
const PORTA = 8888;

app.listen(PORTA,() =>{
    console.log(`Servidor Iniciado na porta ${PORTA}`);
  });

  app.get ('/get', function(req,res) {
    res.send("HELLO WORLD!")

  });

  