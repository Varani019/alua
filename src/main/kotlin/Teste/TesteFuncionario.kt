package Teste

import DigioanBank.Funcionario
import DigioanBank.Pessoa
import java.math.BigDecimal

fun main(){
    val luan = Pessoa(nome = "luan " , cpf = "101.122.313.12")


    println(luan.nome)
    println(luan.cpf)

    val joao = Funcionario(nome = "joao", cpf = "19283928479", BigDecimal.valueOf(2000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}


