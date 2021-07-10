package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Pessoa

fun main(){
    val victor = Pessoa(nome = "Victor", cpf = "88564560607")
    println(victor.nome)
    println(victor.cpf)

    val joao = Funcionario(nome: "Victor", cpf: "88564560607", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}