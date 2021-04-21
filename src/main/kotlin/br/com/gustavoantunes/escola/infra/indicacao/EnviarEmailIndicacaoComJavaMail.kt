package br.com.gustavoantunes.escola.infra.indicacao

import br.com.gustavoantunes.escola.domain.aluno.Aluno
import br.com.gustavoantunes.escola.domain.indicacao.EnviarEmailIndicacao

class EnviarEmailIndicacaoComJavaMail: EnviarEmailIndicacao {
    override fun enviarPara(aluno: Aluno) {
        TODO("Implementar lógica com a lib envio de email")
    }
}