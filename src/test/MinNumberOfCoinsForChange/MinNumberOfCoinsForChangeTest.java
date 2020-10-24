package test.MinNumberOfCoinsForChange;

import org.junit.jupiter.api.Test;
import main.MinNumberOfCoinsForChange.MinNumberOfCoinsForChange;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MinNumberOfCoinsForChangeTest {

    @Test
    public void TestCase1() {
        int[] input = {1, 5, 10};
        assertEquals(MinNumberOfCoinsForChange.minNumberOfCoinsForChange(7, input), 3);
    }
}
