package main.Coin;

public class Coin {
    /*
    * You are given coins of different denominations and a
    * total amount of money amount. Write a function to compute
    * the fewest number of coins that you need to make up that
    * amount. If that amount of money cannot be made up by
    * any combination of the coins, return -1.
    * */
    public static void main(String[] args) {
        int amount = 6249;
        int[] coins = {186,419,83,408};
        System.out.println(coinChange(0,coins,amount));
    }

    public static int coinChange(int idxCoin, int[] coins, int amount) {
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
