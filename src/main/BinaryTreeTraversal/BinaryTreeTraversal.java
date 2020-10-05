package main.BinaryTreeTraversal;

import domain.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.left = new BinarySearchTree(5);
        tree.left.left = new BinarySearchTree(2);
        tree.left.left.left = new BinarySearchTree(1);
        tree.left.right = new BinarySearchTree(5);
        tree.right = new BinarySearchTree(15);
        tree.right.right = new BinarySearchTree(22);
        List<Integer> array = new ArrayList<>();
        System.out.println(inOrderTraverse(tree,array));
    }

    public static List<Integer> inOrderTraverse(BinarySearchTree tree, List<Integer> array) {
        if (tree != null) {
            inOrderTraverse(tree.left, array);
            array.add(tree.value);
            inOrderTraverse(tree.right,array);
        }
        return array;
    }

    public static List<Integer> preOrderTraverse(BinarySearchTree tree, List<Integer> array) {
        if(tree != null){
            array.add(tree.value);
            preOrderTraverse(tree.left, array);
            preOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> postOrderTraverse(BinarySearchTree tree, List<Integer> array) {
        if(tree != null){
            postOrderTraverse(tree.left, array);
            postOrderTraverse(tree.right, array);
            array.add(tree.value);
        }
        return array;
    }
}