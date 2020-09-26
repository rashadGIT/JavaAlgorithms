package test.LongestPeak;

import main.LongestPeak.LongestPeak;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPeakTest {

    @Test
    public void TestCase1() {
        int[] input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        assertEquals(6, LongestPeak.longestPeak(input));
    }
}