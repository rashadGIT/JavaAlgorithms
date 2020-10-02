package test.ClosestValueInBinarySearchTree;

import domain.BinarySearchTree;
import main.ClosestValueInBinarySearchTree.ClosestValueInBinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClosestValueInBinarySearchTreeTest {

    int expected = 13;
    int target = 12;
    BinarySearchTree root = BinarySearchTree.testTree();

    @Test
    public void TestCase1() {
        int actual = ClosestValueInBinarySearchTree.findClosestValueInBstRecursion(root, target, root.value);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        int actual = ClosestValueInBinarySearchTree.findClosestValueInBstWhileLoop(root, target, root.value);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        int actual = ClosestValueInBinarySearchTree.findClosestValueInBstForLoop(root, target, root.value);
        assertEquals(expected, actual);
    }
}
