package DigioanBank

class Pessoa {
    var nome: String = "luan"

    var cpf: String = "123.122.111.17"
    private set

}
fun main(){
    val luan= Pessoa()


    println(luan.nome)
    println(luan.cpf)

}