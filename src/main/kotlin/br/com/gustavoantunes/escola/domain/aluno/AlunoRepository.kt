package br.com.gustavoantunes.escola.domain.aluno

interface AlunoRepository {

    fun matricular(aluno: Aluno)
    fun buscarPorCPF(cpf: CPF): Aluno
    fun listarTodosAlunosMatriculados(): List<Aluno>
}