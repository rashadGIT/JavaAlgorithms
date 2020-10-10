package test.MinHeightBinaryTree;

import domain.BinarySearchTree;
import main.MinHeightBinaryTree.MinHeightBinaryTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static main.ValidateBinaryTree.ValidateBinaryTree.validateBst;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MinHeightBinaryTreeTest {
    List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
    BinarySearchTree tree = MinHeightBinaryTree.minHeightBinarySearchTree(array);

    @Test
    public void TestCase1() {
        assertTrue(validateBst(tree));
    }

    @Test
    public void TestCase2() {
        assertEquals(4, BinarySearchTree.getTreeHeight(tree));
    }

    @Test
    public void TestCase3() {
        List<Integer> inOrder = BinarySearchTree.inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        assertEquals(inOrder, expected);
    }

}