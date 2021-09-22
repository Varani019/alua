package DigioanBank

 class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val Email: String,
    val senha: String

) : Funcionario(nome = nome, cpf= cpf, salario= salario,), Logavel,Email {
     override fun calculoAuxilio(): Double = salario * 0.4

     override fun login(): Boolean = "senha123" == senha
     override fun email(): Boolean = "luan123@gmail.com" == Email


 }