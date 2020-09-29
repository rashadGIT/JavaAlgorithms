package test.BinaryTree;

import domain.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeClassTest {

    @Test
    public void TestCase1() {
        BinarySearchTree root = BinarySearchTree.testTree();
        root.remove(10);
        assertFalse(root.contains(10));
    }

    @Test
    public void TestCase2() {
        BinarySearchTree root = BinarySearchTree.testTree();
        root.insert(12);
        assertEquals(root.right.left.left.value, 12);
    }

    @Test
    public void TestCase3() {
        BinarySearchTree root = BinarySearchTree.testTree();
        root.insertRecursive(12);
        assertEquals(root.right.left.left.value, 12);
    }
    @Test
    public void TestCase4() {
        BinarySearchTree root = BinarySearchTree.testTree();
        root.insert(12);
        root.remove(10);
        assertEquals(root.value, 12);
    }
}
