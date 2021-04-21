package br.com.gustavoantunes.escola.infra.aluno

import br.com.gustavoantunes.escola.domain.aluno.Aluno
import br.com.gustavoantunes.escola.domain.aluno.AlunoRepository
import br.com.gustavoantunes.escola.domain.aluno.CPF
import java.lang.RuntimeException
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.SQLException

class AlunoJDBCRepository(val connection: Connection) : AlunoRepository {

    override fun matricular(aluno: Aluno) {
        try {
            val sql = "INSERT INTO ALUNO VALUES(?,?,?)"
            val ps = connection.prepareStatement(sql)
            ps.setString(1, aluno.cpf.numero)
            ps.setString(2, aluno.nome)
            ps.setString(3, aluno.email.endereco)
            ps.execute()

            val sqlTelefones = "INSERT INTO TELEFONE VALUES(?,?)"
            val psTelefones = connection.prepareStatement(sqlTelefones)
            aluno.telefones.forEach {
                ps.setString(1, it.ddd)
                ps.setString(2, it.numero)
                ps.execute()
            }
        } catch (e: SQLException) {
            throw RuntimeException(e)
        }
    }

    override fun buscarPorCPF(cpf: CPF): Aluno {
        TODO("Not yet implemented")
    }

    override fun listarTodosAlunosMatriculados(): List<Aluno> {
        TODO("Not yet implemented")
    }
}