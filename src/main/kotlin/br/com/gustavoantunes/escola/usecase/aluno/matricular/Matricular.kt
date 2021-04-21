package br.com.gustavoantunes.escola.usecase.aluno.matricular

import br.com.gustavoantunes.escola.domain.aluno.AlunoRepository

class Matricular(
    val repositorio: AlunoRepository
) {

    fun matricular(alunoDTO: MatricularAlunoDTO){
        val novoAluno = alunoDTO.toAluno()
        repositorio.matricular(novoAluno)
    }

}