class Aluno(
    val nome: String,
    val cpf: CPF,
    val email: Email
) {
    private var telefones: MutableList<Telefone> = ArrayList()

    public fun adiconarTelefone(ddd: String, numero: String) {
        this.telefones.add(Telefone(ddd,numero))
    }

}