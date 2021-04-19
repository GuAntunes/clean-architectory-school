import java.time.LocalDateTime

class Indicacao(
    val indicado: Aluno,
    val indicante: Aluno,
){
    val dataIndicacao: LocalDateTime = LocalDateTime.now()
}