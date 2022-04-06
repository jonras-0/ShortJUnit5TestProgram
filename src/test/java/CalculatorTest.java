import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("multiplication")
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(5, 3), "5 * 3 should equal 15");
    }

    @Test
    @DisplayName("Power of.")
    void testPowerOf() {
        Calculator calculator = new Calculator();
        assertAll(
                ()-> assertEquals(1, calculator.powerOf(2, 0), "2 to the power of 0 should equal 1"),
                ()-> assertEquals(8, calculator.powerOf(2,3),"2 to the power of 3 should equal 8"),
                ()-> assertEquals(16, calculator.powerOf(2, 4), "2 to the power of 4 should equal 16"));
    }
}