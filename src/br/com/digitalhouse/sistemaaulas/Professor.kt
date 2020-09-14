package br.com.digitalhouse.sistemaaulas

class Professor(override val nome: String, override val sobrenome: String, val RD: String): Pessoa {

    fun fazerChamada() {
        println("Professor está fazendo a chamada.")
    }

    fun darAula() {
        println("Professor $nome $sobrenome está dando aula.")
    }

}