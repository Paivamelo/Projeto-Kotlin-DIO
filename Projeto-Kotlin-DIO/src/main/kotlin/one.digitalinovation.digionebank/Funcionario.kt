package one.digitalinovation.digionebank

import  java.math.BigDecimal

abstract class Funcionario (
      nome: String,
      cpf: String,
    val salario: double
): Pessoa(nome, cpf){
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${(calculoAuxilio()}
        """.trimIndent()
}