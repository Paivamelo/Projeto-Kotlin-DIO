package one.digitalinovation.digionebank

class Gerente(nome: String, cpf: String, salario: Doble) : Funcionario(nome = nome, cpf = cpf, salario = salario){
        override fun calculoAuxilio(): Double = salario * 0.4
}