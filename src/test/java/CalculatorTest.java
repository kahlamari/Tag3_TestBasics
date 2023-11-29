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

    @Test
    public void mulTest_when3And7_then21() {
        //GIVEN
        int valueA = 3;
        int valueB = 7;

        //WHEN
        int actual = Calculator.mul(valueA, valueB);

        //THEN
        assertEquals(21, actual);
    }

}