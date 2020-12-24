package br.com.google.bytebank.test

fun testeAlias(){

    val palavra : kotlin.String = "Kotlin"
    //val palavraNova: StringJava = StringJava("Java")
    val palavraNova: java.lang.String = java.lang.String("Java")

    println("Java: ${palavraNova}")

    println("Kotlin: ${palavra}")

}