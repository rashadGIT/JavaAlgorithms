package main.ValidateBinaryTree;

import domain.BinarySearchTree;

public class ValidateBinaryTree {
    public static void main(String[] args) {
        System.out.println(validateBst(BinarySearchTree.testTree()));
    }
    public static boolean validateBst(BinarySearchTree tree) {
        return validateBinarySearchTree(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validateBinarySearchTree(BinarySearchTree tree, int min, int max){
        if(tree.value < min || tree.value >= max){
            return false;
        }
        if(tree.left != null && !validateBinarySearchTree(tree.left, min,tree.value)){
            return false;
        }

        return tree.right == null || validateBinarySearchTree(tree.right, tree.value, max);
    }
}