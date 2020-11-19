package test.GroupAnagrams;

import main.GroupAnagrams.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupAnagramsTest {
    @Test
    public void TestCase1() {
        List<String> words = new ArrayList<>(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("yo", "oy")));
        expected.add(new ArrayList<>(Arrays.asList("flop", "olfp")));
        expected.add(new ArrayList<>(Arrays.asList("act", "tac", "cat")));
        expected.add(new ArrayList<>(Collections.singletonList("foo")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    public boolean compare(List<List<String>> expected, List<List<String>> output) {
        if (expected.size() != output.size()) return false;

        for (List<String> group : expected) {
            Collections.sort(group);
            if (!output.contains(group)) return false;
        }

        return true;
    }
}
