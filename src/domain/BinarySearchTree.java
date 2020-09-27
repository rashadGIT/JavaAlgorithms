package domain;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public static void main(String[] args) {
        BinaryTree root = BinaryTree.testTree();
        System.out.println(root.contains(100));

    }

    public BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinaryTree insert(int value) {
        // Write your code here.
        // Do not edit the return statement of this method.
        return this;
    }

    public boolean contains(int value) {
        if(value < this.value) {
            if(this.left == null){
                return false;
            } else {
                return this.left.contains(value);
            }
        } else if (value > this.value) {
            if(this.right == null){
                return false;
            } else {
                return right.contains(value);
            }
        } else {
            return false;
        }
    }

    public BinaryTree remove(int value) {
        // Write your code here.
        // Do not edit the return statement of this method.
        return this;
    }

    public BinaryTree insert(List<Integer> values) {
        return insert(values, 0);
    }

    public static BinaryTree testTree(){
        BinaryTree root = new BinaryTree(10);
        root.left = new BinaryTree(5);
        root.left.left = new BinaryTree(2);
        root.left.left.left = new BinaryTree(1);
        root.left.right = new BinaryTree(5);
        root.right = new BinaryTree(15);
        root.right.left = new BinaryTree(13);
        root.right.left.right = new BinaryTree(14);
        root.right.right = new BinaryTree(22);
        return root;
    }

    private BinaryTree insert(List<Integer> values, int i) {
        if (i >= values.size()) return null;

        List<BinaryTree> queue = new ArrayList<>();
        queue.add(this);
        while (queue.size() > 0) {
            BinaryTree current = queue.get(0);
            queue.remove(0);
            if (current.left == null) {
                current.left = new BinaryTree(values.get(i));
                break;
            }
            queue.add(current.left);
            if (current.right == null) {
                current.right = new BinaryTree(values.get(i));
                break;
            }
            queue.add(current.right);
        }
        insert(values, i + 1);
        return this;
    }
}