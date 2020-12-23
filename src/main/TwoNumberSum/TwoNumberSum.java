package main.TwoNumberSum;

import java.util.Arrays;
import java.util.Hashtable;

public class TwoNumberSum {

    public static void main(String[] args) {
        int [] x = twoNumberSumSort(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        for (int aX : x) {
            System.out.println(aX);
        }
    }

    private static int[] twoNumberSumHashTable(int[] array, int targetSum) {
        Hashtable<Integer, Boolean> numbers = new Hashtable<Integer, Boolean>();
        for (int x : array) {
            int y = targetSum - x;
            if(numbers.containsKey(y)){
                return new int[] {x , y};
            }
            else {
                numbers.put(x,true);
            }
        }
        return new int[0];
    }

    private static int[] twoNumberSum(int[] array, int targetSum) {
        for(int i = 0; i < array.length - 1; i++){
            for(int x = 0; x < array.length; x++){
                if(i == x){continue;}
                if((array[i] + array[x]) == targetSum){
                    return new int[] {array[i], array[x]};
                }
            }
        }
        return new int[0];
    }

    private static int[] twoNumberSumSort(int [] array, int targetSum){
        Arrays.sort(array);
        int LP = 0;
        int RP = array.length -1 ;
        while(LP != RP){
            int sum = array[LP] + array[RP];
            if(sum == targetSum){
                return new int[] {array[LP], array[RP]};
            }
            else if(sum < targetSum){
                LP++;
            }
            else if(sum > targetSum){
                RP--;
            }
        }
        return new int[0];
    }

}
