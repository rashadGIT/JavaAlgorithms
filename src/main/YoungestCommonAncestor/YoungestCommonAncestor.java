package main.YoungestCommonAncestor;

import domain.AncestralTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class YoungestCommonAncestor {

    public static void main(String[] args) {
        HashMap<Character, AncestralTree> trees = AncestralTree.getTrees();
        System.out.println(getYoungestCommonAncestor(trees.get('A'), trees.get('E'), trees.get('I')));
    }

    public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
        int depthOne = getDescendantDepth(descendantOne, topAncestor);
        int depthTwo = getDescendantDepth(descendantTwo, topAncestor);
        if(depthOne > depthTwo){
            return backtrackAncestralTree(descendantOne, descendantTwo, depthOne - depthTwo);
        }
        return backtrackAncestralTree(descendantTwo, descendantOne, depthTwo - depthOne);
    }

    public static int getDescendantDepth(AncestralTree descendant, AncestralTree topAncestor){
        int depth = 0;
        while(descendant != topAncestor){
            depth++;
            descendant = descendant.ancestor;
        }
        return depth;
    }

    public static AncestralTree backtrackAncestralTree(AncestralTree lowerDescendant, AncestralTree higherDescendant, int diff){
        while(diff > 0){
            lowerDescendant = lowerDescendant.ancestor;
            diff--;
        }

        while(lowerDescendant != higherDescendant){
            lowerDescendant = lowerDescendant.ancestor;
            higherDescendant = higherDescendant.ancestor;
        }
        return lowerDescendant;
    }
}
