package main.NumberOfWaysToMakeChange;

public class NumberOfWaysToMakeChange {
    public static void main(String[] args) {
        int[] input = {1, 5};
        System.out.println(numberOfWaysToMakeChange(6,input));
    }

    public static int numberOfWaysToMakeChange(int n, int[] denominations) {
        int[] ways = new int[n+1];
        ways[0] = 1;
        for(int denomination : denominations){
            for(int amount = 0; amount < n+1; amount++){
                if(denomination <= amount){
                    ways[amount] += ways[amount - denomination];
                }
            }
        }
        return ways[n];
    }
}