package test.MonotonicArray;

import main.MonotonicArray.MonotonicArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MonotonicArrayTest {
    int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};

    @Test
    public void TestCase1() {
        assertTrue(MonotonicArray.isMonotonic(array));
    }

    @Test
    public void TestCase2() {
        assertTrue(MonotonicArray.isMonotonic2(array));
    }
}
