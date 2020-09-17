package test.BubbleSort;

import main.BubbleSort.BubbleSort;
import org.junit.jupiter.api.Test;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BubbleSortTest {

    @Test
    public void TestCase1() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        assertTrue(Util.compare(BubbleSort.bubbleSort(input), expected));
    }
}