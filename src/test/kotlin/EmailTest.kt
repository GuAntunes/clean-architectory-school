import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@DisplayName("When create a Email")
internal class EmailTest {

    @Nested
    @DisplayName("When execute")
    inner class Execute{

        @Test
        fun `Should not create a email with invalid address`() {
            assertThrows<IllegalArgumentException> {
                Email("")
            }

            assertThrows<IllegalArgumentException> {
                Email("emailinvalido.com")
            }
        }

        @Test
        fun `Should create a email with valid address`() {
            val email = Email("gustavosilva@gmail.com.br")
            assertEquals(email.endereco, "gustavosilva@gmail.com.br")
        }
    }
}