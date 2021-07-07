package one.digitalinovation.digionebank

class Pessoa {
    var nome = "Victor"
    var cpf = "489.183.707-17"
    private  set

    //inner class Endereco{
        //var rua: String = "Rua teste"
  //  }
}

fun main(){
    val victor = Pessoa()

    println(victor.nome)
    println(victor.cpf)

    //println(victor.Endereco)
}