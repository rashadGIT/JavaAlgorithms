package domain;

import java.util.ArrayDeque;

public class InvertedBinaryTree {
    public int value;
    public InvertedBinaryTree left;
    public InvertedBinaryTree right;

    public InvertedBinaryTree(int value) {
        this.value = value;
    }

    public void insert(int[] values, int i) {
        if (i >= values.length) {
            return;
        }
        ArrayDeque<InvertedBinaryTree> queue = new ArrayDeque<>();
        queue.addLast(this);
        while (queue.size() > 0) {
            InvertedBinaryTree current = queue.pollFirst();
            if (current.right == null) {
                current.right = new InvertedBinaryTree(values[i]);
                break;
            }
            queue.addLast(current.right);
            if (current.left == null) {
                current.left = new InvertedBinaryTree(values[i]);
                break;
            }
            queue.addLast(current.left);
        }
        insert(values, i + 1);
    }

    public static boolean compareBT(BinarySearchTree tree1, InvertedBinaryTree tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 != null && tree2 != null) {
            return tree1.value == tree2.value
                    && compareBT(tree1.left, tree2.left)
                    && compareBT(tree1.right, tree2.right);
        }
        return false;
    }
}