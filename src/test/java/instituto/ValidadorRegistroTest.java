package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {
    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Reto 1: Nombre vacío")
    public void testNombreValido() {
            // Ejecutamos la lógica con un nombre correcto
            boolean resultado = validador.validarNombre("Carlos");

            // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
            assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
        }

        // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    }
