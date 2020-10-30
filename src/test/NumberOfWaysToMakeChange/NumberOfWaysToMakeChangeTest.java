package test.NumberOfWaysToMakeChange;

import main.NumberOfWaysToMakeChange.NumberOfWaysToMakeChange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfWaysToMakeChangeTest {

    @Test
    public void TestCase1() {
        int[] input = {1, 5};
        assertEquals(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(6, input), 2);
    }
}