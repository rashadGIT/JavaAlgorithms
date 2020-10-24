package main.MinNumberOfCoinsForChange;

import java.util.Arrays;

public class MinNumberOfCoinsForChange {

    public static void main(String[] args) {
        int[] input = {1, 5, 10};
        System.out.println(minNumberOfCoinsForChange(7,input));
    }

    public static int minNumberOfCoinsForChange(int n, int[] denominations) {
        int[] numOfCoins = new int[n + 1];
        Arrays.fill(numOfCoins,Integer.MAX_VALUE);
        numOfCoins[0] = 0;
        int compare;
        for(int denomination : denominations){
            for(int amount = 0; amount < numOfCoins.length; amount++){
                if(denomination <= amount){
                    if(numOfCoins[amount - denomination] == Integer.MAX_VALUE){
                        compare = numOfCoins[amount - denomination];
                    }
                    else{
                        compare = numOfCoins[amount - denomination] + 1;
                    }
                    numOfCoins[amount] = Math.min(numOfCoins[amount], compare);
                }
            }
        }
        return numOfCoins[n] != Integer.MAX_VALUE ? numOfCoins[n] : -1;
    }
}
