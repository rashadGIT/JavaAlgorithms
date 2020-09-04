import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Coin {
    /*
    * You are given coins of different denominations and a
    * total amount of money amount. Write a function to compute
    * the fewest number of coins that you need to make up that
    * amount. If that amount of money cannot be made up by
    * any combination of the coins, return -1.
    * */
    public static void main(String[] args) {
//        List<Integer> coins = Arrays.asList(2, 5, 2, 25);
        int amount = 6249;
        int[] coins = {186,419,83,408};
        System.out.println(coinChange(0,coins,amount));

    }

    private static int calulate (int[] coins, int amount){
        int count = 0;
        Arrays.sort(coins);
        coins = reverseArray(coins, coins.length);
        int[] denominations = Arrays.stream(coins).distinct().toArray();
        for (Integer i: denominations) {
            int remainder = amount % i;
            if(amount >= i){
                int val = amount - remainder;
                count = count + (val / i);
                amount = amount - val;
            }
        }
        if(amount > 0) return -1;
        return count;
    }

    private static int calulate (List<Integer> coins, int amount){
        int count = 0;
        Collections.sort(coins);
        Collections.reverse(coins);
        List<Integer> denominations  = coins.stream().distinct().collect(Collectors.toList());
        for (Integer i: denominations) {
            int remainder = amount % i;
            if(amount >= i){
                int val = amount - remainder;
                count = count + (val / i);
                amount = amount - val;
            }
        }
        if(amount > 0) return -1;
        return count;
    }

    private static int[] reverseArray(int[] intArray, int size)
    {
        int k, temp;
        for (int i = 0; i < size / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[size - i - 1];
            intArray[size - i - 1] = temp;
        }
        return intArray;
    }

    private static int coinChange(int idxCoin, int[] coins, int amount) {
        if (amount == 0) return 0;
        if (idxCoin < coins.length && amount > 0) {
            int maxVal = amount/coins[idxCoin];
            int minCost = Integer.MAX_VALUE;
            for (int x = 0; x <= maxVal; x++) {
                if (amount >= x * coins[idxCoin]) {
                    int res = coinChange(idxCoin + 1, coins, amount - x * coins[idxCoin]);
                    if (res != -1)
                        minCost = Math.min(minCost, res + x);
                }
            }
            return (minCost == Integer.MAX_VALUE)? -1: minCost;
        }
        return -1;
    }
}
