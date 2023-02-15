
import StaticClassesEnumsExceptions.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @BeforeAll
    public static void classSetup() {
        System.out.println("Before all method");
    }

    @AfterAll
    public static void classTearDown() {
        System.out.println("After all method");
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("Before each method");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("After each method");
    }

//    @Test
//    public void summaryTest(){
//       int a = 5;
//       int b = 6;
//       double expectedResult= 10;
//
//      double actualResult = Calculator.calculate(a,b, Calculator.Type.SUMMARY);
//
//      assertEquals(expectedResult, actualResult, "Summary result is incorrect");
//
//   } commented to run summaryParamsTest


    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 27, 87328732, -87328732})
    public void summaryParamsTest(int a) {

        int b = 6;
        double expectedResult = b + a;
        double actualResult = Calculator.calculate(a, b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, actualResult, "Summary result is incorrect");

    }

    @ParameterizedTest
    @EnumSource(Calculator.Type.class)
    public void calculationTypesTest(Calculator.Type type) {
        int a = 25;
        int b = 6;


        double actualResult = Calculator.calculate(a, b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult>0);
    }

    @Test
    public void divisionTest() {
        int a = 10;
        int b = 2;
        double expectedResult = 5;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.DIVISION);
        // assertNull(actualResult);
        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult, "Division result is incorrect");
        assertTrue(expectedResult == actualResult);
        assertTrue(actualResult > 0);
        assertFalse(actualResult == 0);


    }

    @Test
    @DisplayName("Nullpointer exception test")
    public void errorTest() {
        int a = 10;
        int b = 2;
        double expectedResult = 5;

        assertThrows(NullPointerException.class, () -> {
            Calculator.calculate(a, b, null);
        });
    }


}
