import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculadoraTest {

    @Test
    void main() {
    }

    @Test
    void adicion() {
        assertEquals(5.1,calculadora.adicion(3.1,2));
    }

    @Test
    void substraccion() {
        assertEquals(1.1,calculadora.substraccion(3.1,2));
    }

    @Test
    void multiplicacion() {
        assertEquals(6.2,calculadora.multiplicacion(3.1,2));
    }

    @Test
    void division() {
        assertEquals(1.55,calculadora.division(3.1,2));
    }


}