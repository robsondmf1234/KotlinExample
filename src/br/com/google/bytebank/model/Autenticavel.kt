package br.com.google.bytebank.model

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}