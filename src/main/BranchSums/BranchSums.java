package main.BranchSums;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import domain.BinarySearchTree;

public class BranchSums {
    public static void main(String[] args) {
        int start = 1;
        List<Integer> nodes = IntStream.range(start + 1,start + 15).boxed().collect(Collectors.toList());
        BinarySearchTree root = new BinarySearchTree(start).insert(nodes);
        System.out.println(branchSums(root));
        System.out.println(getNumOfBranches(root));
    }

    private static int getNumOfBranches(BinarySearchTree root){
        return branchSums(root).size();
    }

    public static List<Integer> branchSums(BinarySearchTree root) {
        List<Integer> sums = new ArrayList<>();
        calculateBranchSums(root, 0 , sums);
        return sums;
    }

    private static void calculateBranchSums(BinarySearchTree node, int runningSum, List<Integer> sums){
        if (node == null) return;

        int newRunningSum = runningSum + node.value;
        if(node.left == null && node.right == null){
            sums.add(newRunningSum);
            return;
        }

        calculateBranchSums(node.left, newRunningSum, sums);
        calculateBranchSums(node.right, newRunningSum, sums);
    }
}