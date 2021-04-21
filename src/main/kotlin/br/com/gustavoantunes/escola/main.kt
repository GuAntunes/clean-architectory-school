package br.com.gustavoantunes.escola

import br.com.gustavoantunes.escola.domain.aluno.AlunoBuilder

fun main(){
    val alunoBuilder = AlunoBuilder()
    alunoBuilder
        .comNomeCPFEmail("Gustavo", "12345678909", "gas.antunes84@gmail.com")
        .comTelefone("11","999999999")
        .criar()

}