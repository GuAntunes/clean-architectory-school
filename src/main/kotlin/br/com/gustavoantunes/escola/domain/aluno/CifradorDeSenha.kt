package br.com.gustavoantunes.escola.domain.aluno

interface CifradorDeSenha {

    fun cifrarSenha(senha: String)
    fun validarSenhaCifrada(senhaCifrada: String, senha: String)
}