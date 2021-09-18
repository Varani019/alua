package DigioanBank

import java.math.BigDecimal

class Funcionario(
    override var nome: String,
    override var cpf: String,
    val salario: BigDecimal,

    ):Pessoa(nome, cpf) {

}