package test.BinaryTree;

import main.BinaryTree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    int[] array = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
    int target = 33;

    @Test
    void TestCase1() {
        assertEquals(BinaryTree.binarySearch(array, target), 3);
    }

    @Test
    void TestCase2() {
        assertEquals(BinaryTree.binarySearchHelperRecursive(array, target, 0 , array.length - 1), 3);
    }

    @Test
    void TestCase3() {
        assertEquals(BinaryTree.binarySearchHelperLoop(array, target, 0, array.length - 1), 3);
    }
}