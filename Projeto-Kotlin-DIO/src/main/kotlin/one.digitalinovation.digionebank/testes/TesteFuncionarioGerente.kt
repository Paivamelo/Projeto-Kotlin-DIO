package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Gerente



fun main(){
    val maria = Analista(nome: "Maria", cpf: "88564560607", salario: 5000.0, senha: "senha123")
    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}

