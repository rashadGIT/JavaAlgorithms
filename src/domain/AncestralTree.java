package domain;

import java.util.HashMap;

public class AncestralTree {
    public char name;
    public AncestralTree ancestor;

    AncestralTree(char name) {
        this.name = name;
        this.ancestor = null;
    }

    // This method is for testing only.
    public void addAsAncestor(AncestralTree[] descendants) {
        for (AncestralTree descendant : descendants) {
            descendant.ancestor = this;
        }
    }

    public static HashMap<Character, AncestralTree> getTrees() {
        HashMap<Character, AncestralTree> trees = new HashMap<>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (char a : alphabet.toCharArray()) {
            trees.put(a, new AncestralTree(a));
        }

        trees.get('A').addAsAncestor(new AncestralTree[] {trees.get('B'), trees.get('C'), trees.get('D'), trees.get('E'), trees.get('F')});
        trees.get('A').addAsAncestor(new AncestralTree[] {trees.get('B'), trees.get('C')});
        trees.get('B').addAsAncestor(new AncestralTree[] {trees.get('D'), trees.get('E')});
        trees.get('D').addAsAncestor(new AncestralTree[] {trees.get('H'), trees.get('I')});
        trees.get('C').addAsAncestor(new AncestralTree[] {trees.get('F'), trees.get('G')});
        return trees;
    }
}