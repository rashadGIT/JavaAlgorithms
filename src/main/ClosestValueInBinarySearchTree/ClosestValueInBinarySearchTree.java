package main.ClosestValueInBinarySearchTree;

import domain.BinaryTree;

public class ClosestValueInBinarySearchTree {

    public static void main(String[] args) {
        int target = 12;
        BinaryTree root = BinaryTree.testTree();

        System.out.println(findClosestValueInBstRecursion(root,target,root.value));
        System.out.println(findClosestValueInBstWhileLoop(root,target,root.value));
        System.out.println(findClosestValueInBstForLoop(root,target,root.value));
    }

    public static int findClosestValueInBstRecursion(BinaryTree tree, int target, int closest){
        if(Math.abs(target - closest) > Math.abs(target - tree.value)){
            closest = tree.value;
        }
        if(target < tree.value && tree.left != null){
            return findClosestValueInBstRecursion(tree.left, target, closest);
        }else if(target > tree.value && tree.right !=null){
            return findClosestValueInBstRecursion(tree.right, target, closest);
        }
        return closest;
    }

    public static int findClosestValueInBstWhileLoop(BinaryTree tree, int target, int closest){
        BinaryTree current = tree;
        while (current != null){
            if(Math.abs(target - closest) > Math.abs(target - current.value)){
                closest = current.value;
            }
            if(target < current.value){
                current = current.left;
            }else if(target > current.value){
                current = current.right;
            } else {
                break;
            }
        }
        return closest;
    }

    public static int findClosestValueInBstForLoop(BinaryTree tree, int target, int closest){
        BinaryTree current = tree;
        for (int i = 0; current != null; i++) {
            if(Math.abs(target - closest) > Math.abs(target - current.value)){
                closest = current.value;
            }
            if(target < current.value){
                current = current.left;
            }else if(target > current.value){
                current = current.right;
            } else {
                break;
            }
        }
        return closest;
    }
}
