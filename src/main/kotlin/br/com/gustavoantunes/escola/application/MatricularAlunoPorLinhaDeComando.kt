package br.com.gustavoantunes.escola.application

import br.com.gustavoantunes.escola.infra.aluno.RepositorioDeAlunosEmMemoria
import br.com.gustavoantunes.escola.usecase.aluno.matricular.MatricularAluno
import br.com.gustavoantunes.escola.usecase.aluno.matricular.MatricularAlunoDTO

fun main() {
    val nome = "Gustavo Antunes"
    val cpf = "123456789-09"
    val email = "gustavo@gmail.com"

    val matricularAluno = MatricularAluno(RepositorioDeAlunosEmMemoria())
    matricularAluno.executa(MatricularAlunoDTO(nome, cpf, email))
}
