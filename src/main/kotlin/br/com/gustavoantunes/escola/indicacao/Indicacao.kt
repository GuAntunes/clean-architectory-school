package br.com.gustavoantunes.escola.indicacao

import br.com.gustavoantunes.escola.aluno.Aluno
import java.time.LocalDateTime

class Indicacao(
    val indicado: Aluno,
    val indicante: Aluno,
){
    val dataIndicacao: LocalDateTime = LocalDateTime.now()
}