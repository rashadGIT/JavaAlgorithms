package test.MaxSubsetSumNoAdjacent;

import main.MaxSubsetSumNoAdjacent.MaxSubsetSumNoAdjacent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSubsetSumNoAdjacentTest {
    int[] input = {75, 105, 120, 75, 90, 135};
    int actual = 330;

    @Test
    public void TestCase1() {
        assertEquals(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input), actual);
    }

    @Test
    public void TestCase2() {
        assertEquals(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent2(input), actual);
    }
}
