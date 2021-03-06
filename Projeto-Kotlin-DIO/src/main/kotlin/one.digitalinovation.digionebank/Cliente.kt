package one.digitalinovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: CleinteTipo,
    val senha: String
): Pessoa(nome,cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Tipo: ${clienteTipo.descicao}
       
        """.trimIndent()
}