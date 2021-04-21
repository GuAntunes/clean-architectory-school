package br.com.gustavoantunes.escola.domain.aluno

import java.util.*
import kotlin.collections.ArrayList

class Aluno(
    val nome: String,
    val cpf: CPF,
    val email: Email
) {
    var telefones: MutableList<Telefone> = ArrayList()
        private set
        public get() = Collections.unmodifiableList(field)

    fun adiconarTelefone(ddd: String, numero: String) {
        this.telefones.add(Telefone(ddd,numero))
    }

}