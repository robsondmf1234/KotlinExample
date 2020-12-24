import br.com.google.bytebank.model.Cliente
import br.com.google.bytebank.model.ContaCorrente
import br.com.google.bytebank.model.ContaPoupanca
import br.com.google.bytebank.model.Endereco

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val jao = Cliente(
        "Joao",
        "111.111.111-11",
        endereco = Endereco(),
        senha = 123
    )
    val contaJoao = ContaCorrente(jao, 1002)
    contaJoao.titular.nome = "João"

    val maria= Cliente(
        nome = "Maria",
        cpf = "111.111.111-11",
        senha = 123
    )
    var contaMaria = ContaPoupanca(maria, 1003)
    contaMaria.titular.nome= "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}