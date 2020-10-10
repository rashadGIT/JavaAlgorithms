package main.MinHeightBinaryTree;

import domain.BinarySearchTree;

import java.util.Arrays;
import java.util.List;

public class MinHeightBinaryTree {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        System.out.println(minHeightBinarySearchTree(array));
    }

    public static BinarySearchTree minHeightBinarySearchTree(List<Integer> array) {
        return minHeightBstHelper(array, 0 , array.size() - 1);
    }

    public static BinarySearchTree minHeightBstHelper(List<Integer> array, int start, int end){
        if(start > end) return null;
        int midIdx = (start + end) / 2;
        BinarySearchTree bst = new BinarySearchTree(array.get(midIdx));
        bst.left = minHeightBstHelper(array,start,midIdx - 1);
        bst.right = minHeightBstHelper(array,midIdx + 1, end);
        return bst;
    }
}