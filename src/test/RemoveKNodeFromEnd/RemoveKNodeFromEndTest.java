package test.RemoveKNodeFromEnd;

import main.RemoveKNodeFromEnd.RemoveKNodeFromEnd;
import org.junit.jupiter.api.Test;

import domain.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveKNodeFromEndTest {

    @Test
    public void TestCase1() {
        LinkedList test = new LinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 2, 3, 4, 5, 7, 8, 9};
        RemoveKNodeFromEnd.removeKthNodeFromEnd(test, 4);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    public boolean compare(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
