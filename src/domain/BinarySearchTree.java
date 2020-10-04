package domain;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    public int value;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public BinarySearchTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinarySearchTree insertRecursive(int value) {
        if(value < this.value) {
            if(left == null){
                left = new BinarySearchTree(value);
            } else {
                return left.insertRecursive(value);
            }
        } else {
            if(right == null){
                right = new BinarySearchTree(value);
            } else {
                return right.insertRecursive(value);
            }
        }
        return this;
    }

    public BinarySearchTree insert(int value) {
        BinarySearchTree binarySearchTree = this;
        while(true){
            if(value < binarySearchTree.value){
                if(binarySearchTree.left == null){
                    binarySearchTree.left = new BinarySearchTree(value);
                    break;
                }else{
                    binarySearchTree = binarySearchTree.left;
                }
            }else{
                if(binarySearchTree.right == null){
                    binarySearchTree.right = new BinarySearchTree(value);
                    break;
                }else{
                    binarySearchTree = binarySearchTree.right;
                }
            }
        }
        return this;
    }

    public void insert(int[] values, int i) {
        if (i >= values.length) {
            return;
        }
        ArrayDeque<BinarySearchTree> queue = new ArrayDeque<>();
        queue.addLast(this);
        while (queue.size() > 0) {
            BinarySearchTree current = queue.pollFirst();
            if (current.left == null) {
                current.left = new BinarySearchTree(values[i]);
                break;
            }
            queue.addLast(current.left);
            if (current.right == null) {
                current.right = new BinarySearchTree(values[i]);
                break;
            }
            queue.addLast(current.right);
        }
        insert(values, i + 1);
    }

    public boolean contains(int value) {
        if(value < this.value) {
            if(left == null){
                return false;
            } else {
                return left.contains(value);
            }
        } else if (value > this.value) {
            if(right == null){
                return false;
            } else {
                return right.contains(value);
            }
        } else {
            return true;
        }
    }

    public void remove(int value) {
        remove(value,null);
    }

    private void remove(int value, BinarySearchTree parent){
        if(value < this.value){
            if(left != null){
                left.remove(value, this);
            }
        }
        else if( value > this.value){
            if(right != null){
                right.remove(value,this);
            }
        }
        else{
            if (left != null && right != null){
                this.value = right.getMinValue();
                right.remove(this.value, this);
            }
            else if(parent == null){
                if(left != null){
                    this.value = left.value;
                    right = left.right;
                    left = left.left;
                }
                else if(right != null){
                     this.value = right.value;
                     left = right.left;
                     right = right.right;
                }
            }
            else if(parent.left == this){
                parent.left = left != null ? left : right;
            }
            else if (parent.right == this){
                parent.right = left != null ? left : right;
            }
        }
    }
    private int getMinValue(){
        return (left == null) ? this.value : left.getMinValue();
    }

    public BinarySearchTree insert(List<Integer> values) {
        return insert(values, 0);
    }

    public static int getTreeHeight(BinarySearchTree tree) {
        return getTreeHeight(tree, 0);
    }

    static int getTreeHeight(BinarySearchTree tree, int height) {
        if (tree == null) return height;
        int leftTreeHeight = getTreeHeight(tree.left, height + 1);
        int rightTreeHeight = getTreeHeight(tree.right, height + 1);
        return Math.max(leftTreeHeight, rightTreeHeight);
    }

    public static List<Integer> inOrderTraverse(BinarySearchTree tree, List<Integer> array) {
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static BinarySearchTree testTree(){
        BinarySearchTree root = new BinarySearchTree(10);
        root.left = new BinarySearchTree(5);
        root.left.left = new BinarySearchTree(2);
        root.left.left.left = new BinarySearchTree(1);
        root.left.right = new BinarySearchTree(5);
        root.right = new BinarySearchTree(15);
        root.right.left = new BinarySearchTree(13);
        root.right.left.right = new BinarySearchTree(14);
        root.right.right = new BinarySearchTree(22);
        return root;
    }

    public void invert() {
        ArrayDeque<BinarySearchTree> queue = new ArrayDeque<>();
        queue.addLast(this);
        while(queue.size() > 0){
            BinarySearchTree current = queue.pollFirst();
            swap(current);
            if(current.left != null){
                queue.addLast(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }

    private static void swap(BinarySearchTree tree){
        BinarySearchTree left = tree.left;
        tree.left = tree.right;
        tree.right = left;
    }

    private BinarySearchTree insert(List<Integer> values, int i) {
        if (i >= values.size()) return null;

        List<BinarySearchTree> queue = new ArrayList<>();
        queue.add(this);
        while (queue.size() > 0) {
            BinarySearchTree current = queue.get(0);
            queue.remove(0);
            if (current.left == null) {
                current.left = new BinarySearchTree(values.get(i));
                break;
            }
            queue.add(current.left);
            if (current.right == null) {
                current.right = new BinarySearchTree(values.get(i));
                break;
            }
            queue.add(current.right);
        }
        insert(values, i + 1);
        return this;
    }
}