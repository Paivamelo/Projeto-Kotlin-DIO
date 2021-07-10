package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = "10")

    val banco2 = digiOneBank.copy(nome = "Banco2")
    println(banco2.info())
}