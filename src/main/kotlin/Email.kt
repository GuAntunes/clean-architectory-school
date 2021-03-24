import java.lang.IllegalArgumentException

class Email(
    val endereco: String
    ) {

    init {
        Regex("a[bc]+d?")
        if(endereco == null || !endereco.matches(Regex("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?\$/i")))
            throw  IllegalArgumentException("E-mail inválido!")
    }

}