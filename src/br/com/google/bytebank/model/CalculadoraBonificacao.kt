package br.com.google.bytebank.model

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

    //Exemplo didático
    //Método pode receber qualquer tipo de Classe
 //   fun registra(funcionario: Any){
 //       //Valida se o obejto recebido funcionario é do tipo da classe Funcionario
 //       if (funcionario is Funcionario){
 //           this.total += funcionario.bonificacao
 //       }
 //   }


}