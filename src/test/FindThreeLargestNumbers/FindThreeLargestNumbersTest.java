package test.FindThreeLargestNumbers;

import main.FindThreeLargestNumbers.FindThreeLargestNumbers;
import org.junit.jupiter.api.Test;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FindThreeLargestNumbersTest {

    @Test
    void TestCase1() {
        int[] expected = {18, 141, 541};
        int[] array = new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        assertTrue(Util.compare(FindThreeLargestNumbers.findThreeLargestNumbers(array),expected));
    }
}