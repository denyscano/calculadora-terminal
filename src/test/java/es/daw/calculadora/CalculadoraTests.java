package es.daw.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {

    @Test
    public void testSumar() {
        double result = Calculadora.calcular(1, 2, 2);
        assertEquals(4.0, result);
    }

    @Test
    public void testRestar() {
        double result = Calculadora.calcular(2, 2, 2);
        assertEquals(0.0, result);
    }
}
