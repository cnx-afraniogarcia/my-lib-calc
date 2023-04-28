import org.example.Calculadora;
import org.example.CalculadoraImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraImplTest {

    private Calculadora cal = new CalculadoraImpl();
    private double x = 10;
    private double y = 5;
    private double z = -7;
    private double h = 0;

    @Test
    void somaDois() {
        Assertions.assertTrue(15 == cal.soma(x, y));
    }

    @Test
    void somaTres() {
        Assertions.assertTrue(8 == cal.soma(x, y, z));
    }

    @Test
    void somaArray() {
        double[] v = {1,2,5,7};
        Assertions.assertTrue(15 == cal.soma(v));
    }

    @Test
    void somaArrayVazio() {
        double[] v = {};
        Assertions.assertThrows(RuntimeException.class, () -> cal.soma(v));
    }

    @Test
    void subtraiDois() {
        Assertions.assertTrue(5 == cal.sub(x, y));
    }

    @Test
    void subtraiTres() {
        Assertions.assertTrue(12 == cal.sub(x, y, z));
    }

    @Test
    void subtraiArray() {
        double[] v = {1,2,5,7};
        Assertions.assertTrue(-13 == cal.sub(v));
    }

    @Test
    void subtraiArrayVazio() {
        double[] v = {};
        Assertions.assertThrows(RuntimeException.class, () -> cal.sub(v));
    }

    @Test
    void multiplicaDois() {
        Assertions.assertTrue(50 == cal.mult(x, y));
    }

    @Test
    void multiplicaTres() {
        Assertions.assertTrue(-350 == cal.mult(x, y, z));
    }

    @Test
    void multiplicaArray() {
        double[] v = {1,2,5,7};
        Assertions.assertTrue(70 == cal.mult(v));
    }

    @Test
    void multiplicaArrayVazio() {
        double[] v = {};
        Assertions.assertThrows(RuntimeException.class, () -> cal.mult(v));
    }

    @Test
    void divideDois() {
        Assertions.assertTrue(2 == cal.div(x, y));
    }

    @Test
    void dividePorZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> cal.div(x , h));
    }

}
