package test.PalindromeCheck;

import main.PalindromeCheck.LongestPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestPalindromeTest {
    @Test
    public void TestCase1() {
        assertTrue(LongestPalindrome.longestPalindromicSubstring("abaxyzzyxf").equals("xyzzyx"));
    }
}
