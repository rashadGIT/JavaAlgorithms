package test.SelectionSort;

import main.SelectionSort.SelectionSort;
import org.junit.jupiter.api.Test;
import util.Util;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SelectionSortTest {

    @Test
    public void TestCase1() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        assertTrue(Util.compare(SelectionSort.selectionSort(input), expected));
    }
}
