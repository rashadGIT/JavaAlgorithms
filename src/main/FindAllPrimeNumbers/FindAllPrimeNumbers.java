package main.FindAllPrimeNumbers;

import java.util.ArrayList;
import java.util.List;

public class FindAllPrimeNumbers {

    public static void main (String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(10000);
        numbers.add(100000);
        for(Integer  num : numbers){
            System.out.println("n="+ num + " -> result=" + getAllPrimeNumbers(num));
        }
    }


    public static int getAllPrimeNumbers(int  num){
        int count = 0;
        for(int i = 0; i <= num; i++) {
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int i){
        int counter=0;
        for(int num = 1; num <= i; num++){
            if(i%num == 0) {
                counter++;
            }
        }
        return counter == 2;
    }
}
