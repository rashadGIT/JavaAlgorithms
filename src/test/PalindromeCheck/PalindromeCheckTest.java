package test.PalindromeCheck;

import main.PalindromeCheck.PalindromeCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckTest {
    String str = "radar";

    @Test
    void TestCase1() {
        assertTrue(PalindromeCheck.isPalindrome(str));
    }


    @Test
    void TestCase2() {
        assertTrue(PalindromeCheck.isPalindromeRecursive(str, 0));
    }

    @Test
    void TestCase3() {
        assertTrue(PalindromeCheck.isPalindromeVanilla(str));
    }

    @Test
    void ReverseString() {
        assertEquals(PalindromeCheck.reverse(str), str);
    }

    @Test
    void ReverseString2() {
        assertEquals(PalindromeCheck.reverseVanilla(str), str);
    }

    @Test
    void ReverseInt() {
        assertEquals(PalindromeCheck.reverse(123), 321);
    }
    @Test
    void PalindromeSum() {
        assertTrue(PalindromeCheck.isSumPalindrome(121));
    }

}
