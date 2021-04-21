package br.com.gustavoantunes.escola.usecase.aluno.matricular

import br.com.gustavoantunes.escola.domain.aluno.AlunoRepository

class MatricularAluno(
    val repositorio: AlunoRepository
) {

    fun executa(alunoDTO: MatricularAlunoDTO){
        val novoAluno = alunoDTO.toAluno()
        repositorio.matricular(novoAluno)
    }

}