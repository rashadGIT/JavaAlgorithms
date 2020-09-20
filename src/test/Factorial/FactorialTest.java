package test.Factorial;

import main.Factorial.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    int num = 10;

    @Test
    void TestCase1() {
        assertEquals(3628800, Factorial.factorial(num));
    }
}
