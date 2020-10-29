package test.MinMaxStack;

import domain.MinMaxStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxStackTest {
    public void testMinMaxPeek(int min, int max, int peek, MinMaxStack stack) {
        assertEquals(min, stack.getMin());
        assertEquals(max, stack.getMax());
        assertEquals(peek, stack.peek());
    }

    @Test
    public void TestCase1() {
        MinMaxStack stack = new MinMaxStack();
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(7);
        testMinMaxPeek(5, 7, 7, stack);
        stack.push(2);
        testMinMaxPeek(2, 7, 2, stack);
        assertEquals(stack.pop(), 2);
        assertEquals(stack.pop(), 7);
        testMinMaxPeek(5, 5, 5, stack);
    }
}