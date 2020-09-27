package test.BinarySearchTree;

import domain.BinaryTree;
import main.BinarySearchTree.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    int[] array = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
    int target = 33;

    @Test
    void TestCase1() {
        assertEquals(BinarySearchTree.binarySearch(array, target), 3);
    }

    @Test
    void TestCase2() {
        assertEquals(BinarySearchTree.binarySearchHelperRecursive(array, target, 0 , array.length - 1), 3);
    }

    @Test
    void TestCase3() {
        assertEquals(BinarySearchTree.binarySearchHelperLoop(array, target, 0, array.length - 1), 3);
    }

    @Test
    public void TestCase4() {
        BinaryTree root = BinaryTree.testTree();
        root.insert(12);
        assertEquals(root.right.left.left.value, 12);
        root.remove(10);
        assertFalse(root.contains(10));
        assertEquals(root.value, 12);
        assertTrue(root.contains(15));
    }

}