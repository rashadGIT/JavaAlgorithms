package test.BinaryTreeTraversal;

import domain.BinarySearchTree;
import main.BinaryTreeTraversal.BinaryTreeTraversal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTraversalTest {
    List<Integer> inOrder = Arrays.asList(1, 2, 5, 5, 10, 15, 22);
    List<Integer> preOrder = Arrays.asList(10, 5, 2, 1, 5, 15, 22);
    List<Integer> postOrder = Arrays.asList(1, 2, 5, 5, 22, 15, 10);

    @Test
    void TestCase1() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.left = new BinarySearchTree(5);
        tree.left.left = new BinarySearchTree(2);
        tree.left.left.left = new BinarySearchTree(1);
        tree.left.right = new BinarySearchTree(5);
        tree.right = new BinarySearchTree(15);
        tree.right.right = new BinarySearchTree(22);
        assertEquals(inOrder, BinaryTreeTraversal.inOrderTraverse(tree, new ArrayList<>()));
    }

    @Test
    void TestCase2() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.left = new BinarySearchTree(5);
        tree.left.left = new BinarySearchTree(2);
        tree.left.left.left = new BinarySearchTree(1);
        tree.left.right = new BinarySearchTree(5);
        tree.right = new BinarySearchTree(15);
        tree.right.right = new BinarySearchTree(22);
        assertEquals(preOrder, BinaryTreeTraversal.preOrderTraverse(tree, new ArrayList<>()));
    }

    @Test
    void TestCase3() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.left = new BinarySearchTree(5);
        tree.left.left = new BinarySearchTree(2);
        tree.left.left.left = new BinarySearchTree(1);
        tree.left.right = new BinarySearchTree(5);
        tree.right = new BinarySearchTree(15);
        tree.right.right = new BinarySearchTree(22);
        assertEquals(postOrder, BinaryTreeTraversal.postOrderTraverse(tree, new ArrayList<>()));
    }
}