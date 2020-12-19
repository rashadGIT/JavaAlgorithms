package test.ValidateBinaryTree;

import domain.BinarySearchTree;
import main.ValidateBinaryTree.ValidateBinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinaryTreeTest {

    @Test
    void TestCase1() {
        BinarySearchTree root  = BinarySearchTree.testTree();
        assertTrue(ValidateBinaryTree.validateBst(root));
    }
}