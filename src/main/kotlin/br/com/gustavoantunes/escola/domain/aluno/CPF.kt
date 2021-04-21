package br.com.gustavoantunes.escola.domain.aluno

import java.lang.IllegalArgumentException

class CPF(val numero: String) {
    init {
        if(numero.matches(Regex("/(\\d{3})(\\d{3})(\\d{3})(\\d{2})/"))){
            throw IllegalArgumentException("br.com.gustavoantunes.escola.aluno.CPF inválido!")
        }
    }
}