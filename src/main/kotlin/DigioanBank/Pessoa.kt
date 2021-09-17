package DigioanBank

class Pessoa {
    var nome: String = "luan"

    var cpf: String = "123.122.113.17"
    private set

    constructor()

    fun nomeecpf() = "$nome + $cpf"

}
fun main(){
    val luan= Pessoa()


    println(luan.nomeecpf())

}