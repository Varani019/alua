package Teste

import DigioanBank.Analista
import DigioanBank.ImprimirReladorioFuncionario

fun main(){

    val joao = Analista(nome = "joao", cpf = "19283928479", 2000.0)
    ImprimirReladorioFuncionario.imprimi(joao)

}



