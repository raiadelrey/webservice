const express = require ('express');
const router = express.Router();


router

.get("/jogos", (req,res) => {
    // implementação de excução de busca
    console.log("Busca")
})

.get("/jogos/:id",(req, res) =>{
    //implementação de execução de busca de apenas um item
    console.log("Busca específica")
})
.post("/jogos" ,(req, res) => {
    //implementação de execução de cadastro 
    console.log("Cadastro");
})
.put ("/jogos/:id" ,(req, res) => {
    //implementação de execução de atualização
    console.log("Update");
})
.delete ("/jogos/:id" ,(req, res) => {
    //implementação de execução de atualização
    console.log("Delete")
})

module.exports = router;

