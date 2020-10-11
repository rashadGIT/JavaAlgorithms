package test.LevenshteinDistance;

import main.LevenshteinDistance.LevenshteinDistance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LevenshteinDistanceTest {

    String str1 = "abc";
    String str2 = "Hello";
    int actual = 5;

    @Test
    public void TestCase1() {
        assertEquals(LevenshteinDistance.levenshteinDistance(str1, str2), actual);
    }

    @Test
    public void TestCase2() {
        assertEquals(LevenshteinDistance.levenshteinDistanceComplex(str1, str2), actual);
    }
}
