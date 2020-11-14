package main.PalindromeCheck;

public class LongestPalindrome {
    public static String longestPalindromicSubstring(String str) {
        String longest = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String substring = str.substring(i,j+1);
                if(substring.length() > longest.length() && PalindromeCheck.isPalindrome(substring)){
                    longest=substring;
                }
            }
        }
        return longest;
    }
}
