package test.Fibonacci;

import org.junit.jupiter.api.Test;
import main.Fibonacci.Fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void TestCase1() {
        assertEquals(701408733, Fibonacci.getNthFibonacci(45));
    }
}
