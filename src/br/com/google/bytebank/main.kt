import br.com.google.bytebank.model.*

fun main() {

    val fran = object :Autenticavel{
        val nome: String = "Fran"
        val cpf: String = "111111111-11"
        val senha: Int = 123

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("Nome: ${fran.nome}")
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran,123)

    val alex = Cliente(
        nome = "Alex",
        cpf = "111111111-11",
        endereco = Endereco("Rua:Pajé"),
        senha = 123
    )

    val contaPoupanca = ContaPoupanca(alex, 12345)
    val contaCorrente = ContaCorrente(alex, 123456)

    //val cliente = Cliente(nome = "FRan",cpf = "111.111.11-11",senha = 123)
    testaContasDiferentes()

    println("Total de contas:${totalContas}")
}

