package br.com.gustavoantunes.escola.usecase.aluno.matricular

import br.com.gustavoantunes.escola.domain.aluno.Aluno
import br.com.gustavoantunes.escola.domain.aluno.AlunoBuilder
import br.com.gustavoantunes.escola.domain.aluno.CPF
import br.com.gustavoantunes.escola.domain.aluno.Email

class MatricularAlunoDTO(
    val nome: String,
    val cpf: String,
    val email: String
) {
    fun toAluno(): Aluno {
        return Aluno(nome, CPF(cpf), Email(email))
    }
}
