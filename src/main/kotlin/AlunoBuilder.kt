import java.lang.IllegalStateException

class AlunoBuilder() {

    var aluno: Aluno? = null

    fun comNomeCPFEmail(nome: String, cpf: String, email: String): AlunoBuilder {
        this.aluno = Aluno(nome, CPF(cpf), Email(email))
        return this
    }

    fun comTelefone(ddd: String, numero: String): AlunoBuilder {
        this.aluno?.adiconarTelefone(ddd, numero)
        return this
    }

    fun criar(): Aluno? {
        return this.aluno
    }

}