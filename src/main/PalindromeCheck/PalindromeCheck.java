package main.PalindromeCheck;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "radar";
        if(isPalindrome(str)){
            System.out.println(str +" and it sum " + (reverse(str)) +" are palindrome.");
        }
    }

    public static boolean isPalindrome(int a){
        return reverse(a) == a;
    }

    public static boolean isPalindrome(String a){
        return reverse(a).equals(a);
    }

    public static boolean isPalindromeVanilla(String a){
        int start = 0;
        int end = a.length() - 1;
        while (start < end){
            if(a.charAt(start) != a.charAt(end)){
               return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String a, int i){
        int j  = a.length() - 1 - i;
        return i >= j || a.charAt(i) == a.charAt(j) && isPalindromeRecursive(a, i + 1);
    }


    public static int reverse(int a){
        List<Character> num  = String.valueOf(a).chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        Collections.reverse(num);
        return Integer.parseInt(num.stream().map(String::valueOf).collect(Collectors.joining()));
    }

    public static String reverse(String a){
        StringBuilder input = new StringBuilder();
        input.append(a);
        return input.reverse().toString();
    }

    public static String reverseVanilla(String a){
        StringBuilder str = new StringBuilder();
        for(int i = a.length() - 1; i >= 0; i-- ){
            str.append(a.charAt(i));
        }
        return str.toString();
    }

    public static boolean isSumPalindrome(int a){
        int b = reverse(a);
        if (a != b) return false;
        return isPalindrome(a + b);
    }

}
