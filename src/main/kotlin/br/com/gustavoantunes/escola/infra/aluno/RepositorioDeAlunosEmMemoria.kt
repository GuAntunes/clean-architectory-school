package br.com.gustavoantunes.escola.infra.aluno

import br.com.gustavoantunes.escola.domain.aluno.Aluno
import br.com.gustavoantunes.escola.domain.aluno.AlunoRepository
import br.com.gustavoantunes.escola.domain.aluno.CPF
import java.util.*
import kotlin.collections.ArrayList

class RepositorioDeAlunosEmMemoria: AlunoRepository{

    private val matriculados = ArrayList<Aluno>()

    override fun matricular(aluno: Aluno) {
        matriculados.add(aluno)
    }

    override fun buscarPorCPF(cpf: CPF): Aluno {
        return this.matriculados.filter {
            it.cpf.numero.equals(cpf.numero)
        }.first()
    }

    override fun listarTodosAlunosMatriculados(): List<Aluno> {
        return Collections.unmodifiableList(this.matriculados)
    }

}