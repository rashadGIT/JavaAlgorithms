package test.BranchSums;

// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import domain.BinaryTree;
import main.BranchSums.BranchSums;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BranchSumTest {

    @Test
    void TestCase1() {
        BinaryTree tree = new BinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expected = new ArrayList<>(Arrays.asList(15, 16, 18, 10, 11));
        assertEquals(expected, BranchSums.branchSums(tree));
    }
}
