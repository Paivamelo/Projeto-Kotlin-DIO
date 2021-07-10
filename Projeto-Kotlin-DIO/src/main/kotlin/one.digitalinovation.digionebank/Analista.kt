package one.digitalinovation.digionebank

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: double): Funcionario(nome, cpf, salario){
    override fun calculoAuxilio() = salario * 0.1


}