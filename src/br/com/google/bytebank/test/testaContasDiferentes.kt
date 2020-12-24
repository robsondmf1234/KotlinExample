import br.com.google.bytebank.model.Cliente
import br.com.google.bytebank.model.ContaCorrente
import br.com.google.bytebank.model.ContaPoupanca
import br.com.google.bytebank.model.Endereco

fun testaContasDiferentes() {
    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 123,
        endereco = Endereco(
            logradouro = "Rua:Pajé",
            numero = 80,
            bairro = "Centro",
            cidade = "Campinas",
            estado = "SP",
            cep = "11111-111",
            complemento = "n/a"
        )
    )

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )
    println("Endereço")
    println("Endereço: ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "111.111.111-11", senha = 123),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")

    println("Titular")
    println("Nome do Titular ${contaCorrente.titular.nome}")
    println("Cpf do Titular ${contaCorrente.titular.cpf}")
}