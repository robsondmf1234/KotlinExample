import br.com.google.bytebank.model.Cliente
import br.com.google.bytebank.model.ContaPoupanca
import br.com.google.bytebank.model.Endereco

fun main() {

    var totalContas = 0

    val alex = Cliente(
        nome = "Alex",
        cpf = "111111111-11",
        endereco = Endereco("Rua:Pajé"),
        senha = 123
    )
    ContaPoupanca(alex, 12345)

    println("Total de contas:${totalContas}")

    //val cliente = Cliente(nome = "FRan",cpf = "111.111.11-11",senha = 123)
   testaContasDiferentes()

}

