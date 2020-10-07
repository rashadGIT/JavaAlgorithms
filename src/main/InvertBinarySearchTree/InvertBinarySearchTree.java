package main.InvertBinarySearchTree;

import domain.BinarySearchTree;
import java.util.ArrayDeque;

public class InvertBinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(1);
        tree.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
        invertBinarySearchTreeRecursive(tree);
        invertBinarySearchTree(tree);
    }

    public static void invertBinarySearchTree(BinarySearchTree tree) {
      ArrayDeque<BinarySearchTree> queue = new ArrayDeque<>();
      queue.addLast(tree);
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

    public static void invertBinarySearchTreeRecursive(BinarySearchTree tree) {
        if(tree == null) return;
        swap(tree);
        invertBinarySearchTreeRecursive(tree.left);
        invertBinarySearchTreeRecursive(tree.right);
    }

    private static void swap(BinarySearchTree tree){
        BinarySearchTree left = tree.left;
        tree.left = tree.right;
        tree.right = left;
    }
}