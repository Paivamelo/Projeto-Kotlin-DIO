package one.digitalinovation.digionebank

class Pessoa {
    var nome = "Victor"
    var cpf = "489.183.707-17"
    private  set

    constructor()

    fun unirNomeCpf() = "$nome e $cpf"

    //inner class Endereco{
        //var rua: String = "Rua teste"
  //  }
}

fun main(){
    val victor = Pessoa()

    println(victor.unirNomeCpf())

    //println(victor.Endereco)
}