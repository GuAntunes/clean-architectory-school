package br.com.gustavoantunes.escola.domain.indicacao

import br.com.gustavoantunes.escola.domain.aluno.Aluno
import java.time.LocalDateTime

class Indicacao(
    val indicado: Aluno,
    val indicante: Aluno,
){
    val dataIndicacao: LocalDateTime = LocalDateTime.now()
}