package test.BinarySearch;

import main.BinarySearch.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    int[] array = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
    int target = 33;

    @Test
    void TestCase1() {
        assertEquals(BinarySearch.binarySearch(array, target), 3);
    }

    @Test
    void TestCase2() {
        assertEquals(BinarySearch.binarySearchHelperRecursive(array, target, 0 , array.length - 1), 3);
    }

    @Test
    void TestCase3() {
        assertEquals(BinarySearch.binarySearchHelperLoop(array, target, 0, array.length - 1), 3);
    }


}