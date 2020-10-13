package test.KadaneAlgorithm;

import main.KadaneAlgorithm.KadaneAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KadaneAlgorithmTest {

    @Test
    public void TestCase1() {
        int[] input = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        assertEquals(KadaneAlgorithm.kadaneAlgorithm(input), 19);
    }

}