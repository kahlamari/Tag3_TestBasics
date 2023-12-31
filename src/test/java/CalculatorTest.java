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

    @Test
    public void isEvenTest_when2_then_true(){
        //given
        int number = 2;

        //when
        boolean actual = Calculator.isEven(number);

        //then
        assertTrue(actual);
    }
    @Test
    public void isEvenTest_when3_then_false(){
        //given
        int number = 3;

        //when
        boolean actual = Calculator.isEven(number);

        //then
        assertFalse(actual);
    }


    @Test
    public  void  upperCaseTest_whenHello_thenHELLO(){

        // GIVEN
        String value = "Hello";

        //WHEN
        String string = Calculator.upperCase(value);

        // THEN
        assertEquals("HELLO", string);
    }


    @Test
    void isPositiveTest_when1_thenTrue() {
        // GIVEN
        int value = 1;

        // WHEN
        boolean actual = Calculator.isPositive(value);

        // THEN
        assertTrue(actual);
    }
    @Test
    void isPositiveTest_when0_thenFalse() {
        // GIVEN
        int value = 0;

        // WHEN
        boolean actual = Calculator.isPositive(value);

        // THEN
        assertFalse(actual);
    }
}