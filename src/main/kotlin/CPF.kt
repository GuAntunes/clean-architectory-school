import java.lang.IllegalArgumentException

class CPF(val numero: String) {
    init {
        if(numero == null || numero.matches(Regex("/(\\d{3})(\\d{3})(\\d{3})(\\d{2})/"))){
            throw IllegalArgumentException("CPF inválido!")
        }
    }
}