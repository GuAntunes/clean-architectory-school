package br.com.gustavoantunes.escola.domain.indicacao

import br.com.gustavoantunes.escola.domain.aluno.Aluno

interface EnviarEmailIndicacao {

    fun enviarPara(aluno: Aluno)
}