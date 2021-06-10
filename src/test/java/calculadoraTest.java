import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculadoraTest {

    @Test
    void main() {
    }

    @Test
    void adicion() {
        assertEquals(5.1f,calculadora.adicion(3.1f,2));
    }

    @Test
    void substraccion() {
        assertEquals(1.1f,calculadora.substraccion(3.1f,2));
    }

    @Test
    void multiplicacion() {
        assertEquals(6.2f,calculadora.multiplicacion(3.1f,2));
    }

    @Test
    void division() {
        assertEquals(1.55f,calculadora.division(3.1f,2));
    }


}