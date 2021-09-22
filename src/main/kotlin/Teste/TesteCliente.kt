package Teste

import DigioanBank.Autenticacao
import DigioanBank.Cliente
import DigioanBank.ClienteTipo

fun main() {
    val Gabriel= Cliente(
        nome = "Gabriel",
        cpf = "123.124.124.12",
        Clientetipo = ClienteTipo.pf,
        senha = "senha1234",
        Email = "lua123"
        )
    println(Gabriel)

    Autenticacao().autenticacao(Gabriel)
    Autenticacao().autenticacao1(Gabriel)
}