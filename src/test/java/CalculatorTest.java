import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void sumTest_when2And4_then6() {
        //GIVEN
        int valueA = 2;
        int valueB = 4;

        //WHEN
        int actual = Calculator.sum(valueA, valueB);

        //THEN
        assertEquals(6, actual);
    }

}