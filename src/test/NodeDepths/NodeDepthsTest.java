package test.NodeDepths;

import main.NodeDepths.NodeDepths;
import domain.BinarySearchTree;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeDepthsTest {

    @Test
    void TestCase1() {
        List<Integer> nodes = IntStream.range(2,10).boxed().collect(Collectors.toList());
        BinarySearchTree root = new BinarySearchTree(1).insert(nodes);
        int actual = NodeDepths.nodeDepths(root);
        assertEquals(16, actual);
    }

    @Test
    void TestCase2() {
        List<Integer> nodes = IntStream.range(2,10).boxed().collect(Collectors.toList());
        BinarySearchTree root = new BinarySearchTree(1).insert(nodes);
        int actual = NodeDepths.nodeDepthsIterator(root);
        assertEquals(16, actual);
    }
}
