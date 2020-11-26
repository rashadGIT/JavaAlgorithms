package test.SingleCycleCheck;

import org.junit.jupiter.api.Test;
import main.SingleCycleCheck.SingleCycleCheck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SingleCycleCheckTest {
    int [] array = new int[] {2, 3, 1, -4, -4, 2};

    @Test
    public void TestCase1() {
        assertTrue(SingleCycleCheck.hasSingleCycle(array));
    }

    @Test
    public void TestCase2(){
        assertEquals(SingleCycleCheck.getNextIdx(0,array),2);
    }
}
