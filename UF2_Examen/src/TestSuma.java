import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSuma {
    @Test
    public void testSuma() {
        Suma suma = new Suma(1, 2);
        assertEquals(3, suma.suma(1, 2));
    }

    @Test
    public void testSumaValorAbsolut() {
        assertEquals(3, Suma.sumaValorAbsolut(-1, 2));
    }

    @Test
    public void testGetNumero1() {
        Suma suma = new Suma(1, 2);
        assertEquals(1, suma.getNumero1());
    }
}
