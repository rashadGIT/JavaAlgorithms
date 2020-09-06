package test.Coin;

import org.junit.jupiter.api.Test;
import main.Coin.Coin;


import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinTest {

    @Test
    void TestCase1() {
        int amount = 6249;
        int[] coins = {186,419,83,408};
        int actual = Coin.coinChange(0,coins,amount);
        assertEquals(20, actual);
    }
}
