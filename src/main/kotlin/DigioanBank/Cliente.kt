package DigioanBank

class Cliente(
        nome: String,
        cpf: String,
        val Clientetipo:ClienteTipo,
        val senha:String,
        val Email:String
): Pessoa(nome, cpf ),Logavel,Email {
    override fun login(): Boolean= "senha1234" == senha
    override fun email(): Boolean = "lua123" == Email

    override fun toString(): String = """
        nome $nome 
        cpf $cpf
        tipo ${Clientetipo.Descricao}
    """.trimIndent()


}