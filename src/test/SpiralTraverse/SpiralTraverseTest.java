package test.SpiralTraverse;

import main.SpiralTraverse.SpiralTraverse;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralTraverseTest {
    int[][] input =
            new int[][] {
                    {1, 2, 3, 4},
                    {12, 13, 14, 5},
                    {11, 16, 15, 6},
                    {10, 9, 8, 7},
            };
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

    @Test
    void TestCase1() {
        List<Integer> actual = SpiralTraverse.spiralTraverse(input);
        assertEquals(actual, expected);
    }
    @Test
    void TestCase2() {
        List<Integer> actual = SpiralTraverse.spiralTraverseRecursive(input);
        assertEquals(actual, expected);
    }
}
