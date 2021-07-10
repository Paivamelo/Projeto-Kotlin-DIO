package one.digitalinovation.digionebank.testes

package one.digitalinovation.digionebank.Cliente

fun main() {
    val jose = Cliente(
        nome = "Jose",
        cpf = "123.123.456-77",
        cliente = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}