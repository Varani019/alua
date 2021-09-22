package Teste

import DigioanBank.Autenticacao
import DigioanBank.Gerente
import DigioanBank.ImprimirReladorioFuncionario
import DigioanBank.Logavel

fun  main(){
    val Luan = Gerente(nome = "Luan", cpf = "121.123.143.15",5000.0, "luan123@gmail.com " , "senha123")
    ImprimirReladorioFuncionario.imprimi(Luan)

    Autenticacao().autenticacao(Luan)
    Autenticacao().autenticacao1(Luan)
}
