package one.digitalinovation.digionebank

class Pessoa {
    var nome = "Victor"
    var cpf = "489.183.707-17"
}

fun main(){
    val victor = Pessoa()

    println(victor.nome)
    println(victor.cpf)
}