package test.InvertBinarySearchTree;

import domain.BinarySearchTree;
import domain.InvertedBinaryTree;
import main.InvertBinarySearchTree.InvertBinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvertBinarySearchTreeTest {
    InvertedBinaryTree invertedTree = new InvertedBinaryTree(1);

    @Test
    public void TestCase1() {
        BinarySearchTree tree = new BinarySearchTree(1);
        tree.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
        invertedTree.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
        InvertBinarySearchTree.invertBinarySearchTreeRecursive(tree);
        assertTrue(InvertedBinaryTree.compareBT(tree, invertedTree));
    }

    @Test
    public void TestCase2() {
        BinarySearchTree tree = new BinarySearchTree(1);
        tree.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
        InvertBinarySearchTree.invertBinarySearchTree(tree);
        InvertedBinaryTree invertedTree = new InvertedBinaryTree(1);
        invertedTree.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
        assertTrue(InvertedBinaryTree.compareBT(tree, invertedTree));
    }

    @Test
    public void TestCase3() {
        BinarySearchTree tree = new BinarySearchTree(1);
        tree.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
        invertedTree.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
        tree.invert();
        assertTrue(InvertedBinaryTree.compareBT(tree, invertedTree));
    }

}