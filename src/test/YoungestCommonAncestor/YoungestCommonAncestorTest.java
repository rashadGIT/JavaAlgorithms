package test.YoungestCommonAncestor;

import domain.AncestralTree;
import main.YoungestCommonAncestor.YoungestCommonAncestor;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertSame;

public class YoungestCommonAncestorTest {
    @Test
    public void TestCase1() {
        HashMap<Character, AncestralTree> trees = AncestralTree.getTrees();
        AncestralTree yca = YoungestCommonAncestor.getYoungestCommonAncestor(trees.get('A'), trees.get('E'), trees.get('I'));
        assertSame(yca, trees.get('B'));
    }
}
