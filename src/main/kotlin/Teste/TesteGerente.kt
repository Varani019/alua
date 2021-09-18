package Teste

import DigioanBank.Funcionario
import DigioanBank.Gerente
import DigioanBank.ImprimirReladorioFuncionario

fun  main(){
    val Luan = Gerente(nome = "Luan", cpf = "121.123.143.15",5000.0)
    ImprimirReladorioFuncionario.imprimi(Luan)
}
