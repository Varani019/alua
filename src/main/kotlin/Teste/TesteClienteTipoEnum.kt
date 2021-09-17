package Teste

import DigioanBank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.Descricao}")
    }
}