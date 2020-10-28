package main.NodeDepths;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import domain.BinarySearchTree;
import domain.Level;

public class NodeDepths {
    public static void main(String[] args) {
        int start = 1;
        List<Integer> nodes = IntStream.range(start + 1,start + 9).boxed().collect(Collectors.toList());
        BinarySearchTree root = new BinarySearchTree(start).insert(nodes);
        System.out.println(nodeDepthsIterator(root));
    }

    public static int nodeDepths(BinarySearchTree root) {
        return getDepth(root, 0);
    }

    public static int nodeDepthsIterator(BinarySearchTree root) {
        int sumOfDepth = 0;
        List<Level> stack = new ArrayList<>();
        stack.add(new Level(root,0));
        while (stack.size() > 0){
            Level top = stack.remove(stack.size() - 1);
            BinarySearchTree node = top.root;
            int depth = top.depth;
            if(node == null) continue;;
            sumOfDepth = sumOfDepth + depth;
            stack.add(new Level(node.left, depth + 1));
            stack.add(new Level(node.right, depth + 1));
        }
        return sumOfDepth;
    }

    private static int getDepth(BinarySearchTree root, int depth){
        if(root == null) return 0;
        return depth + getDepth(root.left, depth + 1) + getDepth(root.right, depth + 1);
    }


}