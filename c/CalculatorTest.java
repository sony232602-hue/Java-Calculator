import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(30, calculator.add(20, 10));
    }

    @Test
    public void testSubtraction() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(200, calculator.multiply(20, 10));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(20, 10));
    }

    @Test
    public void testModulus() {
        assertEquals(0, calculator.modulus(20, 10));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(20, 0)
        );
    }
}