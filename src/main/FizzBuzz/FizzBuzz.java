package main.FizzBuzz;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        System.out.println(getFizzOrBuzz(n));
    }

    public static List<String> getFizzOrBuzz(int n){
        List<String> val = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String temp = "";
            if(i % 3 == 0) temp = temp + "Fizz";
            if(i % 5 == 0) temp = temp + "Buzz";
            if(temp.isEmpty()) temp = String.valueOf(i);
            val.add(temp);
        }
        return val;
    }

    public static List<String> fizzBuzz(int n) {

        // ans list
        List<String> ans = new ArrayList<>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                // Divides by both 3 and 5, add FizzBuzz
                ans.add("FizzBuzz");
            } else if (divisibleBy3) {
                // Divides by 3, add Fizz
                ans.add("Fizz");
            } else if (divisibleBy5) {
                // Divides by 5, add Buzz
                ans.add("Buzz");
            } else {
                // Not divisible by 3 or 5, add the number
                ans.add(Integer.toString(num));
            }
        }

        return ans;
    }


}
