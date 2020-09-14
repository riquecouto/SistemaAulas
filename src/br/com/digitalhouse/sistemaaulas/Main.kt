package br.com.digitalhouse.sistemaaulas

fun main(){
    val aluno1 = Aluno("Joao", "Pedro", "AB122304")
    val aluno2 = Aluno("Laura", "Alice", "AA22060")
    val aluno3 = Aluno("Heitor", "Silva", "AA24560")

    val materia1 = Materia("POO")
    val materia2 = Materia("GIT")

    val aula1 = Aula(materia1, 1000, 1400)
    val aula2 = Aula(materia2, 1400, 1800)

    val curso = Curso("Kotlin Banco")
    curso.listaAulas.add(aula1)
    curso.listaAulas.add(aula2)

    val turma1 = Turma("Turma A", curso)
}