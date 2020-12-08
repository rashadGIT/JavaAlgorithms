package test.MinHeap;

import domain.MinHeap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MinHeapTest {

    @Test
    public void TestCase1() {
        MinHeap minHeap = new MinHeap(new ArrayList<>(Arrays.asList(48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41)));
        minHeap.insert(76);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertEquals(-5, minHeap.peek());
        assertEquals(-5, minHeap.remove());
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertEquals(minHeap.peek(), 2);
        assertEquals(minHeap.remove(), 2);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertEquals(minHeap.peek(), 6);
        minHeap.insert(87);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
    }

    private boolean isMinHeapPropertySatisfied(List<Integer> array) {
        for (int currentIdx = 1; currentIdx < array.size(); currentIdx++) {
            int parentIdx = (currentIdx - 1) / 2;
            if (parentIdx < 0) {
                return true;
            }
            if (array.get(parentIdx) > array.get(currentIdx)) {
                return false;
            }
        }

        return true;
    }
}
