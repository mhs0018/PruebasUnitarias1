package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Reto 1: Nombre vacio")
    public void testNombreVacio() {
        String nombreVacio = "";

        boolean resultado = validador.validarNombre(nombreVacio);

        assertFalse(resultado, "Error: El sistema rechazó el nombre");
    }

    @Test
    @DisplayName("Reto 2: Password justa")
    public void testPaswordJusta() {
        String password = "12345678";

        boolean resultado = validador.validarPassword(password);

        assertTrue(resultado, "La contraseña es aceptada");
    }

    @Test
    @DisplayName("Reto 3: Password corta")
    public void testPasswordCorta() {
        String password = "Amdmin";

        boolean resultado = validador.validarPassword(password);

        assertFalse(resultado, "Error: El sistema rechazó la contraseña");
    }

    @Test
    @DisplayName("Reto 4: Email sin arroba")
    public void testEmailSinArroba() {
        String email = "usuario.gmail.com";

        boolean resultado = validador.validarEmail(email);

        assertFalse(resultado, "Error: El sistema rechazó el email");
    }

    @Test
    @DisplayName("Reto 5: Edad Limite")
    public void testEdadLimite() {
        int edad = 16;
        boolean resultado = validador.validarEdad(edad);

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "La edad es correcta");
    }

}
